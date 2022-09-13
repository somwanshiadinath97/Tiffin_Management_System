import React from 'react';
import { Link } from "react-router-dom";
import './HomePage.css';

const  Homepage = ()=>
{
    return(
       <div>
           <body>

<div className="bg">
<div class="container-fluid p-0.5 bg-secondary text-white text-center">
  <h1><u><i>EDabba</i></u></h1>
  <p>Best-Cooked Meals to Treat Your Taste Buds!</p> 
</div>
  
{/* <div class="container mt-5">
  <div class="row">
    <div class="col-sm-2">
      <h3>Vendor</h3>
      <Link to="/Vendor-login">Vendor Login</Link><br/>
     
    </div>
    <div class="col-sm-2">
      <h3>Customer</h3>
      <Link to="/Customer-login">Customer Login</Link><br/>
    </div>
    <div class="col-sm-3">
      <h3>Delivery Staff</h3>        
      <Link to="/Delivery_Staff-login">Delivery Staff Login</Link><br/>
     
    </div>
  </div>
</div> */}

<p><h3  align="left"><font size="5" color="red"><i><u>Login as per your Role</u></i></font></h3></p>

<font size="3" color="magenta">
<ul type="disc">
  <li><Link to="/Vendor-login"><h3  align="left"><font size="3" color="magenta">Vendor Login</font></h3></Link></li>
  
  <li><Link to="/Customer-login"><h3  align="left"><font size="3" color="magenta">Customer Login</font></h3></Link></li>
  
  <li><Link to="/Delivery_Staff-login"><h3  align="left"><font size="3" color="magenta">Delivery Staff Login</font></h3></Link></li>
</ul>
</font>
</div>
</body>
     </div>
  );
}

export default Homepage;

         


         

