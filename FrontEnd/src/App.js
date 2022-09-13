import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import './App.css';
import VendorLogin from './Components/VendorLogin.js';
import CustomerLogin from './Components/CustomerLogin';
import Delivery_StaffLogin from './Components/Delivery_StaffLogin';
import SignUp from './Components/SignUp';
import Homepage from './Components/Homepage';
import Billing from "./Components/Billing";
import Menu from "./Components/Menu";
import AddMenu from "./Components/AddMenu";
import UpdateMenu from "./Components/UpdateMenu";
import VendorHomePage from "./Components/VendorHomePage";

function App() {
  return (
    <div className="App">
      <Router>
          <Routes> 
        <Route path="/" element={<Homepage/>}/>
            <Route path="/Vendor-login" element={<VendorLogin/>} />
            <Route path="/Customer-login" element={<CustomerLogin/>} />
            <Route path="/Delivery_Staff-login" element={<Delivery_StaffLogin/>} />
            <Route path="/SignUp" element={<SignUp/>} />
            <Route path="/Billing" element={<Billing/>} />
            <Route path="/Menu" element={<Menu/>} />
            <Route path="/AddMenu" element={<AddMenu/>} />
            <Route path="/UpdateMenu" element={<UpdateMenu/>} />
            <Route path="/VendorHomePage" element={<VendorHomePage/>} />
            <Route path="/Homepage" element={<Homepage/>} />

            
          </Routes>
          </Router>
     
    </div>
  );
}

export default App;

