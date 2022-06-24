import React from 'react'
import { useState } from "react"

const NewSagaForm = ({ postSaga, characters }) => {

    const [stateSaga, setStateSaga] = useState(
        {
            name: "",
            series: "",
            episodes: "",
            releaseDate: "",
        }
    )

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
        postSaga(stateSaga);
    }

    return (
        <form onSubmit={handleFormSubmit}>
            <hr />
            <br/>
            <h4>Add a New Saga:</h4>
            <br/>
            <input
                type="text"
                placeholder="Saga Name"
                name="name"
                onChange={handleChange}
                value={stateSaga.name}
            /><br />


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

            <select type="text" value={newSeries} onChange={handleSeries}>
                <option>Select a Series</option>
                <option value="DragonBall">DragonBall</option>
                <option value="DragonBall_Z">DragonBall Z</option>
            </select><br />
            <br />
            <button type='submit'>Add</button>
        </form>
    )
}

export default NewSagaForm