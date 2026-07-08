package com.example.projeto_aoe.repository;

import com.example.projeto_aoe.model.ProducaoDiariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducaoDiariaRepository extends JpaRepository<ProducaoDiariaModel, Long> {
}
