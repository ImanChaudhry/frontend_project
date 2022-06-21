import React from "react";

const Saga = ({ saga }) => {

  return (
    <>
     <h3>{saga.name}</h3>
      <p>Series: {saga.series}</p>
      <p>Episodes: {saga.episodes}</p>
      <p>Release Date: {saga.releaseDate}</p>
      <p>Characters: </p>
      <ul>
        {saga.persons.map((person, index) => <li key={index}>{person.name}</li>)}
  </ul>
    </>

  )
} 

export default Saga;