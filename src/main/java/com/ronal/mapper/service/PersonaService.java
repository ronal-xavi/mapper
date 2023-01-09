package com.ronal.mapper.service;

import com.ronal.mapper.dto.PersonaDTO;
import com.ronal.mapper.util.Response;

public interface PersonaService {
    Response<PersonaDTO> registrar(PersonaDTO personaDTO);
}
