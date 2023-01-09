package com.ronal.mapper.repository;

import com.ronal.mapper.dao.PersonaDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaDAO,Integer> {
}
