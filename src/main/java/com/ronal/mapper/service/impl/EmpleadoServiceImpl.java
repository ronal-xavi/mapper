package com.ronal.mapper.service.impl;

import com.ronal.mapper.dao.EmpleadoDAO;
import com.ronal.mapper.dto.EmpleadoDTO;
import com.ronal.mapper.mapper.EmpleadoMapper;
import com.ronal.mapper.repository.EmpleadoRepository;
import com.ronal.mapper.service.EmpleadoService;
import com.ronal.mapper.util.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;
    private final EmpleadoMapper empleadoMapper;


    @Override
    public ResponseDTO<EmpleadoDTO> save(EmpleadoDTO empleadoDTO) {

        EmpleadoDAO empleadoDAO = empleadoMapper.empleadoDtoToEmpleadoDAO(empleadoDTO);

        empleadoRepository.save(empleadoDAO);

        EmpleadoDTO salida = empleadoMapper.empleadoDaoToEmpleadoDTO(empleadoDAO);


        return ResponseDTO.<EmpleadoDTO>builder().success(true).response(salida).mensaje("REGISTRADO CORRECTAMENTE").build();
    }
}
