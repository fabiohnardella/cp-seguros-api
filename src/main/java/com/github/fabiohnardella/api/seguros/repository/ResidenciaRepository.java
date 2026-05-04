package com.github.fabiohnardella.api.seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.fabiohnardella.api.seguros.models.Residencia;

public interface ResidenciaRepository extends JpaRepository<Residencia, Long>{
}