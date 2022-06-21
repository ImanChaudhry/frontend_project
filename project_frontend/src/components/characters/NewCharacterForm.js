import React from 'react'
import { useState } from "react"

const NewCharacterForm = ({ postCharacter }) => {

    const[stateCharacter, setStateCharacter] = useState(
        {
            name: "",
            age: 0,
            race: "",
            series: ""
            // saga: "",
            // techniques: ""

        }
    )

    const handleChange = (event) => {
        console.log(event);
        let propertyName = event.target.name;
        let copiedCharacter = {...stateCharacter};
        copiedCharacter[propertyName] = event.target.value;
        setStateCharacter(copiedCharacter);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();
        postCharacter(stateCharacter);
    }


    return (
        <form onSubmit={handleFormSubmit}>
            <hr />
            <h4> Add a New Character:</h4>

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

            <input
                type="text"
                placeholder="Series"
                name="series"
                onChange={handleChange}
                value={stateCharacter.series}
            /><br />

            {/* <input
                type="text"
                placeholder="Saga"
                name="saga"
                onChange={handleChange}
                value={stateCharacter.saga}
            /><br />

            <input
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