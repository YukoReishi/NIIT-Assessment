import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Chat from './Components/chat';
import Forms from './Components/Forms';
import Navbar from './Components/Navbar';

function App() {
  return (
    <div className="App">
      <Navbar />
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Forms />} />
          <Route path='/chat' element={<Chat />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;