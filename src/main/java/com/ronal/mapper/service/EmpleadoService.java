package com.ronal.mapper.service;

import com.ronal.mapper.dto.EmpleadoDTO;
import com.ronal.mapper.util.ResponseDTO;

public interface EmpleadoService {
    ResponseDTO<EmpleadoDTO> save (EmpleadoDTO empleadoDTO);
}
