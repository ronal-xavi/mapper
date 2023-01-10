package com.ronal.mapper.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class EmpleadoDTO {
    private Integer idEmpleado;
    private String name;
    private String lastname;
    private SedeDTO sedeDTO;

}
