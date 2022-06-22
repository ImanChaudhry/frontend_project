import React from 'react'
import ImageSlider from "./ui/ImageSlider";
import { SliderData } from './ui/SliderData'


const Home = () => {
    return (
        <>
            <h2>Welcome to the world of DragonBall</h2>
            <p> Dragon Ball tells the tale of a young warrior by the name of Son Goku, 
                a young peculiar boy with a tail who embarks on a quest to become stronger 
                and learns of the Dragon Balls, when, once all 7 are gathered, 
                grant any wish of choice.</p>
            <br/>
            <ImageSlider slides={SliderData} />
        </>
    )
}

export default Home