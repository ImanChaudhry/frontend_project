import React from 'react'
import { useState} from "react"

const NewTechniqueForm = ({characters, postTechnique}) => {

    // const characterOptions = characters.map((character) => {
    //     return <option key={character.id} value={character.id}> {character.name} </option>
    // });

const [stateTechnique, setStateTechnique] = useState (
    {
        name: "",
        type: ""
        // characters: []
    }
)

// const handleCharacter = (event) => {
//     const characterId =  parseInt(event.target.value);
//     console.log(characterId);
//     const selectedCharacter = characters.find(character => character.id === characterId)
//     setStateTechnique((prev) => {
//         console.log(setStateTechnique)
//         // debugger;
//         prev.characters.push(selectedCharacter);
//         return prev;
//     });
// }
//     useEffect(() => {
//         console.log(stateTechnique);
//     }, [stateTechnique])


    const handleChange = (event) => {
        console.log(event);
        let propertyName = event.target.name;
        let copiedTechnique = { ...stateTechnique };
        copiedTechnique[propertyName] = event.target.value;
        setStateTechnique(copiedTechnique);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();
        // console.log(stateCharacter);
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

        {/* <select
            type="text"
            onChange={handleCharacter}>
                <option>Select a Character</option>
                {characterOptions}
            </select>
            <br /> */}

        <button type="submit">Add</button>
    </form>
)
}

export default NewTechniqueForm;