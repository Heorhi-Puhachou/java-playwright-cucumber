import React, {useEffect, useState} from 'react';
import './Page.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";
import NavigateButton from "../common/NavigateButton";

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
        return <div className="container">
            <div className="header">
                <div className="height-stub"/>
                <div className="centered-text">Third page</div>
                <div className="height-stub"/>
            </div>
            <div className="wrapper clearfix info">
                <div className="nav">
                    <ul>
                        <li>
                            <NavigateButton from="thirdPage" to="firstPage" text="GO TO FIRST PAGE"/>
                        </li>
                        <br/>
                        <li>
                            <NavigateButton from="thirdPage" to="secondPage" text="GO TO SECOND PAGE"/>
                        </li>
                    </ul>
                </div>
                <div className="section">
                    <div test-locator="list-with-name">
                        <div test-locator="list-name">LIST NAME</div>
                        <ul>
                            <li>
                                <div test-locator="position">1</div>
                                <div test-locator="value">First value</div>
                            </li>
                            <br/>
                            <li>
                                <div test-locator="position">2</div>
                                <div test-locator="value">Second value</div>
                            </li>
                            <br/>
                            <li>
                                <div test-locator="position">3</div>
                                <div test-locator="value">Third value</div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div className="footer">
                <div className="height-stub"/>
                <div className="centered-text">UI example</div>
                <div className="height-stub"/>
            </div>
        </div>
    }
}

export default ThirdPage;