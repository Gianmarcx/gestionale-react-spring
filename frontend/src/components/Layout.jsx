import { Outlet , Link } from "react-router";

function layout(){
    return(
    <div id="main" className="flex">
      {/** SIDEBAR */}
      <div id="sidebar" className="p-4 bg-blue-300 fixed h-full w-[320px]">
        <div className="navigation-bar flex flex-col gap-4">
          <Link to="/prodotti">Prodotti</Link>
          <Link to="/categorie">Categorie</Link>
          <Link to="/dipendenti">Dipendenti</Link>
          <Link to="/progetti">Progetti</Link>
        </div>
      </div>

      {/** CONTENUTO PRINCIPALE */}
      <div id="content" className="ml-[320px] p-4 w-full">
        <Outlet />
      </div>
    </div>
    )
}

export default layout;