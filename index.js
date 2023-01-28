import { createRoot } from "react-dom/client";
import {BrowserRouter} from "react-router-dom";
import Main from "./Main";
import './App.css';
 
const rootElement = document.getElementById("root");
const root = createRoot(rootElement);

root.render(
  <BrowserRouter><Main /></BrowserRouter>
);