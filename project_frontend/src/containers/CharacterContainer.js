import React from "react";
import { useEffect, useState } from "react";
import CharacterList from "../components/characters/CharacterList";
import NewCharacterForm from "../components/characters/NewCharacterForm";


const CharacterContainer = () => {

  const [characters, setCharacters] = useState([]);

  useEffect(() => {
      fetch("http://localhost:8080/persons")
      .then(response => response.json())
      .then(data => setCharacters(data))
  }, []);

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
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(newCharacter)
      })
      .then(response => response.json())
      .then(saveCharacter => setCharacters([...characters, saveCharacter]))
  }

  /* Iman - wrote delete
  
  const deleteCharacter = (id, name, etc.) => {

    fetch("url" + id + name, {
      method: "DELETE",
      headers: {"Content-Type": "application/json"}
    })
    setCharacters(character.filter(character => character.id !== id))
  }
  
  */

  return (
    <>
      <NewCharacterForm
        sagas={sagas}
        techniques={techniques}
        postCharacter={postCharacter} />
      <CharacterList
        characters={characters} />
    </>
  )
}

export default CharacterContainer;