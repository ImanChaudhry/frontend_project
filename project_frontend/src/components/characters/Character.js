import React from "react";

const Character = ({character}) => {

    return (
        <div>
            <h3>{character.name}</h3>
            <p>Age: {character.age}</p>
            <p>Race: {character.race}</p>
            <p>Series: {character.series}</p>
            <p>Planet: {character.planet}</p>
            <p>Saga: {character.saga.name}</p>
        </div>
    );
}

export default Character;