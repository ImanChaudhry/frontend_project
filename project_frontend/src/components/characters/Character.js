import React from "react";
// import CharacterContainer from '../../containers/CharacterContainer';

const Character = ({character, deleteCharacter}) => {

    const handleDeleteCharacter = () => {
        deleteCharacter(character.id);
    }

    return (
        <div>
            <h3>{character.name}</h3>
            <p>Age: {character.age}</p>
            <p>Race: {character.race}</p>
            <p>Series: {character.series}</p>
            <p>Planet: {character.planet}</p>
            <p>Saga: {character.saga.name}</p>
            <p>Techniques:</p>
            <ul>
                {character.techniques.map((technique, index) => <li key={index}>{technique.name}</li>)}
            </ul>
            <button onClick={handleDeleteCharacter}>Delete!</button>
        </div>
        
    );
}

export default Character;