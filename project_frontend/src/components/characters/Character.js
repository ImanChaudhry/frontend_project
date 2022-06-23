import React from "react";


const Character = ({ character, deleteCharacter }) => {

    const handleDeleteCharacter = () => {
        deleteCharacter(character.id);
    }

    return (
        <div className="card">
            <div className="card-inner">
                <div className="card-front">
                    <img src={character.image} alt="character image" />
                    <button onClick={handleDeleteCharacter}>Delete!</button>
                </div>
                <div className="card-back">
                    <h1>{character.name} <br/> <button onClick={handleDeleteCharacter}>Delete!</button></h1>
                    <ul>
                        <li>
                            <strong>Age:</strong> <br/>
                            {character.age}
                        </li>
                        <li>
                            <strong>Race:</strong> <br/>
                            {character.race}
                        </li>
                        <li>
                            <strong>Series:</strong> <br/>
                            {character.series}
                        </li>
                        <li>
                            <strong>Planet:</strong> <br/>
                            {character.planet}
                        </li>
                        <li>
                            <strong>Saga:</strong> <br/>
                            {character.saga.name}
                        </li>
                        <li>
                            <strong>Techniques:</strong>
                            <ul>
                                {character.techniques.map((technique, index) => <li key={index}>{technique.name}</li>)}
                            </ul>
                        </li>
                    </ul>

                </div>

            </div>

        </div>

    );
}

export default Character;


