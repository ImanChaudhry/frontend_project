import React from "react";

const Techniques = ({ technique, deleteTechnique }) => {

  const handleDeleteTechnique = () => {
    deleteTechnique(technique.id)
  }

  return (
    <div className="card">
      <div className="card-inner">
        <div className="card-front">
          <img src="./images/dbz_ball.png" alt="" />
          <button onClick={handleDeleteTechnique}>Delete!</button>
        </div>
        <div className="card-back">
        <button className="delete-btn" onClick={handleDeleteTechnique}>X</button>
          <h1>{technique.name} </h1>
          <ul>
            <li>
              <strong>Type:</strong> <br />
              {technique.type}
            </li>
            <li>
              <strong>Characters:</strong> <br />
              <ul>
                {technique.persons.map((person, index) => <li key={index}>{person.name}</li>)}
              </ul>
            </li>
          </ul>

        </div>

      </div>

    </div>

  )
}

export default Techniques;
