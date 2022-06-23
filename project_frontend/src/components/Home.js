import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import "../styles/Home.css";


const Home = () => {
    return (

        <div className='App'>
                <img className="logo-container" src="./images/logo3.png" 
                alt="Three of Might logo" />

                <p className='text'>"I could go one step farther If I wanted to" - Goku, DragonBall Z</p>

        <div className='nav'>
                    <ul>         
                        <button className='home-navbtn'><Link to='/'>Home</Link></button>
                        <button className='home-navbtn'><Link to='/gallery'>Gallery</Link></button>
                        <button className='home-navbtn'><Link to='/characters'>Characters</Link></button>
                        <button className='home-navbtn'><Link to='/sagas'>Sagas</Link></button>
                        <button className='home-navbtn'><Link to='/techniques'>Techniques</Link></button>
                    </ul>
                </div>
        </div>
    );
}

export default Home;