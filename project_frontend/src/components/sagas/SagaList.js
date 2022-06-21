import React from 'react'
import Saga from "./Saga"

const SagaList = ({sagas}) => {
    
    const sagaComponents = sagas.map(saga => {
        return <Saga
                    key={saga.id}
                    saga={saga}/>
    });

    
    return (
        <>
            <h1>Dragon Ball Z Saga List</h1>
            <hr/>
            {sagaComponents}
        </>
    );
}

export default SagaList