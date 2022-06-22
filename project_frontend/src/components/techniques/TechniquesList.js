import React from "react";
import Techniques from "./Techniques";

const TechniquesList = ({techniques, deleteTechnique}) => {

    const techniqueComponents = techniques.map(technique => {
        return <Techniques
                  key={technique.id}
                  technique={technique}
                  deleteTechnique={deleteTechnique} />
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