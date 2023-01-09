package com.ronal.mapper.mapper;

import com.ronal.mapper.dao.PersonaDAO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDAO personaDtoToPersonaDao(com.ronal.mapper.dto.PersonaDTO personaDTO);

    com.ronal.mapper.dto.PersonaDTO personaDaoToPersonaDto(PersonaDAO personaDAO);
}
