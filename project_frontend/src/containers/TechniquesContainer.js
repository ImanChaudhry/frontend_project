import { useEffect, useState } from "react";
import TechniquesList from "../components/techniques/TechniquesList";
import NewTechniqueForm from "../components/techniques/NewTechniqueForm";

const TechniquesContainer = () => {

  const [techniques, setTechniques] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/techniques")
      .then(response => response.json())
      .then(data => setTechniques(data))
  }, []);

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
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(newTechnique)
      })
      .then(response => response.json())
      .then(saveTechnique => setTechniques([...techniques, saveTechnique]))
  }

  return (
    <>
      <NewTechniqueForm
      // character={characters}
        postTechnique={postTechnique} />
      <TechniquesList techniques={techniques} />
    </>
  )
}

export default TechniquesContainer;