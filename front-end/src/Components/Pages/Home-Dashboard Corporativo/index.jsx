
import { useState } from "react";
import "./style.css";

export default function Home() {
  const [diasSemAcidentes] = useState(427);

  const plataformas = [
    {
      id: "P-51",
      local: "Bacia de Campos",
      status: "Operacional",
    },
    {
      id: "P-53",
      local: "Bacia de Santos",
      status: "Operacional",
    },
    {
      id: "P-62",
      local: "Bacia do Espírito Santo",
      status: "Manutenção Preventiva",
    },
  ];

  return (
    <main className="home-container">
      <section className="hero">
        <div className="hero-content">
          <h1>Atlantic Offshore Energy</h1>
          <p>Portal Corporativo Integrado de Operações e Segurança</p>
        </div>
      </section>

      <section className="dashboard">
        <div className="card safety-card">
          <h3>Segurança (HSE)</h3>

          <span className="number">{diasSemAcidentes}</span>

          <p>Dias consecutivos sem acidentes de trabalho.</p>

          <span className="status success">Operação Segura</span>
        </div>

        <div className="card">
          <h3>Plataformas Ativas</h3>

          <span className="number">{plataformas.length}</span>

          <p>Unidades offshore monitoradas em tempo real.</p>
        </div>
      </section>

      <section className="map-section">
        <h2>Plataformas em Operação</h2>

        <div className="map">
          <div className="map-info">
            <h3>Monitoramento Oceânico</h3>

            {plataformas.map((plataforma) => (
              <div className="platform-card" key={plataforma.id}>
                <h4>{plataforma.id}</h4>
                <p>{plataforma.local}</p>
                <span>{plataforma.status}</span>
              </div>
            ))}
          </div>
        </div>
      </section>
    </main>
  );
}

