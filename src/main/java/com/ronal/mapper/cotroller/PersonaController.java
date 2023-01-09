package com.ronal.mapper.cotroller;

import com.ronal.mapper.dao.PersonaDAO;
import com.ronal.mapper.dto.PersonaDTO;
import com.ronal.mapper.repository.PersonaRepository;
import com.ronal.mapper.service.PersonaService;
import com.ronal.mapper.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @Autowired
    private PersonaRepository personaRepository;

    @PostMapping("registrar")
    public Response<PersonaDTO> guardar (@RequestBody @Validated PersonaDTO personaDTO){
        return personaService.registrar(personaDTO);
    }

    @GetMapping
    public List<PersonaDAO> listar(){
        return personaRepository.findAll();
    }
}
