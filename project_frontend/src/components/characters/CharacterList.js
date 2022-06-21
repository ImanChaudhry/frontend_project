import React from "react";
import Character from "./Character";


const CharacterList = ({characters}) => {
    
    const characterComponents = characters.map(character => {
        return <Character
                    key={character.id}
                    character={character} />
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