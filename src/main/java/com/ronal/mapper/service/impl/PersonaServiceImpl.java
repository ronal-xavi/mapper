package com.ronal.mapper.service.impl;

import com.ronal.mapper.dao.PersonaDAO;
import com.ronal.mapper.dto.PersonaDTO;
import com.ronal.mapper.mapper.PersonaMapper;
import com.ronal.mapper.repository.PersonaRepository;
import com.ronal.mapper.service.PersonaService;
import com.ronal.mapper.util.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Log4j2
@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    @Override
    public Response<PersonaDTO> registrar(PersonaDTO personaDTO) {

        PersonaDAO personaDAO = personaMapper.personaDtoToPersonaDao(personaDTO);
        personaRepository.save(personaDAO);
        PersonaDTO salida = personaMapper.personaDaoToPersonaDto(personaDAO);
        return Response.<PersonaDTO>builder().success(Boolean.TRUE).response(salida).build();
    }
}
