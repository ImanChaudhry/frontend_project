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


function App() {
  return (
    <>

<Router>
      <div className="App">
      <ul>
        <li><Link to='/'>Home</Link></li>
        <li><Link to='/about'>About</Link></li>
        <li><Link to='/character'>Characters</Link></li>
        <li><Link to='/saga'>Sagas</Link></li>
        <li><Link to='/techniques'>Techniques</Link></li>
      </ul>
      <Routes>
        <Route path='/' element={<Home/>} />
        <Route path='/about' element={<About/>} />
        <Route path='/character' element={<Character/>} />
        <Route path='/saga' element={<Saga/>} />
        <Route path='/techniques' element={<Techniques/>} />
      </Routes>
      </div>
    </Router>

    <HomeContainer />
    <AboutContainer />
    <CharacterContainer />
    <SagaContainer />
    <TechniquesContainer />
    </>
  );
}

export default App;
