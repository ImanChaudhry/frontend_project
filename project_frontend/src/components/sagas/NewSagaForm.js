import React from 'react'
import { useState } from "react"

const NewSagaForm = ({postSaga, characters }) => {

    // const characterOptions = characters.map((character) => {
    //     return <option key={character.id} value={character.id}> {character.name}, {character.race} </option>
    // });

    const [stateSaga, setStateSaga] = useState(
        {
            name: "",
            series: "",
            episodes: "",
            releaseDate: "",
            // characters: []
        }
    )

    // const handleCharacters= (event) => {
    //     const characterId =  parseInt(event.target.value);
    //     console.log(characterId);
    //     const selectedCharacter = characters.find(character => character.id === characterId)
    //     setStateSaga((prev) => {
    //         console.log(setStateSaga)
    //         // debugger;
    //         prev.characters.push(selectedCharacter);
    //         return prev;
    //     });

        // const characterId =  parseInt(event.target.value);
        // const selectedCharacter = characters.find(character => character.id === characterId)
        // let copiedSaga = {...stateSaga};
        // copiedSaga.characters = selectedCharacter;
        // setStateSaga(copiedSaga);
    // }

    // useEffect(() => {
    //     console.log(stateSaga);
    // }, [stateSaga])

    const [newSeries, setNewSeries] = useState("");

    const handleSeries = (event) => {
        let selectedSeries = event.target.value;
        setNewSeries(selectedSeries);
        let copiedSaga = { ...stateSaga };
        copiedSaga.series = selectedSeries
        setStateSaga(copiedSaga);
    }

    const handleChange = (event) => {
        console.log(event);
        let propertyName = event.target.name;
        let copiedSaga = { ...stateSaga };
        copiedSaga[propertyName] = event.target.value;
        setStateSaga(copiedSaga);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();
        // console.log(stateCharacter);
        postSaga(stateSaga);
        // window.location.reload();
    }


    return (
        <form onSubmit={handleFormSubmit}>
            <hr />
            <h4>Add a New Saga:</h4>

            <input
                type="text"
                placeholder="Saga Name"
                name="name"
                onChange={handleChange}
                value={stateSaga.name}
            /><br />

            <select type="text" value={newSeries} onChange={handleSeries}>
                <option value="DragonBall">DragonBall</option>
                <option value="DragonBall_Z">DragonBall Z</option>
            </select><br />


            <input
                type="text"
                placeholder="Episodes"
                name="episodes"
                onChange={handleChange}
                value={stateSaga.episodes}
            /><br />


            <input
                type="text"
                placeholder="Release Date"
                name="releaseDate"
                onChange={handleChange}
                value={stateSaga.releaseDate}
            /><br />

            {/* <select
                type="text"
                onChange={handleCharacters}>
                <option>Select a Character</option>
                {characterOptions}
            </select> */}
            <br />
            <button type='submit'>Add</button>
        </form>
    )
}

export default NewSagaForm