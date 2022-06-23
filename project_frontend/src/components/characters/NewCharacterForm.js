import React from 'react'
import { useState, useEffect } from "react"

const NewCharacterForm = ({ sagas, techniques, postCharacter }) => {

    const sagaOptions = sagas.map((saga) => {
        return <option key={saga.id} value={saga.id}> {saga.name}</option>
    });

    const techniqueOptions = techniques.map((technique) => {
        return <option key={technique.id} value={technique.id}> {technique.name}, {technique.type} </option>
    });

    const [stateCharacter, setStateCharacter] = useState(
        {
            name: "",
            age: 0,
            race: "",
            series: "",
            planet: "",
            saga: null,
            techniques: [],
        }
    )

    const [newSeries, setNewSeries] = useState("");

    const handleSeries = (event) => {
        let selectedSeries = event.target.value;
        setNewSeries(selectedSeries);
        let copiedCharacter = { ...stateCharacter };
        copiedCharacter.series = selectedSeries
        setStateCharacter(copiedCharacter);
    }

    const handleTechnique = (event) => {
        const techniqueId = parseInt(event.target.value);
        console.log(techniqueId);
        const selectedTechnique = techniques.find(technique => technique.id === techniqueId)
        //let copiedCharacter = {...stateCharacter}; //Creates a shallow copy
        //copiedCharacter.techniques = selectedTechnique;
        //setStateCharacter(copiedCharacter);
        setStateCharacter((prev) => {
            // console.log(selectedTechnique);
            // debugger;
            prev.techniques.push(selectedTechnique);
            return prev;
        });
        // console.log(copiedCharacter.techniques);
        // console.log(stateCharacter)
        //debugger;
    }

    useEffect(() => {
        console.log(stateCharacter);
    }, [stateCharacter])

    const handleChange = (event) => {
        console.log(event);
        let propertyName = event.target.name;
        let copiedCharacter = { ...stateCharacter };
        copiedCharacter[propertyName] = event.target.value;
        setStateCharacter(copiedCharacter);
    }

    const handleSaga = (event) => {
        const sagaId = parseInt(event.target.value);
        const selectedSaga = sagas.find(saga => saga.id === sagaId)
        let copiedCharacter = { ...stateCharacter };
        copiedCharacter.saga = selectedSaga;
        setStateCharacter(copiedCharacter);
    }



    const handleFormSubmit = (event) => {
        event.preventDefault();
        // console.log(stateCharacter);
        postCharacter(stateCharacter);
        // window.location.reload();
    }


    return (
        <form onSubmit={handleFormSubmit}>
            <hr />
            <br/>
            <h4> Add a New Character:</h4>
            <br/>

            <input
                type="text"
                placeholder="Character Name"
                name="name"
                onChange={handleChange}
                value={stateCharacter.name}
            /><br />

            <input
                type="text"
                placeholder="Age"
                name="age"
                onChange={handleChange}
                value={stateCharacter.age}
            /><br />

            <input
                type="text"
                placeholder="character race"
                name="race"
                onChange={handleChange}
                value={stateCharacter.race}
            /><br />


            {/* <input
                type="text"
                placeholder="Series"
                name="series"
                onChange={handleChange}
                value={stateCharacter.series}
            /><br /> */}
            <input
                type="text"
                placeholder="Planet"
                name="planet"
                onChange={handleChange}
                value={stateCharacter.planet}
            /><br />
            <select type="text" value={newSeries} onChange={handleSeries}>
                <option>Select a Series</option>
                <option value="DragonBall">DragonBall</option>
                <option value="DragonBall_Z">DragonBall_Z</option>
            </select><br />
            <select
                type="text"
                // placeholder="Saga"
                // name="saga"
                onChange={handleSaga}>
                {/* // value={stateCharacter.saga} */}
                <option>Select a Saga</option>
                {sagaOptions}
            </select>
            <br />

            <select
                type="text"
                onChange={handleTechnique}>
                <option>Select a Technique</option>
                {techniqueOptions}
            </select>
            <br />
            <br/>

            {/* <input
                type="text"
                placeholder="Techniques"
                name="techniques"
                onChange={handleChange}
                value={stateCharacter.techniques}
            /><br /> */}
            <button type='submit'>Add</button>
        </form>
    )
}

export default NewCharacterForm;