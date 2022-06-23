import './App.css';
import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import Home from './components/Home';
import Gallery from './components/Gallery';
import CharacterContainer from './containers/CharacterContainer';
import SagaContainer from './containers/SagaContainer';
import TechniquesContainer from './containers/TechniquesContainer';



function App() {
  return (
    
      <Router>
          <Routes className="nav-options">
              <Route path='/' element={<Home />} />
              <Route path='/gallery' element={<Gallery />} />
            <Route path='/characters' element={<CharacterContainer />} />
            <Route path='/sagas' element={<SagaContainer />} />
              <Route path='/techniques' element={<TechniquesContainer />} />
            </Routes>
      </Router>

  );
}

export default App;
