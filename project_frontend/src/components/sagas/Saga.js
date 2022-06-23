import React from "react";

const Saga = ({ saga, deleteSaga }) => {

  const handleDeleteSaga = () => {
    deleteSaga(saga.id);
  }
  return (
    <div className="card">
      <div className="card-inner">
        <div className="card-front">
          <img src={saga.image} alt="Coming soon..." />
        </div>
        <div className="card-back">
          <button className="delete-btn" onClick={handleDeleteSaga}>X</button>
          <h1>{saga.name} </h1>
          <ul>
            <li>
              <strong>Series:</strong> <br />
              {saga.series}
            </li>
            <li>
              <strong>Episodes:</strong> <br />
              {saga.episodes}
            </li>
            <li>
              <strong>Release Date:</strong> <br />
              {saga.releaseDate}
            </li>
            <li>
              <strong>Characters:</strong>
              <ul>
                {saga.persons.map((person, index) => <li key={index}>{person.name}</li>)}
              </ul>
            </li>
          </ul>

        </div>

      </div>

    </div>
  )
}

export default Saga;
