import React, {useEffect, useState} from 'react';
import './FirstPage.css';
import Preloader from "../common/Preloader";
import {useLocation, useNavigate} from "react-router-dom";

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
        return <div class="vertical-center">
            <div>First page</div>
            <br/>
            <button onClick={() => navigate(currentPath.replace("firstPage", "secondPage"))}>
                <div>
                    GO TO SECOND PAGE
                </div>
            </button>
            <br/>
            <br/>
            <button onClick={() => navigate(currentPath.replace("firstPage", "thirdPage"))}>
                <div>
                    GO TO THIRD PAGE
                </div>
            </button>
        </div>
    }
}

export default FirstPage;