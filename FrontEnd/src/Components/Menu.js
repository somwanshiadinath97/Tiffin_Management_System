import React from 'react';
import { Link } from "react-router-dom";
import './HomePage.css';


export default function Menu()
{
    return(
          <div className="bg">
          <div class="container-fluid p-0.5 bg-secondary text-white text-center">
           <h1><u><i>EDabba</i></u></h1>
           <p>Best-Cooked Meals to Treat Your Taste Buds!</p> 
            </div>
            <p><h3  align="left"><font size="5" color="red"><i><u>Tiffin Management</u></i></font></h3></p>

          <font size="3" color="magenta">
          <ul type="disc">
          <li><Link to="/AddMenu"><h3  align="left"><font size="3" color="magenta">AddMenu</font></h3></Link></li>
          
          <li><Link to="/UpdateMenu"><h3  align="left"><font size="3" color="magenta">UpdateMenu</font></h3></Link></li>
          
          <li><Link to="/Delete-menu"><h3  align="left"><font size="3" color="magenta">DeleteMenu</font></h3></Link></li>
         </ul>
         </font></div>
    );
    
}