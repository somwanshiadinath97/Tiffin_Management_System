import React from 'react';
import './navbarstyle.css';
import './HomePage.css';
import {Navbar,Nav,NavDropdown,Form,FormControl,Button} from 'react-bootstrap';

class Menulist extends React.Component {
    render() {
        var employeeslist = [
            {
                "Id": 1,
                "MenuName": "samosa",
                "MenuPrice": "30",
                
            },
            {
                
                "Id": 2,
                "MenuName": "Vadapav",
                "MenuPrice": "20",
            },
            {
               
                "Id": 3,
                "MenuName": "Kachori",
                "MenuPrice": "25",
            },
            {
              
                "Id": 4,
                "MenuName": "panipuri",
                "MenuPrice": "35",
            }
        ];
        debugger;
        if (employeeslist && employeeslist.length > 0) {
            return (<div className='MenuPage'>
                <h2>Menu List</h2>
                <table className="table" >
                    <thead>
                        <tr>
                            <th>Menu Id</th>
                            <th>MenuName</th>
                            <th>Price</th>
                        
                        </tr>
                    </thead>
                    <tbody>
                        {employeeslist.map(emp => (
                            <tr key={emp.Id}>
                                <td>{emp.Id}</td>
                                <td>{emp.MenuName}</td>
                                <td>{emp.MenuPrice}</td>
                               
                            </tr>
                        ))}
                    </tbody>
                </table>
                <Navbar className="navbarclass" varient={"dark"} expand="lg">
      
      <Navbar.Brand href="#home"><div className="myclass"></div></Navbar.Brand>
      <div className="navbarclass">
           
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="me-auto" >
          <Nav.Link href="#home">Home</Nav.Link>
          
          <Nav.Link href="#home">Order</Nav.Link>
      
         
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
            </div>
            )
        }
        else {
            return (<div>No Record Found</div>)
        }
    }
}
export default Menulist;