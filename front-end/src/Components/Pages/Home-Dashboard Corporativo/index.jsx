
import React, { useState, useEffect } from 'react';
import './style.css';

export default function Home() {
  // Estado para simular ou receber dados de segurança
  const [diasSemAcidentes, setDiasSemAcidentes] = useState(427);
  
  // Lista fictícia de plataformas ativas para o mapa/cards
  const plataformas = [
    { id: 'P-51', local: 'Bacia de Campos', status: 'Operacional' },
    { id: 'P-53', local: 'Bacia de Santos', status: 'Operacional' },
    { id: 'P-62', local: 'Bacia de Espírito Santo', status: 'Manutenção Preventiva' }
  ];

  return (
    <div className="home-container">
      {/* Hero Section / Boas-vindas */}
      <header className="home-hero">
        <h1>Atlantic Offshore Energy</h1>
        <p>Portal Corporativo Integrado de Operações e Segurança</p>
      </header>

      {/* Painel de Indicadores Principais */}
      <section className="dashboard-grid">
        <div className="card card-safety">
          <h3>Indicador de Segurança (HSE)</h3>
          <div className="counter-value">{diasSemAcidentes}</div>
          <p>Dias consecutivos sem acidentes de trabalho</p>
          <span className="badge-safety">Operação Segura</span>
        </div>

        <div className="card">
          <h3>Plataformas Ativas</h3>
          <div className="counter-value">{plataformas.length}</div>
          <p>Unidades offshore em monitoramento</p>
        </div>
      </section>

      {/* Seção do Mapa / Localização das Plataformas */}
      <section className="map-section">
        <h2>Mapa de Localização das Plataformas Ativas</h2>
        <div className="mock-map">
          <div className="map-overlay">
            <p><strong>Visualização de Satélite Oceânico Ativa</strong></p>
            <ul>
              {plataformas.map(p => (
                <li key={p.id}>
                  <strong>{p.id}</strong> - {p.local} ({p.status})
                </li>
              ))}
            </ul>
          </div>
        </div>
      </section>
    </div>
  );
}