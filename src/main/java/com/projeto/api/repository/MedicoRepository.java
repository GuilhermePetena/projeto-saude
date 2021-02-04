package com.projeto.api.repository;

import com.projeto.api.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
