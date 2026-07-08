import "./style.css";
import { Link, useLocation } from "react-router-dom";

export default function Navbar() {
  const { pathname } = useLocation();

  const menu = [
    { nome: "Home", rota: "/" },
    { nome: "Quem Somos", rota: "/sobre" },
    { nome: "Incidentes", rota: "/incidentes" },
    { nome: "Manutenção", rota: "/manutencao" },
    { nome: "Produção", rota: "/monitoramento" },
    { nome: "Escala", rota: "/escala" },
    { nome: "Contato", rota: "/contato" },
  ];

  return (
    <header className="navbar">

      <div className="logo">

        <div className="logo-circle">
          ⚓
        </div>

        <div>

          <h2>Atlantic Offshore</h2>

          <span>Energy Platform System</span>

        </div>

      </div>

      <nav>

        {menu.map((item) => (

          <Link
            key={item.rota}
            to={item.rota}
            className={pathname === item.rota ? "active" : ""}
          >
            {item.nome}
          </Link>

        ))}

      </nav>

    </header>
  );
}