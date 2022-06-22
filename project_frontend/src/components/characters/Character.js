import React from "react";


const Character = ({ character, deleteCharacter }) => {

    const handleDeleteCharacter = () => {
        deleteCharacter(character.id);
    }

    return (
        <div className="card">
            <div className="card-inner">
                <div className="card-front">
                    <img src="./images/Logo.jpg" alt="" />
                    <button onClick={handleDeleteCharacter}>Delete!</button>
                </div>
                <div className="card-back">
                    <h1>{character.name} </h1>
                        <li> 
                            <strong>Age:</strong> {character.age}
                        </li><br />
                        <li>
                            <strong>Race:</strong> {character.race}
                        </li>
                        <li>
                            <strong>Series:</strong> {character.series}
                        </li>
                        <li>
                            <strong>Planet:</strong> {character.planet}
                        </li>
                        <li>
                            <strong>Saga:</strong> {character.saga.name}
                        </li>
                        <li>
                            <strong>Techniques:</strong>
                            <ul>
                                {character.techniques.map((technique, index) => <li key={index}>{technique.name}</li>)}
                            </ul>
                        </li>

                </div>

            </div>

        </div>

    );
}

export default Character;


