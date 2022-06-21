import { useEffect, useState } from "react";
import TechniquesList from "../components/techniques/TechniquesList";

const TechniquesContainer = () => {

  const [techniques, setTechniques] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/techniques")
      .then(response => response.json())
      .then(data => setTechniques(data))
  }, []);

  return (
    <>
      <TechniquesList techniques={techniques} />
    </>
  )
}

export default TechniquesContainer;