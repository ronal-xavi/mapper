package com.ronal.mapper.service;

import com.ronal.mapper.dao.PersonaDAO;
import com.ronal.mapper.dto.PersonaDTO;
import com.ronal.mapper.util.Response;

public interface PersonaService {
    PersonaDAO registrar(PersonaDAO personaDTO);
}
