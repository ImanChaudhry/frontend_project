import React from "react";
import Character from "./Character";


const CharacterList = ({characters, deleteCharacter}) => {
    
    const characterComponents = characters.map(character => {
        return <Character
                    key={character.id}
                    character={character}
                    deleteCharacter={deleteCharacter}/>
    });

    
    return (
        <>
            <h1>Dragon Ball Z Character List</h1>
            <hr/>
            {characterComponents}
        </>
    );
}

export default CharacterList;