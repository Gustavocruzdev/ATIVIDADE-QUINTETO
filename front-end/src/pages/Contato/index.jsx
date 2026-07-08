import "./style.css";
import {
  FaPhoneAlt,
  FaEnvelope,
  FaMapMarkerAlt,
  FaClock,
} from "react-icons/fa";

export default function Contato() {
  return (
    <div className="contato">

      <section className="hero-contato">

        <div className="hero-text">
          <span className="tag">Fale Conosco</span>

          <h1>Estamos prontos para ajudar sua operação.</h1>

          <p>
            Entre em contato com nossa equipe para esclarecer dúvidas,
            reportar problemas ou solicitar informações sobre a plataforma.
          </p>

        </div>

      </section>

      <section className="contato-content">

        <div className="info">

          <div className="card-info">
            <FaPhoneAlt className="icon" />
            <h3>Telefone</h3>
            <p>(71) 3333-4820</p>
          </div>

          <div className="card-info">
            <FaEnvelope className="icon" />
            <h3>E-mail</h3>
            <p>contato@maritimosalvador.com.br</p>
          </div>

          <div className="card-info">
            <FaMapMarkerAlt className="icon" />
            <h3>Endereço</h3>
            <p>
              Avenida da França, 450<br />
              Comércio - Salvador/BA
            </p>
          </div>

          <div className="card-info">
            <FaClock className="icon" />
            <h3>Horário</h3>
            <p>
              Segunda à Sexta<br />
              08:00 às 18:00
            </p>
          </div>

        </div>

        <div className="formulario">

          <h2>Envie sua mensagem</h2>

          <form>

            <input
              type="text"
              placeholder="Nome"
            />

            <input
              type="email"
              placeholder="E-mail"
            />

            <input
              type="text"
              placeholder="Assunto"
            />

            <textarea
              rows="6"
              placeholder="Digite sua mensagem..."
            ></textarea>

            <button>
              Enviar Mensagem
            </button>

          </form>

        </div>

      </section>

    </div>
  );
}