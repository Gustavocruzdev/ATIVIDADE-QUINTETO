package com.example.projeto_aoe.repository;

import com.example.projeto_aoe.model.IncidenteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenteRepository extends JpaRepository<IncidenteModel, Long> {
}