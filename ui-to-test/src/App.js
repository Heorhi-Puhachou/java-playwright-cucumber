import {Route, Routes} from "react-router-dom";
import './App.css';
import FirstPage from "./pages/FirstPage";
import SecondPage from "./pages/SecondPage";
import ThirdPage from "./pages/ThirdPage";

function App() {
    return (
        <div className="App">
            <Routes>
                <Route path="" element={<FirstPage/>}/>
                <Route path="firstPage" element={<FirstPage/>}/>
                <Route path="secondPage" element={<SecondPage/>}/>
                <Route path="thirdPage" element={<ThirdPage/>}/>
            </Routes>
        </div>
    );
}

export default App;
