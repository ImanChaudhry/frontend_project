import React from 'react'
import ImageSlider from "./ui/ImageSlider";
import { SliderData } from './ui/SliderData'


const Home = () => {
    return (
        <>
            <h2>Home Page</h2>
            <ImageSlider slides={SliderData} />
        </>
    )
}

export default Home