package com.ronal.mapper.service;

import com.ronal.mapper.dto.PersonaDTO;
import com.ronal.mapper.util.ResponseDTO;

public interface PersonaService {
    ResponseDTO<PersonaDTO> registrar(PersonaDTO personaDTO);
}
