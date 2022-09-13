import React from 'react';
import { Link } from "react-router-dom";
import './HomePage.css';

export default function VendorHomePage()
{
    return(

            <div className="bg">
            <div class="container-fluid p-0.5 bg-secondary text-white text-center">
            <h1><u><i>EDabba</i></u></h1>
            <p>Vendor Home Page!</p> 
            </div>
        
           <ul>
           <li><Link to="/Menu"><h3  align="left"><font size="3" color="magenta">Menu</font></h3></Link></li>

           <li><Link to="/HomePage"><h3  align="left"><font size="3" color="magenta">Home</font></h3></Link></li>
           </ul>
        </div>
    );
}