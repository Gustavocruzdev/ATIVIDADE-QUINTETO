import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

import Home from "./Components/Pages/Home-Dashboard Corporativo/index.jsx";
import QuemSomos from "./Components/Pages/Quem Somos-Sustentabilidade/index.jsx";
import RegistroIncidentes from "./Components/Pages/Registro de Incidentes Operacionais (HSE)/index.jsx";
import SolicitacaoManutencao from "./Components/Pages/Solicitação de Manutenção de Ativos/index.jsx";
import MonitoramentoProducao from "./Components/Pages/Monitoramento de Produção Diária/index.jsx";
import EscalaEmbarque from "./Components/Pages/Escala de Embarque e Tripulação/index.jsx";
import ContatoSuporte from "./Components/Pages/Contato e Suporte de Emergência/index.jsx";

import "./App.css";


export default function App() {

  return (

    <Router>

      <div className="app-layout">


        <header className="app-header">

          <div className="header-container">


            <div className="logo">

              <strong>
                Atlantic Offshore Energy
              </strong>

            </div>


            <nav className="nav-menu">

              <Link to="/">
                Home
              </Link>


              <Link to="/quem-somos">
                Quem Somos
              </Link>


              <Link to="/monitoramento">
                Produção
              </Link>


              <Link to="/escala">
                Tripulação
              </Link>


              <Link to="/incidentes">
                HSE
              </Link>


              <Link to="/manutencao">
                Manutenção
              </Link>


              <Link to="/contato">
                Contato
              </Link>


            </nav>


          </div>


        </header>



        <main className="app-content">


          <Routes>


            <Route 
              path="/" 
              element={<Home />} 
            />


            <Route 
              path="/quem-somos" 
              element={<QuemSomos />} 
            />


            <Route 
              path="/incidentes" 
              element={<RegistroIncidentes />} 
            />


            <Route 
              path="/manutencao" 
              element={<SolicitacaoManutencao />} 
            />


            <Route 
              path="/monitoramento" 
              element={<MonitoramentoProducao />} 
            />


            <Route 
              path="/escala" 
              element={<EscalaEmbarque />} 
            />


            <Route 
              path="/contato" 
              element={<ContatoSuporte />} 
            />


          </Routes>


        </main>



        <footer className="app-footer">

          <p>
            © 2026 Atlantic Offshore Energy. Todos os direitos reservados.
          </p>

        </footer>


      </div>


    </Router>

  );

}