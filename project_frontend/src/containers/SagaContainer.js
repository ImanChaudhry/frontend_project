import React from "react";
import { useEffect, useState } from "react";
import SagaList from "../components/sagas/SagaList";
import NewSagaForm from "../components/sagas/NewSagaForm";

const SagaContainer = () => {

  const [sagas, setSagas] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/sagas")
      .then(response => response.json())
      .then(data => setSagas(data))
  }, []);

  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/persons")
      .then(response => response.json())
      .then(data => setCharacters(data))
  }, []);

  const postSaga = (newSaga) => {
    fetch("http://localhost:8080/sagas",
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newSaga)
      })
      .then(response => response.json())
      .then(saveSaga => setSagas([...sagas, saveSaga]))
  }

  return (
    <>
      <NewSagaForm
        characters={characters}
        postSaga={postSaga}
      />
      <SagaList sagas={sagas} />
    </>
  );
}

export default SagaContainer;

