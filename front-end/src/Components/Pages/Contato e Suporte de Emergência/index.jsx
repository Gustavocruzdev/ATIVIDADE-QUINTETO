import React from 'react';
import "style.css"

export default function ContatoSuporte() {
    const contatosBases = [
    { base: "Base Macaé", local: "Rio de Janeiro", telefone: "+55 (22) 3321-XXXX", email: "suporte.macae@atlantic.com" },
    { base: "Base Santos", local: "São Paulo", telefone: "+55 (13) 3210-XXXX", email: "suporte.santos@atlantic.com" },
    { base: "Base Rio de Janeiro", local: "Sede Corporativa", telefone: "+55 (21) 2122-XXXX", email: "suporte.rj@atlantic.com" }
    ];

    return (
    <div className="contato-container">
        <header className="contato-header">
        <h1>Contato e Suporte de Emergência</h1>
        <p className="alerta-urgente">🚨 LINHA DE CONTINGÊNCIA INTERNACIONAL 24H: 0800-770-AOE-911</p>
        </header>

        <main className="contato-conteudo">
        <section className="secao-bases">
            <h2>Canais de Comunicação Direta (Bases em Terra)</h2>
            <div className="cards-grid">
            {contatosBases.map((item, index) => (
                <div key={index} className="card-contato">
                <h3>{item.base}</h3>
                <p><strong>Localização:</strong> {item.local}</p>
                <p><strong>Telefone:</strong> {item.telefone}</p>
                <p><strong>E-mail:</strong> {item.email}</p>
                </div>
            ))}
            </div>
        </section>

        <section className="secao-procedimento">
            <h2>Protocolo de Emergência Offshore</h2>
            <blockquote>
            "Em caso de incidentes graves na plataforma, acione o alarme geral local e faça o reporte imediato via rádio para o Centro de Operações Integradas (COI) em terra."
            </blockquote>
        </section>
        </main>
    </div>
    );
}