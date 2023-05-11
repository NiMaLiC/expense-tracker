import React, { Component } from 'react';
import {Nav,Navbar,NavItem,NavbarBrand, NavLink} from 'reactstrap';
import 'bootstrap/dist/css/bootstrap.min.css';


class AppNav extends Component {
    state = {  }
    render() {
        return (
          <div>
            <Navbar color="dark" dark  expand="md">
              <NavbarBrand href="/">Expense Tracker</NavbarBrand>
                <Nav className="ml-auto" navbar>
                  <NavItem>
                    <NavLink href="/">Home</NavLink>
                  </NavItem>
                  {/* <NavItem>
                    <NavLink href="/categories">Categories</NavLink>
                  </NavItem> */}
                  <NavItem>
                    <NavLink href="/expenses">Expense</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink href="/income">Income</NavLink>
                  </NavItem>
                
                </Nav>
          
            </Navbar>
          </div>
        );
      }
}
 
export default AppNav;