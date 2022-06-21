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

  return (
    <>
      <NewCharacterForm postCharacter={postCharacter} />
      <CharacterList characters={characters} />
    </>
  );
}

export default CharacterContainer;