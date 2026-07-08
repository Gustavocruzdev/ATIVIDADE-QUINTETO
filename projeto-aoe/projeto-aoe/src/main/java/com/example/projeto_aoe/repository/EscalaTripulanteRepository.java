package com.example.projeto_aoe.repository;

import com.example.projeto_aoe.model.EscalaTripulanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscalaTripulanteRepository extends JpaRepository<EscalaTripulanteModel, Long> {
}