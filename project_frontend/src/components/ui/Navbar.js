import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import "../../styles/Navbar.css";
import React from 'react';


const Navbar = () => {

    return (
        <>
          <div className="Nav">
  
            <div className='navbar'> 
            <h1 className='nav-logo'>Three of Might</h1>
        
              <ul className='nav-ul'>         
                <li><Link to='/'>Home</Link></li>
                <li><Link to='/gallery'>Gallery</Link></li>
                <li><Link to='/characters'>Characters</Link></li>
                <li><Link to='/sagas'>Sagas</Link></li>
                <li><Link to='/techniques'>Techniques</Link></li>
              </ul>
            </div>
          </div>
        </>
    );
}

export default Navbar;
