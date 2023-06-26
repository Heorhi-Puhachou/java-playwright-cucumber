import React, {useEffect, useState} from 'react';
import './Page.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";

function ThirdPage() {

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
            <div>Third page</div>
            <br/>
            <button onClick={() => navigate(currentPath.replace("thirdPage", "firstPage"))}>
                <div>
                    GO TO FIRST PAGE
                </div>
            </button>
            <br/>
            <br/>
            <button onClick={() => navigate(currentPath.replace("thirdPage", "secondPage"))}>
                <div>
                    GO TO SECOND PAGE
                </div>
            </button>
            <br/>
            <br/>
            <div test-locator="list-with-name">
                <div test-locator="list-name">LIST NAME</div>
                <ul>
                    <li>
                        <div test-locator="position">1</div>
                        <div test-locator="value">First value</div>
                    </li>
                    <li>
                        <div test-locator="position">2</div>
                        <div test-locator="value">Second value</div>
                    </li>
                    <li>
                        <div test-locator="position">3</div>
                        <div test-locator="value">Third value</div>
                    </li>
                </ul>
            </div>
        </div>
    }
}

export default ThirdPage;