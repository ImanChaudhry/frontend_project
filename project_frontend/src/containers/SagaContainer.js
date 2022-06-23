import React from "react";
import { useEffect, useState } from "react";
import SagaList from "../components/sagas/SagaList";
import NewSagaForm from "../components/sagas/NewSagaForm";
import Search from "../components/ui/Search";
import Navbar from "../components/ui/Navbar";
import ScrollButton from '../components/ui/ScrollButton';
import { Content } from '../components/ui/ScrollButtonStyles';

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
     <Navbar />
      <Search getQuery={(q) => setQuery(q)} /><br/><br/>
      <SagaList
        sagas={sagas}
        deleteSaga={deleteSaga} />
      <NewSagaForm
        characters={characters}
        postSaga={postSaga}/>
         <Content />
      <ScrollButton />
    </>
  );
}

export default SagaContainer;

