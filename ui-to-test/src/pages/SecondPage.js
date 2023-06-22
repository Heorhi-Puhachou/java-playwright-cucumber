import React, {useEffect, useState} from 'react';
import './FirstPage.css';
import Preloader from "../common/Preloader";

function SecondPage() {

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
        return <div>Second page</div>
    }
}

export default SecondPage;