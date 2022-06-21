import React from "react";
import { useEffect, useState } from "react";
import CharacterList from "../components/characters/CharacterList";


const CharacterContainer = () => {

  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/persons")
      .then(response => response.json())
      .then(data => setCharacters(data))
  }, []);

  return (
    <>
      <CharacterList characters={characters} />
    </>
  );
}

export default CharacterContainer;