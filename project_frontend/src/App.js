import './App.css';
import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import { Fragment } from 'react';
import ScrollButton from './components/ui/ScrollButton';
import { Content, Heading } from './components/ui/ScrollButtonStyles';
import SearchBar from './components/ui/SearchBar';

import Home from './components/Home';
import About from './components/About';
// import Character from './components/characters/Character';
// import Saga from './components/sagas/Saga';
// import Techniques from './components/techniques/Techniques';

import CharacterContainer from './containers/CharacterContainer';
import SagaContainer from './containers/SagaContainer';
import TechniquesContainer from './containers/TechniquesContainer';


function App() {
  return (
    <>
      <Router>
        <div className="App">
          <img className="logo-container" src="images/logo2.png" alt="Three of Might logo" size="400x400" />

          <div className='navbar'>
            <ul>
              <li><Link to='/'>Home</Link></li>
              <li><Link to='/about'>About</Link></li>
              <li><Link to='/characters'>Characters</Link></li>
              <li><Link to='/sagas'>Sagas</Link></li>
              <li><Link to='/techniques'>Techniques</Link></li>
            </ul>
          </div>

          <SearchBar />
          <Routes className="nav-options">
              <Route path='/' element={<Home />} />
              <Route path='/about' element={<About />} />
              <Route path='/characters' element={<CharacterContainer />} />
              <Route path='/sagas' element={<SagaContainer />} />
              <Route path='/techniques' element={<TechniquesContainer />} />
          </Routes>

        </div>
      </Router>

      <Content />
      <ScrollButton />
    </>
  );
}

export default App;
