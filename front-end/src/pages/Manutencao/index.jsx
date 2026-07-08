
    import React, { useState } from 'react';
    import './style.css';

    export default function Manutencao() {
    const [formData, setFormData] = useState({
        equipamentoId: '',
        criticidade: 'baixa',
        descricao: ''
    });

    const handleSubmit = (e) => {
        e.preventDefault();
        // Aqui vai o fetch/axios para o Spring Boot depois
        console.log(formData);
    };

    return (
        <div className="maintenance">
            <div className="maintenance-container">
                <div className="maintenance-text">
                    <h1>Solicitação de Manutenção</h1>
                    <p>Abertura de ordens de serviço para ativos e equipamentos das plataformas da Bacia de Santos. Preencha os dados técnicos da falha com atenção.</p>
                </div>

                <div className="maintenance-form-box">
                    <h2>Nova Ordem de Serviço</h2>
                    <form onSubmit={handleSubmit}>
                        <div className="form-group">
                            <label>ID do Equipamento</label>
                            <input 
                                type="text" 
                                placeholder="Ex: TURB-01, BROCA-05"
                                value={formData.equipamentoId}
                                onChange={(e) => setFormData({...formData, equipamentoId: e.target.value})}
                                required 
                            />
                        </div>

                        <div className="form-group">
                            <label>Criticidade</label>
                            <select 
                                value={formData.criticidade}
                                onChange={(e) => setFormData({...formData, criticidade: e.target.value})}
                            >
                                <option value="baixa">Baixa</option>
                                <option value="media">Média</option>
                                <option value="alta">Alta</option>
                                <option value="critica">Crítica (Parada de Produção)</option>
                            </select>
                        </div>

                        <div className="form-group">
                            <label>Descrição da Falha</label>
                            <textarea 
                                placeholder="Descreva detalhadamente a anomalia identificada no ativo..."
                                value={formData.descricao}
                                onChange={(e) => setFormData({...formData, descricao: e.target.value})}
                                required
                            ></textarea>
                        </div>

                        <button type="submit">Enviar Solicitação</button>
                    </form>
                </div>
            </div>
        </div>
    );
}