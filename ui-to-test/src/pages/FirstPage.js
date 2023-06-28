import React, {useEffect, useState} from 'react';
import './Page.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";
import NavigateButton from "../common/NavigateButton";

function FirstPage() {

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
                <div className="centered-text">First page</div>
                <div className="height-stub"/>
            </div>
            <div className="wrapper clearfix info">
                <div className="nav">
                    <ul>
                        <li>
                            <NavigateButton from="firstPage" to="secondPage" text="GO TO SECOND PAGE"/>
                        </li>
                        <br/>
                        <li>
                            <NavigateButton from="firstPage" to="thirdPage" text="GO TO THIRD PAGE"/>
                        </li>
                    </ul>
                </div>
                <div className="section">
                    <h2>Welcome to our site</h2>
                    <p>Here you will learn how to use Playwright...</p>
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

export default FirstPage;