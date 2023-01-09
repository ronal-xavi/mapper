package com.ronal.mapper.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PersonaDTO {


    private Integer idPersona;
    @NotNull
    @NotEmpty
    @NotBlank
    private String nombre;
}
