import React, { useState, useEffect } from 'react';
import './style.css';

export default function MonitoramentoProducao() {
  const [dadosProducao, setDadosProducao] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  // Endpoint do Spring Boot (Substitua pela sua URL real)
  const API_URL = 'http://localhost:8080/api/producao-diaria';

  useEffect(() => {
    fetch(API_URL)
      .then((response) => {
        if (!response.ok) {
          throw new Error('Falha ao carregar os dados de produção.');
        }
        return response.json();
      })
      .then((data) => {
        setDadosProducao(data);
        setLoading(false);
      })
      .catch((err) => {
        console.error(err);
        // Fallback de dados para testes se a API do Spring Boot estiver desligada
        setDadosProducao([
          { id: 1, plataforma: 'P-51', petroleoBarris: 45000, gasM3: 120000, metaAtingida: true },
          { id: 2, plataforma: 'P-53', petroleoBarris: 38000, gasM3: 95000, metaAtingida: true },
          { id: 3, plataforma: 'P-62', petroleoBarris: 12000, gasM3: 30000, metaAtingida: false }
        ]);
        setLoading(false);
      });
  }, []);

  if (loading) return <div className="loading">Carregando dados operacionais offshore...</div>;

  return (
    <div className="monitoramento-container">
      <header className="page-header">
        <h2>Monitoramento de Produção Diária</h2>
        <p>Dados de extração em tempo real integrados ao banco de dados MySQL</p>
      </header>

      {/* Tabela de Dados */}
      <div className="table-responsive">
        <table className="producao-table">
          <thead>
            <tr>
              <th>Plataforma</th>
              <th>Volume Petróleo (Barris)</th>
              <th>Volume Gás Natural (m³)</th>
              <th>Status da Meta</th>
            </tr>
          </thead>
          <tbody>
            {dadosProducao.map((item) => (
              <tr key={item.id}>
                <td><strong>{item.plataforma}</strong></td>
                <td>{item.petroleoBarris.toLocaleString()} bbl</td>
                <td>{item.gasM3.toLocaleString()} m³</td>
                <td>
                  <span className={`badge ${item.metaAtingida ? 'meta-ok' : 'meta-atencao'}`}>
                    {item.metaAtingida ? 'Meta Atingida' : 'Abaixo da Meta'}
                  </span>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}