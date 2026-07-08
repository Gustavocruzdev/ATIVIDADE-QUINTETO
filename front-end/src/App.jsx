import React, { useState } from 'react';
// Importa apenas as SUAS duas páginas
import Home from './Components/Pages/Home-Dashboard Corporativo/index.jsx';
import MonitoramentoProducao from './Components/Pages/Monitoramento de Produção Diária/index.jsx';

import './App.css';

export default function App() {
  // Estado para controlar qual tela está ativa
  const [telaAtiva, setTelaAtiva] = useState('home');

  return (
    <div className="app-layout">
      {/* Menu simplificado apenas para as suas telas */}
      <header className="app-header">
        <div className="header-container">
          <div className="logo">
            <strong>Atlantic Offshore Energy</strong>
          </div>
          <nav className="nav-menu">
            <button 
              className={`nav-btn ${telaAtiva === 'home' ? 'active' : ''}`}
              onClick={() => setTelaAtiva('home')}
            >
              Home / Dashboard
            </button>
            <button 
              className={`nav-btn ${telaAtiva === 'monitoramento' ? 'active' : ''}`}
              onClick={() => setTelaAtiva('monitoramento')}
            >
              Monitoramento de Produção
            </button>
          </nav>
        </div>
      </header>

      {/* Conteúdo Dinâmico */}
      <main className="app-content">
        {telaAtiva === 'home' ? <Home /> : <MonitoramentoProducao />}
      </main>

      <footer className="app-footer">
        <p>&copy; 2026 Atlantic Offshore Energy. Painel de Controle Operacional.</p>
      </footer>
    </div>
  );
}