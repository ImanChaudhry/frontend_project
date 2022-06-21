import React from "react";
import Techniques from "./Techniques";

const TechniquesList = ({techniques}) => {

    const techniqueComponents = techniques.map(technique => {
        return <Techniques
                  key={technique.id}
                  technique={technique} />
    });

    return (
        <>
            <h1>Dragon Ball Z Technique List</h1>
            <hr />
            {techniqueComponents}
        </>
    );
}

export default TechniquesList;