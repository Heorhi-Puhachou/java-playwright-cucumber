import React, {useEffect, useState} from 'react';
import './Page.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";

function SecondPage() {

    const [loading, setLoading] = useState(true);
    const navigate = useNavigate();
    const location = useLocation();
    const currentPath = location.pathname;

    const stopLoading = () => {
        setLoading(false);
    };

    useEffect(() => {
        if (loading) {
            setTimeout(() => {
                stopLoading();
            }, 2000);
        }
    }, []);


    if (loading) {
        return <Preloader/>;
    } else {
        return <div className="vertical-center horizontal-center">
            <div>Second page</div>
            <br/>
            <button onClick={() => navigate(currentPath.replace("secondPage", "firstPage"))}>
                <div>
                    GO TO FIRST PAGE
                </div>
            </button>
            <br/>
            <br/>
            <button onClick={() => navigate(currentPath.replace("secondPage", "thirdPage"))}>
                <div>
                    GO TO THIRD PAGE
                </div>
            </button>
            <br/>
            <br/>
            <input/>
            <br/>
            <br/>
            <input/>
            <br/>
            <br/>
            <input/>
        </div>
    }
}

export default SecondPage;