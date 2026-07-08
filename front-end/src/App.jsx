import { Routes, Route } from "react-router-dom";

import Layout from "./layout/Layout";

import Home from "./pages/Home";
import Sobre from "./pages/Sobre";
import Contato from "./pages/Contato";
import Incidentes from "./pages/Incidentes";
import Manutencao from "./pages/Manutencao";
import Monitoramento from "./pages/Monitoramento";
import Escala from "./pages/Escala";

function App() {
  return (
    <Layout>
      <Routes>
        <Route path="/" element={<Home />} />

        <Route path="/sobre" element={<Sobre />} />

        <Route path="/contato" element={<Contato />} />

        <Route path="/incidentes" element={<Incidentes />} />

        <Route path="/manutencao" element={<Manutencao />} />

        <Route path="/monitoramento" element={<Monitoramento />} />

        <Route path="/escala" element={<Escala />} />
      </Routes>
    </Layout>
  );
}

export default App;