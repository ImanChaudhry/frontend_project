import React from 'react'
import { useState} from "react"

const NewTechniqueForm = ({characters, postTechnique}) => {

const [stateTechnique, setStateTechnique] = useState (
    {
        name: "",
        type: ""
    }
)

    const handleChange = (event) => {
        console.log(event);
        let propertyName = event.target.name;
        let copiedTechnique = { ...stateTechnique };
        copiedTechnique[propertyName] = event.target.value;
        setStateTechnique(copiedTechnique);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();
        postTechnique(stateTechnique);
        window.location.reload();
    }


return (
    <form onSubmit={handleFormSubmit}>
        <hr />
        <br/>
        <h4> Add a New Technique:</h4>
        <br/>
        <input
            type="text"
            placeholder="Technique Name"
            name="name"
            onChange={handleChange}
            value={stateTechnique.name}
        /><br />

        <input
            type="text"
            placeholder="Type"
            name="type"
            onChange={handleChange}
            value={stateTechnique.type}
        /><br /><br/>

        <button type="submit">Add</button>
    </form>
)
}

export default NewTechniqueForm;