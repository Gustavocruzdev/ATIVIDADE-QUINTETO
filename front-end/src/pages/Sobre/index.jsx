import "./style.css";
import { FaAnchor, FaShip, FaShieldAlt, FaMapMarkedAlt } from "react-icons/fa";

export default function Sobre() {
  return (
    <div className="sobre">

      <section className="sobre-hero">
        <div className="sobre-texto">
          <span className="tag">Sobre a Plataforma</span>

          <h1>
            Monitoramento Inteligente das Operações Marítimas em Salvador
          </h1>

          <p>
            Nossa plataforma foi desenvolvida para centralizar informações de
            produção, manutenção, incidentes e monitoramento operacional,
            proporcionando maior segurança, eficiência e rapidez na tomada de
            decisões.
          </p>
        </div>

        <div className="sobre-box">
          <FaAnchor size={70}/>
        </div>
      </section>

      <section className="missao">

        <div className="title">
          <h2>Nossos Valores</h2>
          <p>Compromisso com eficiência, segurança e inovação.</p>
        </div>

        <div className="cards-sobre">

          <div className="card-sobre">
            <FaShieldAlt className="icone"/>
            <h3>Segurança</h3>
            <p>
              Monitoramento contínuo das operações para reduzir riscos e garantir
              maior confiabilidade.
            </p>
          </div>

          <div className="card-sobre">
            <FaShip className="icone"/>
            <h3>Operações</h3>
            <p>
              Gestão integrada das atividades marítimas com indicadores em tempo
              real para apoio operacional.
            </p>
          </div>

          <div className="card-sobre">
            <FaMapMarkedAlt className="icone"/>
            <h3>Localização</h3>
            <p>
              Atuação voltada para a região portuária de Salvador, atendendo
              operações distribuídas em diferentes áreas da cidade.
            </p>
          </div>

        </div>

      </section>

      <section className="historia">

        <div className="title">
          <h2>Nossa História</h2>
        </div>

        <p>
          A plataforma nasceu com o objetivo de facilitar o gerenciamento das
          operações marítimas e industriais na região de Salvador. Reunindo
          informações de produção, escalas de equipes, manutenção preventiva e
          corretiva e registro de incidentes, o sistema oferece uma visão única
          para gestores e operadores.
        </p>

        <p>
          Com uma interface intuitiva e indicadores atualizados, buscamos
          proporcionar mais produtividade, rastreabilidade e organização para
          todas as áreas envolvidas nas operações.
        </p>

      </section>

    </div>
  );
}