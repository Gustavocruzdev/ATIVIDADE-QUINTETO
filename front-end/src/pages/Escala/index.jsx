import { useState, useEffect } from 'react';
import './style.css';

export default function EscalaTripulacao() {
    const [tripulantes, setTripulantes] = useState([]);
    const [erro, setErro] = useState(null);

    useEffect(() => {
        fetch('http://localhost:8080/api/escala')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Erro');
                }
                return response.json();
            })
            .then(data => setTripulantes(data))
            .catch(() => {
                setErro("Não foi possível carregar a escala de embarque.");
            });
    }, []);

    return (
        <div className="escala-container">
            <header className="escala-header">
                <h1>Escala de Embarque e Tripulação</h1>
                <p>Controle de pessoal ativo e regime de confinamento nas plataformas da Bacia de Santos.</p>
            </header>

            {erro && <p className="mensagem-erro">{erro}</p>}

            <main className="escala-conteudo">
                <table className="tabela-tripulacao">
                    <thead>
                        <tr>
                            <th>Nome do Funcionário</th>
                            <th>Função / Cargo</th>
                            <th>Plataforma</th>
                            <th>Início do Regime</th>
                            <th>Fim do Regime</th>
                            <th>Regime</th>
                        </tr>
                    </thead>
                    <tbody>
                        {tripulantes.length > 0 ? (
                            tripulantes.map((trip) => (
                                <tr key={trip.id}>
                                    <td>{trip.nomeFuncionario}</td>
                                    <td>{trip.funcao}</td>
                                    <td>{typeof trip.plataforma === 'object' ? trip.plataforma?.nome : trip.plataforma || 'Não informada'}</td>
                                    <td>{new Date(trip.dataInicio).toLocaleDateString('pt-BR')}</td>
                                    <td>{new Date(trip.dataFim).toLocaleDateString('pt-BR')}</td>
                                    <td className="tag-regime">14x14</td>
                                </tr>
                            ))
                        ) : (
                            !erro && (
                                <tr>
                                    <td colSpan="6" className="carregando">Carregando dados da tripulação embarcada...</td>
                                </tr>
                            )
                        )}
                    </tbody>
                </table>
            </main>
        </div>
    );
}