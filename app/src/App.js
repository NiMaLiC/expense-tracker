import React, { Component } from 'react';
import { Route, BrowserRouter as Router, Routes  } from 'react-router-dom'
import Category from './Category';
import Home from './Home';
import Expense from './Expense';
import Income from './Income';


class App extends Component {
    state = {  }
    render() { 
        return ( 
          <>
               <Router>
                <Routes >
                     <Route path='/' exact={true} element={<Home></Home>}/>
                     {/* <Route path='/categories' exact={true} element={<Category></Category>}/> */}
                     <Route path='/expenses' exact={true} element={<Expense></Expense>}/>
                     <Route path='/income' exact={true} element={<Income></Income>}/>

                </Routes >
             </Router>
          
          </>
       
        );
    }
}
 
export default App;