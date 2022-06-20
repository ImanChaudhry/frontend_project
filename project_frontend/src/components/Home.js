import React from "react";
import { Slide } from 'react-slideshow-image';

function Home() {

    const slideImages = [
        {
            url: '',
            caption: ''
        },
        {
            url: '',
            caption: ''
        },
        {
            url: '',
            caption: ''
        },
        {
            url: '',
            caption: ''
        }
    ]

    return (
        <>
            <h2>Home Page</h2>
            <Slide autoplay transitiononDuration={500}>
                {slideImages.map((slideImage, index) => (
                    <div key={index}>
                        <div style={{ height: '100vh', backgroundImage: `url(${slideImage.url})` }}>
                            <div style={{
                                padding: 20,
                                width: 200,
                                borderBottomRightRadius: '20px',
                                boxShadow: '4px 5px rgba(0, 0, 0, 0.2)',
                                backgroundColor: 'rgba(255, 255, 255, 0.8)'
                            }}>
                                {slideImage.caption}
                            </div>
                        </div>
                    </div>
                ))}
            </Slide>
        </>
    )
}

export default Home;