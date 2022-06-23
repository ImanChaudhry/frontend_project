import { useEffect, useState } from "react";
import TechniquesList from "../components/techniques/TechniquesList";
import NewTechniqueForm from "../components/techniques/NewTechniqueForm";
import Search from "../components/ui/Search";
import Navbar from "../components/ui/Navbar";
import ScrollButton from '../components/ui/ScrollButton';
import { Content } from '../components/ui/ScrollButtonStyles';

const TechniquesContainer = () => {

  const [techniques, setTechniques] = useState([]);
  const [query, setQuery] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/techniques?name=${query}`)
      .then(response => response.json())
      .then(data => setTechniques(data))
  }, [query]);

  // const [characters, setCharacters] = useState([]);

  // useEffect(() => {
  //   fetch("http://localhost:8080/persons")
  //     .then(response => response.json())
  //     .then(data => setCharacters(data))
  // }, []);

  const postTechnique = (newTechnique) => {
    fetch("http://localhost:8080/techniques",
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newTechnique)
      })
      .then(response => response.json())
      .then(saveTechnique => setTechniques([...techniques, saveTechnique]))
  }

  const deleteTechnique = (id) => {
    fetch("http://localhost:8080/techniques/" + id, {
      method: "DELETE",
      headers: { "Content-Type": "application/json" }

    })
    setTechniques(techniques.filter(technique => technique.id !== id))
  }

  return (
    <>
    <Navbar />
      <Search getQuery={(q) => setQuery(q)} /><br/><br/>
      <TechniquesList
        techniques={techniques}
        deleteTechnique={deleteTechnique} />
      <NewTechniqueForm
        // character={characters}
        postTechnique={postTechnique} />
         <Content />
      <ScrollButton />
    </>
  )
}

export default TechniquesContainer;