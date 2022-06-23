import React from "react";
import { useEffect, useState } from "react";
import SagaList from "../components/sagas/SagaList";
import NewSagaForm from "../components/sagas/NewSagaForm";
import Search from "../components/ui/Search";

const SagaContainer = () => {

  const [sagas, setSagas] = useState([]);
  const [query, setQuery] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/sagas?name=${query}`)
      .then(response => response.json())
      .then(data => setSagas(data))
  }, [query]);

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

  const deleteSaga = (id) => {
    fetch("http://localhost:8080/sagas/" + id, {
      method: "DELETE",
      headers: { "Content-Type": "application/json" }
    })
    setSagas(sagas.filter(saga => saga.id !== id))
  }

  return (
    <>
      <h1>Dragon Ball Z Saga List</h1>
      <hr />
      <Search getQuery={(q) => setQuery(q)} /><br /> <br />
      <SagaList
        sagas={sagas}
        deleteSaga={deleteSaga} /> <br /> <br /> <br /> <br />
      <NewSagaForm
        characters={characters}
        postSaga={postSaga}
      />
    </>
  );
}

export default SagaContainer;

