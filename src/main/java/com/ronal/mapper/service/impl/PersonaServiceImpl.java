package com.ronal.mapper.service.impl;

import com.ronal.mapper.dao.PersonaDAO;

import com.ronal.mapper.repository.PersonaRepository;
import com.ronal.mapper.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Log4j2
@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public PersonaDAO registrar(PersonaDAO personaDAO) {
        return  personaRepository.save(personaDAO);
    }
}
