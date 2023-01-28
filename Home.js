import React, { Component } from "react";
import './App.css'; 

class Home extends Component {
  render() {
    return (
      <div>
        < h2 > Welcome to our I - 9 Verification page </h2>
        <p > Form I - 9, officially the Employment Eligibility Verification, is a United States 
          Citizenship and Immigration Services form.Mandated by the Immigration Reform and Control Act of 1986, 
          it is used to verify the identity and legal authorization to work of all paid employees in the United States.
          All U.S.employers must ensure proper completion of Form I - 9
        for each individual they hire
        for employment in the United States
        </p>
          
        <p>If you are returning to complete the form, please click
          the Login tab.
        </p>
        < p > 
        <a href="/Registration">Don't have an account? Register here</a>
        </p>
      </div>
    );
  }
}
 
export default Home;