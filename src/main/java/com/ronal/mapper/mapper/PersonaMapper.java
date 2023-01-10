package com.ronal.mapper.mapper;

import com.ronal.mapper.dao.PersonaDAO;
import com.ronal.mapper.dto.PersonaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDAO personaDtoToPersonaDao(PersonaDTO personaDTO);

    PersonaDTO personaDaoToPersonaDto(PersonaDAO personaDAO);
}
