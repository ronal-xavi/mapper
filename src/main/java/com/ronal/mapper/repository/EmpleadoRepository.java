package com.ronal.mapper.repository;

import com.ronal.mapper.dao.EmpleadoDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoDAO,Integer> {
}
