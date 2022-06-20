import React from "react";
import ImageSlider from "./ImageSlider";
import {SliderData} from './SliderData'

function Home() {

    return (
        <>
            <h2>Home Page</h2>
            <ImageSlider slides={SliderData}/>
        </>
    )
}

export default Home;