import React, { Component } from "react";
import {
    Route,
    Routes,
    NavLink
} from "react-router-dom";
import Home from "./Home";
import Requirements from "./Requirements";
import Contact from "./Contact";
import Registration from "./components/Registration";
import Login from "./components/Login";
import I9Form from "./components/I9Form";



class Main extends Component {
    render() {
        return (
            
                <div>
                    <h1>ADP I9 Verification</h1>
                    <ul className="header">
                        <li><NavLink to="/">Home</NavLink></li>
                        <li><NavLink to="/requirements">Requirements</NavLink></li>
                        <li><NavLink to="/contact">Contact</NavLink></li>
                        <li><NavLink to="/registration">Registration</NavLink></li> 
                        <li><NavLink to="/login">Login</NavLink></li> 
                        <li><NavLink to="/I9Form">I9Form</NavLink></li>                        
                    </ul>

                    <div className="content">
                        
                      <Routes> 
                        <Route exact path="/" element={<Home />}/>
                        <Route path="requirements" element={<Requirements />}/>
                        <Route path="contact" element={<Contact />}/>
                        <Route path="registration" element={<Registration />}/>
                        <Route path="login" element={<Login />}/>
                        <Route path="I9Form" element={<I9Form />}/>
                        </Routes>  
                        
                    </div>
                </div>
            
        );
    }
}

export default Main;