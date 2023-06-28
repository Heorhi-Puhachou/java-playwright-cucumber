import React, {useEffect, useState} from 'react';
import './Page.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";
import NavigateButton from "../common/NavigateButton";

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
        return <div className="container">
            <div className="header">
                <div className="height-stub"/>
                <div className="centered-text">Second page</div>
                <div className="height-stub"/>
            </div>
            <div className="wrapper clearfix info">
                <div className="nav">
                    <ul>
                        <li>
                            <NavigateButton from="secondPage" to="firstPage" text="GO TO FIRST PAGE"/>
                        </li>
                        <br/>
                        <li>
                            <NavigateButton from="secondPage" to="thirdPage" text="GO TO THIRD PAGE"/>
                        </li>
                    </ul>
                </div>
                <div className="section">
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
            </div>
            <div className="footer">
                <div className="height-stub"/>
                <div className="centered-text">UI example</div>
                <div className="height-stub"/>
            </div>
        </div>
    }
}

export default SecondPage;