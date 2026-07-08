
import React from 'react';
import './style.css';

export default function QuemSomosSustentabilidade() {
    return (
        <div className="aoe-container">
        <section className="aoe-hero-section">
            <h1>Atlantic Offshore Energy</h1>
            <p className="aoe-tagline">Energia com responsabilidade e excelência no Pré-Sal</p>
        </section>

        <section className="aoe-content-grid">
            <div className="aoe-card">
            <h2>Nossa Missão</h2>
            <p>
                Explorar e produzir hidrocarbonetos na Bacia de Santos com máxima eficiência operacional, 
                garantindo o suprimento energético nacional através de tecnologias de ponta em águas ultraprofundas.
            </p>
            </div>

            <div className="aoe-card">
            <h2>Segurança Offshore (HSE)</h2>
            <p>
                A vida humana e a integridade operacional estão acima de qualquer meta de produção. 
                Adotamos políticas rigorosas de mitigação de risco e redundância de sistemas em todas as nossas 
                plataformas de perfuração e produção.
            </p>
            </div>

            <div className="aoe-card aoe-card-full">
            <h2>Preservação e Sustentabilidade Marinha</h2>
            <p>
                Operar no ecossistema do Pré-Sal exige respeito absoluto à biodiversidade da Bacia de Santos. 
                Mantemos programas contínuos de monitoramento da qualidade da água, controle estrito de emissões atmosféricas 
                e planos avançados de contingência ambiental para neutralizar qualquer impacto no ambiente marinho.
            </p>
            </div>
        </section>
        </div>
    );
}

