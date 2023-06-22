import {Navigate, Route, Routes} from "react-router-dom";
import FirstPage from "./pages/FirstPage";
import SecondPage from "./pages/SecondPage";
import ThirdPage from "./pages/ThirdPage";

function App() {
    return (
        <div className="App">
            <Routes>
                <Route path="" element={<Navigate to={"firstPage"}/>}/>
                <Route path="firstPage" element={<FirstPage/>}/>
                <Route path="secondPage" element={<SecondPage/>}/>
                <Route path="thirdPage" element={<ThirdPage/>}/>
            </Routes>
        </div>
    );
}

export default App;
