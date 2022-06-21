import React from "react";
import { useEffect, useState } from "react";
import SagaList from "../components/sagas/SagaList";

const SagaContainer = () => {

  const [sagas, setSagas] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/sagas")
      .then(response => response.json())
      .then(data => setSagas(data))
  }, []);

  return (
    <>
    <SagaList sagas={sagas} />
    </>
  );
}

export default SagaContainer;

