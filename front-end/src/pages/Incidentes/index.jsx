    import { useState } from 'react';
    import api from '../../services/api';
    import './style.css';

    export default function RegistroIncidentesHSE() {
    const [formData, setFormData] = useState({
        gravidade: '',
        data: '',
        hora: '',
        plataforma: '',
        descricao: '',
        acoesImediatas: ''
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
        await api.post('/incidentes', formData);
        alert('⚠️ Incidente Operacional registrado com sucesso no sistema AOE!');
        setFormData({ gravidade: '', data: '', hora: '', plataforma: '', descricao: '', acoesImediatas: '' });
        } catch (error) {
        const errorMsg = error.response?.data?.mensagem || 'Falha ao conectar com o servidor da base terrestre.';
        alert(`Erro no registro: ${errorMsg}`);
        }
    };

    return (
        <div className="aoe-form-container">
        <div className="aoe-form-card">
            <h2>Registro de Incidentes Operacionais (HSE)</h2>
            <p className="aoe-form-alert">Atenção: Este relatório é enviado em tempo real para a gerência de segurança em terra.</p>
            
            <form onSubmit={handleSubmit} className="aoe-form-grid">
            <div className="aoe-input-group">
                <label>Plataforma / Unidade Ativa</label>
                <input name="plataforma" value={formData.plataforma} placeholder="Ex: P-70, P-77" required onChange={handleChange} />
            </div>

            <div className="aoe-input-group">
                <label>Grau de Risco / Gravidade</label>
                <select name="gravidade" value={formData.gravidade} required onChange={handleChange}>
                <option value="">Selecione...</option>
                <option value="BAIXO">Baixo (Anomalia Operacional)</option>
                <option value="MEDIO">Médio (Incidente sem Afastamento)</option>
                <option value="ALTO">Alto (Acidente / Parada de Processo)</option>
                <option value="CRITICO">Crítico (Evacuação / Emergência)</option>
                </select>
            </div>

            <div className="aoe-input-group">
                <label>Data do Evento</label>
                <input type="date" name="data" value={formData.data} required onChange={handleChange} />
            </div>

            <div className="aoe-input-group">
                <label>Hora do Evento</label>
                <input type="time" name="hora" value={formData.hora} required onChange={handleChange} />
            </div>

            <div className="aoe-input-group aoe-full-width">
                <label>Descrição Detalhada do Ocorrido</label>
                <textarea name="descricao" value={formData.descricao} placeholder="Descreva os fatos técnicos observados..." required onChange={handleChange} />
            </div>

            <div className="aoe-input-group aoe-full-width">
                <label>Ações Imediatas Tomadas (Contenção)</label>
                <textarea name="acoesImediatas" value={formData.acoesImediatas} placeholder="Bloqueios mecânicos, isolamento de área, acionamento de alarmes..." required onChange={handleChange} />
            </div>

            <button type="submit" className="aoe-btn-submit aoe-btn-danger">Transmitir Relatório HSE</button>
            </form>
        </div>
        </div>
    );
    }