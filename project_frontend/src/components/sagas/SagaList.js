import React from 'react'
import Saga from "./Saga"

const SagaList = ({ sagas, deleteSaga }) => {

    return (

        <section className="cards">
            {sagas.map((saga) => (
                <Saga
                    key={saga.id}
                    saga={saga}
                    deleteSaga={deleteSaga} />
            ))}
        </section>
    );
}

export default SagaList