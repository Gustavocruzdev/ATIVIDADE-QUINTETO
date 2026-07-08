import "./style.css";
import {
  FaOilCan,
  FaShieldAlt,
  FaUsers,
  FaIndustry,
  FaArrowRight,
  FaMapMarkerAlt,
} from "react-icons/fa";

export default function Home() {
  const indicadores = [
    {
      titulo: "Plataformas Ativas",
      valor: "03",
      icone: <FaIndustry />,
      descricao: "Operando em alto desempenho",
    },
    {
      titulo: "Produção Diária",
      valor: "145k",
      icone: <FaOilCan />,
      descricao: "Barris por dia",
    },
    {
      titulo: "Tripulação",
      valor: "286",
      icone: <FaUsers />,
      descricao: "Profissionais embarcados",
    },
    {
      titulo: "Segurança",
      valor: "427",
      icone: <FaShieldAlt />,
      descricao: "Dias sem acidentes",
    },
  ];

  const plataformas = [
    {
      nome: "P-51",
      local: "Bacia de Campos",
      status: "Operacional",
    },
    {
      nome: "P-53",
      local: "Bacia de Santos",
      status: "Operacional",
    },
    {
      nome: "P-62",
      local: "Espírito Santo",
      status: "Manutenção Preventiva",
    },
  ];

  return (
    <main className="home">

      <section className="hero">

        <div className="hero-text">

          <span className="tag">
            Atlantic Offshore Energy
          </span>

          <h1>
            Portal Corporativo de Operações Offshore
          </h1>

          <p>
            Plataforma integrada para monitoramento de produção,
            segurança operacional, manutenção preventiva e gestão
            das equipes embarcadas.
          </p>

          <button>
            Acessar Sistema
            <FaArrowRight />
          </button>

        </div>

        <div className="hero-image">

          <img
            src="https://images.unsplash.com/photo-1513828583688-c52646db42da?auto=format&fit=crop&w=1200&q=80"
            alt="Plataforma Offshore"
          />

        </div>

      </section>

      <section className="cards">

        {indicadores.map((item) => (

          <div className="card" key={item.titulo}>

            <div className="icon">

              {item.icone}

            </div>

            <h2>{item.valor}</h2>

            <h3>{item.titulo}</h3>

            <p>{item.descricao}</p>

          </div>

        ))}

      </section>

      <section className="operations">

        <div className="title">

          <h2>Plataformas Monitoradas</h2>

          <p>
            Informações atualizadas das unidades marítimas.
          </p>

        </div>

        <div className="platform-grid">

          {plataformas.map((item) => (

            <div className="platform-card" key={item.nome}>

              <div className="platform-header">

                <h3>{item.nome}</h3>

                <span>{item.status}</span>

              </div>

              <div className="platform-body">

                <FaMapMarkerAlt />

                <p>{item.local}</p>

              </div>

            </div>

          ))}

        </div>

      </section>

      <section className="about-system">

        <div>

          <h2>
            Gestão Inteligente das Operações
          </h2>

          <p>

            O sistema Atlantic Offshore Energy integra
            monitoramento operacional, controle de incidentes,
            solicitações de manutenção, produção diária e
            gestão das escalas de embarque em um único portal.

          </p>

        </div>

      </section>

    </main>
  );
}