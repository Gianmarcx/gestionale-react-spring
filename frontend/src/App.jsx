import { Routes, Route } from "react-router"


//importo i componenti sotto /pages
import Home from "./pages/Home"
import Prodotti from "./pages/Prodotti";
import Categorie from "./pages/Categorie";
import Dipendenti from "./pages/Dipendenti";
import Progetti from "./pages/Progetti";

import Layout from "./components/Layout";

function App() {
  return (
    <Routes>

    <Route path="/" element = {<Layout/>}>
      <Route index element = {<Home/>}/>
      <Route path="prodotti" element = {<Prodotti/>}/>
      <Route path="categorie" element = {<Categorie/>}/>
      <Route path="dipendenti" element = {<Dipendenti/>}/>
      <Route path="progetti" element = {<Progetti/>}/>
    </Route>
    
    </Routes>

  );
}


export default App;
