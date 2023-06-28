import "./Preloader.css";
import React from "react";
import {useLocation, useNavigate} from "react-router-dom";

const NavigateButton = (props) => {

    const navigate = useNavigate();
    const location = useLocation();
    const currentPath = location.pathname;

    return <button className="menu-button"
                   onClick={() => navigate(currentPath.replace(props.from, props.to))}>
        <div>
            {props.text}
        </div>
    </button>;
}

export default NavigateButton;