import React from 'react'
import ImageSlider from "./ui/ImageSlider";
import { SliderData } from './ui/SliderData';
import Navbar from './ui/Navbar';
import "../styles/Gallery.css";


const Gallery = () => {
    return (
        <div className='gallery'>
            <Navbar />
            <h2 className='g-title'>Gallery</h2>
                <ImageSlider slides={SliderData} className="slide-bar"/>
                
        </div>
    )
}

export default Gallery;