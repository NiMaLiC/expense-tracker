import React, { Component } from 'react';
import AppNav from "./AppNav"
import background from "./img/background.jpg";

class Home extends Component {

    render() { 
        return (
            <div>
             <AppNav/>
             <h2 style={{ backgroundImage: `url(${background})`, 
               backgroundSize: 'cover',
               height: '100vh',
               width: '100vw',
               position: 'center' }}>              
              Welcome to Expense Tracker
               </h2>
              </div>
            );
    }

}

export default Home;