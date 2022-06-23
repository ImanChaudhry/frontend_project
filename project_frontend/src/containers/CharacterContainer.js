import React from "react";
import { useEffect, useState } from "react";
import CharacterList from "../components/characters/CharacterList";
import NewCharacterForm from "../components/characters/NewCharacterForm";
import Search from "../components/ui/Search";
import Navbar from "../components/ui/Navbar";
import ScrollButton from '../components/ui/ScrollButton';
import { Content } from '../components/ui/ScrollButtonStyles';

const CharacterContainer = () => {

  const [characters, setCharacters] = useState([]);
  const [query, setQuery] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/persons?name=${query}`)
      .then(response => response.json())
      .then(data => setCharacters(data))
  }, [query]);

  const [sagas, setSagas] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/sagas")
      .then(response => response.json())
      .then(data => setSagas(data))
  }, []);

  const [techniques, setTechniques] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/techniques")
      .then(response => response.json())
      .then(data => setTechniques(data))
  }, []);

  const postCharacter = (newCharacter) => {
    fetch("http://localhost:8080/persons",
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newCharacter)
      })
      .then(response => response.json())
      .then(saveCharacter => setCharacters([...characters, saveCharacter]))
  }


  const deleteCharacter = (id) => {
    fetch("http://localhost:8080/persons/" + id, {
      method: "DELETE",
      headers: { "Content-Type": "application/json" }
    })
    setCharacters(characters.filter(character => character.id !== id))
  }


  return (
    <>
    <Navbar />
      <div className="characters">
          <NewCharacterForm className="form"
            sagas={sagas}
            techniques={techniques}
            postCharacter={postCharacter} />
          <Search getQuery={(q) => setQuery(q)} />
          <CharacterList
            characters={characters}
            deleteCharacter={deleteCharacter} />
    </div>
         <Content />
            <ScrollButton />
    </>
  )
}

export default CharacterContainer;