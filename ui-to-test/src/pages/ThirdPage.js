import React, {useEffect, useState} from 'react';
import './FirstPage.css';
import Preloader from "../common/Preloader";

function ThirdPage() {

    const [loading, setLoading] = useState(true);

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
        return <div>Third page</div>
    }
}

export default ThirdPage;