import "./layout.css";
import { NavLink } from "react-router-dom";
import {
  FaHouse,
  FaTriangleExclamation,
  FaScrewdriverWrench,
  FaChartColumn,
  FaUsers,
  FaCircleInfo,
  FaEnvelope,
  FaOilCan,
} from "react-icons/fa6";

export default function Layout({ children }) {
  return (
    <div className="layout">
      {/* Sidebar */}
      <aside className="sidebar">
        <div className="logo">
          <FaOilCan />

          <div>
            <h2>Atlantic</h2>
            <span>Offshore Energy</span>
          </div>
        </div>

        <nav>
          <NavLink
            to="/"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaHouse />
            <span>Dashboard</span>
          </NavLink>

          <NavLink
            to="/incidentes"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaTriangleExclamation />
            <span>Incidentes</span>
          </NavLink>

          <NavLink
            to="/manutencao"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaScrewdriverWrench />
            <span>Manutenção</span>
          </NavLink>

          <NavLink
            to="/monitoramento"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaChartColumn />
            <span>Produção</span>
          </NavLink>

          <NavLink
            to="/escala"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaUsers />
            <span>Escala</span>
          </NavLink>

          <NavLink
            to="/sobre"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaCircleInfo />
            <span>Sobre</span>
          </NavLink>

          <NavLink
            to="/contato"
            className={({ isActive }) => (isActive ? "active" : "")}
          >
            <FaEnvelope />
            <span>Contato</span>
          </NavLink>
        </nav>
      </aside>

      {/* Conteúdo */}
      <section className="content">
        <header className="topbar">
          <div>
            <h2>Atlantic Offshore Energy</h2>
            <p>Portal Corporativo</p>
          </div>

          <div className="user">
            👤 Anderson
          </div>
        </header>

        <main>{children}</main>
      </section>
    </div>
  );
}