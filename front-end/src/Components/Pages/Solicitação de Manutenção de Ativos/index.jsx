    import React, { useState } from 'react';
    import api from '../../service/api';
    import './style.css';

    export default function SolicitacaoManutencaoAtivos() {
    const [formData, setFormData] = useState({
        idEquipamento: '',
        criticidade: '',
        descricaoFalha: ''
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
        await api.post('/manutencoes', formData);
        alert('⚙️ Ordem de Serviço aberta e encaminhada ao time de Engenharia de Confiabilidade!');
        setFormData({ idEquipamento: '', criticidade: '', descricaoFalha: '' });
        } catch (error) {
        const errorMsg = error.response?.data?.mensagem || 'Falha ao processar abertura de manutenção.';
        alert(`Erro na solicitação: ${errorMsg}`);
        }
    };

    return (
        <div className="aoe-form-container">
        <div className="aoe-form-card">
            <h2>Solicitação de Manutenção de Ativos</h2>
            <p className="aoe-form-subtitle">Abertura de Ordens de Serviço Corretivas e Preditivas para Equipamentos Críticos.</p>
            
            <form onSubmit={handleSubmit} className="aoe-form-grid">
            <div className="aoe-input-group">
                <label>Código / Tag do Ativo (ID)</label>
                <input name="idEquipamento" value={formData.idEquipamento} placeholder="Ex: TURB-01, BROCA-X5" required onChange={handleChange} />
            </div>

            <div className="aoe-input-group">
                <label>Nível de Criticidade do Equipamento</label>
                <select name="criticidade" value={formData.criticidade} required onChange={handleChange}>
                <option value="">Selecione...</option>
                <option value="ROTINA">Rotina (Não afeta produção direta)</option>
                <option value="URGENTE">Urgente (Degradação de performance)</option>
                <option value="EMERGENCIA">Emergência (Equipamento inoperante / Linha parada)</option>
                </select>
            </div>

            <div className="aoe-input-group aoe-full-width">
                <label>Descrição Detalhada da Falha / Sintomas</label>
                <textarea name="descricaoFalha" value={formData.descricaoFalha} placeholder="Ex: Vibração anormal nos mancais, perda de pressão na linha hidráulica, superaquecimento..." required onChange={handleChange} />
            </div>

            <button type="submit" className="aoe-btn-submit">Gerar Ordem de Manutenção</button>
            </form>
        </div>
        </div>
    );
    }