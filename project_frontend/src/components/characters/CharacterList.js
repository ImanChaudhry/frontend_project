import React from "react";
import Character from "./Character";


const CharacterList = ({ characters, deleteCharacter }) => {

    return (

        <section className="cards">
            {characters.map((character) => (
                <Character
                    key={character.id}
                    character={character}
                    deleteCharacter={deleteCharacter} />
            ))}
        </section>
    );
}

export default CharacterList