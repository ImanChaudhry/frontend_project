import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import "../styles/Home.css";


const Home = () => {
    return (

        <div className='App'>
             <img className="logo-container" src="./images/logonew.png" 
                alt="Three of Might logo" />
<img className="dragonball" src="./images/Dragon-Ball-Logo.png" alt="Dragonball_Z logo"/>

        <div className='nav'>
                    <ul>         
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