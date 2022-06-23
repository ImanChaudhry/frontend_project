import React from "react";
import Techniques from "./Techniques";

const TechniquesList = ({ techniques, deleteTechnique }) => {

    return (

        <section className="cards">
            {techniques.map((technique) => (
                <Techniques
                    key={technique.id}
                    technique={technique}
                    deleteTechnique={deleteTechnique} />
            ))}
        </section>
    );
}

export default TechniquesList;