import { useEffect, useState } from 'react';
import axios from 'axios'

function Prodotti(){
    const [prodotti , inserisciProdotti] = useState(null) 

    const[prodottoForm , inserisciProdottoForm] = useState({
        titolo: "",
        descrizione: "",
        prezzo: "",
    });

    //Interrogare backend , facendo una richiesta HTTP al controller Prodotti
    useEffect(
        () => {
            console.log("Componente avviato")

            axios.get("http://127.0.0.1:8081/api/prodotti").then((response) => {
                console.log(response.data);

                inserisciProdotti(response.data)
            });
        },   []);

        function salvaNuovoProdotto(){
            axios.post("http://127.0.0.1:8081/api/prodotti",)
        }


        function gestisciInputForm(e){
            console.log(e.target.value , e.target.name)

            inserisciProdottoForm({
                ...prodottoForm,
                [e.target.name]: e.target.value
            })
        }

    return(
        <div className="container mx-auto px-6 py-10">

    <h1 className="text-4xl font-extrabold text-center mb-10 text-gray-900 tracking-tight">
        Questa è la pagina Prodotti
    </h1>

    <form  onSubmit= {salvaNuovoProdotto} className = "mb-10 bg-white p-8 rounded-xl shadow-lg border border-gray-100">
        <div className="mb-6">
            <label 
                className="block text-gray-700 text-sm font-semibold mb-2 uppercase tracking-wide" 
                htmlFor="titolo"
            >
                Titolo
            </label>

            <input 
                type="text"
                id="titolo"
                placeholder="Inserisci Titolo..."
                className="w-full px-4 py-3 rounded-lg border border-gray-300 
                           focus:ring-2 focus:ring-blue-400 focus:border-blue-400 
                           transition-all duration-200 shadow-sm"
            />
        </div>
    </form>

    <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        {prodotti?.map((prodotto, index) => (
            <div 
                key={index} 
                className="bg-white rounded-xl shadow-md border border-gray-100 p-6 
                           hover:shadow-xl hover:-translate-y-1 transition-all duration-300"
            >
                <h2 className="text-2xl font-bold mb-3 text-gray-900">
                    {prodotto.titolo}
                </h2>

                <p className="text-gray-700 mb-2">
                    <span className="font-semibold text-gray-900">Prezzo:</span> €{prodotto.prezzo}
                </p>

                <p className="text-gray-700 mb-2">
                    <span className="font-semibold text-gray-900">Descrizione:</span> {prodotto.descrizione}
                </p>

                <p className="text-gray-700">
                    <span className="font-semibold text-gray-900">Quantità:</span> {prodotto.quantita}
                </p>
            </div>
        ))}
    </div>

</div>

    );
}

export default Prodotti;