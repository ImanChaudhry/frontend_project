import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';

import Saga from './components/Saga';
import Techniques from './components/Techniques';
import { Fragment } from 'react';
import ScrollButton from './components/ui/ScrollButton';
import { Content, Heading } from './components/ui/ScrollButtonStyles';
import SearchBar from './components/ui/SearchBar';
import CharacterContainer from './containers/CharacterContainer';


function App() {
  return (
    <>

    <Router>
    <div className="App">
      
      <div className='navbar'>
      <ul>
        <li><Link to='/'>Home</Link></li>
        <li><Link to='/about'>About</Link></li>
        <li><Link to='/character'>Characters</Link></li>
        <li><Link to='/saga'>Sagas</Link></li>
        <li><Link to='/techniques'>Techniques</Link></li>
      </ul>
      </div>
      <img className="logo-container" src="images/Logo-transparent-background.png" alt="Three of Might logo" size="400x400"/>

      <SearchBar />
      <Routes className="nav-options">
        <Route path='/' element={<Home/>} />
        <Route path='/about' element={<About/>} />

        <Route path='/saga' element={<Saga/>} />
        <Route path='/techniques' element={<Techniques/>} />
      </Routes>
   
      </div>
    </Router>

    <CharacterContainer />
    <Content />
    <ScrollButton />
    </>
  );
}

export default App;
