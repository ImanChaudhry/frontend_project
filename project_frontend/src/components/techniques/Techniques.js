import React from "react";

const Techniques = ({ technique, deleteTechnique }) => {

  const handleDeleteTechnique = () => {
    deleteTechnique(technique.id)
  }

  return (
    <>
      <h3>{technique.name}</h3>
      <p>Type: {technique.type}</p>
      <p>Characters: </p>
      <ul>
      {technique.persons.map((person, index) => <li key={index}>{person.name}</li>)}
      </ul>
      <button onClick={handleDeleteTechnique}>Delete!</button>
    </>

  )
}

export default Techniques;