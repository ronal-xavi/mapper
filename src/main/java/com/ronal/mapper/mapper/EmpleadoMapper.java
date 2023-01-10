package com.ronal.mapper.mapper;

import com.ronal.mapper.dao.EmpleadoDAO;
import com.ronal.mapper.dto.EmpleadoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface EmpleadoMapper {


    @Mapping(target = "nombre", source = "name")
    @Mapping(target = "apellido", source = "lastname")
    EmpleadoDAO empleadoDtoToEmpleadoDAO(EmpleadoDTO empleadoDTO);


    @Mapping(target = "name", source = "nombre")
    @Mapping(target = "lastname", source = "apellido")
    EmpleadoDTO empleadoDaoToEmpleadoDTO(EmpleadoDAO empleadoDAO);
}