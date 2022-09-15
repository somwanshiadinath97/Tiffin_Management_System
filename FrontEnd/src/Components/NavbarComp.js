import React,{Component} from "react";
import {Navbar,Nav,NavDropdown,Form,FormControl,Button} from 'react-bootstrap';
import './navbarstyle.css';
import { Link } from 'react-router-dom';


export default class NavbarComp extends Component{
    render()
    {
        return(
            <div>
               <Navbar className="navbarclass" varient={"dark"} expand="lg">
      
        <Navbar.Brand href="#home"><div className="myclass">E-Dabba</div></Navbar.Brand>
        <div className="navbarclass">
             
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto" >
            <Nav.Link href="#home">Home</Nav.Link>
            
            <Nav.Link href="#home">Orders</Nav.Link>
        
            <Nav.Link href="#link">Profile</Nav.Link>
            <Nav.Link href="#link">Logout</Nav.Link>
             {/*
            <NavDropdown title="Dropdown" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
                Another action
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">
                Separated link
              </NavDropdown.Item>
            </NavDropdown>
             */}
          </Nav>
         
        </Navbar.Collapse>
       
      </div>
    </Navbar>
    <p><h3  align="center"><font size="5" color="red"><i><u>Vendor List</u></i></font></h3></p>

<ul type="disc">
  <li><Link to="/Vendor-login"><h3  align="center"><font size="3" color="blue">Vendor1</font></h3></Link></li>
  
  <li><Link to="/Customer-login"><h3  align="center"><font size="3" color="blue">Vendor2</font></h3></Link></li>
  
  <li><Link to="/Delivery_Staff-login"><h3  align="center"><font size="3" color="blue">Vendor3</font></h3></Link></li>
</ul>
            </div>
        )
    }
}