import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import HomeContainer from './containers/HomeContainer';
import AboutContainer from './containers/AboutContainer';
import CharacterContainer from './containers/CharacterContainer';
import SagaContainer from './containers/SagaContainer';
import TechniquesContainer from './containers/TechniquesContainer';
import Home from './components/Home';
import About from './components/About';
import Character from './components/Character';
import Saga from './components/Saga';
import Techniques from './components/Techniques';
import { Fragment } from 'react';
import ScrollButton from './components/ScrollButton';
import { Content, Heading } from './components/ScrollButtonStyles';
import SearchBar from './components/SearchBar';


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
        <Route path='/character' element={<Character/>} />
        <Route path='/saga' element={<Saga/>} />
        <Route path='/techniques' element={<Techniques/>} />
      </Routes>
   
      </div>
    </Router>

    <Content />
    <ScrollButton />
    </>
  );
}

export default App;
