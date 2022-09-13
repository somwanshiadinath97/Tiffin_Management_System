import React, {useState} from 'react';
import './style.css'
function RegistrationForm() {
    return(
      <div className="form">
          <div className="form-body">
              <div className="startdate">
                  <label className="form__label" for="startDate">Start Date </label>
                  <input className="form__input" type="date" id="startdate" placeholder="Start Date"/>
              </div>
              <div className="enddate">
                  <label className="form__label" for="endDate">End Date </label>
                  <input  type="date" name="" id="enddate"  className="form__input"placeholder="End Date"/>
              </div>
              <div className="noofmealsperday">
                  <label className="form__label" for="email">No of meals per day </label>
                  1&nbsp; <input type="radio" id="meals" name="meals" className="form__input" /> &emsp;
                  2&nbsp; <input type="radio" id="meals" name="meals" className="form__input" />
              </div>
              
          </div>
          <div class="footer">
              <button type="submit" class="btn">Subscription</button>
          </div>
      </div>      
    )       
}
export default RegistrationForm;