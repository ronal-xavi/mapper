package com.ronal.mapper.mapper;

import com.ronal.mapper.dao.EmpleadoDAO;
import com.ronal.mapper.dao.SedeDAO;
import com.ronal.mapper.dto.EmpleadoDTO;
import com.ronal.mapper.dto.SedeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface EmpleadoMapper {


    //TARGET SON LOS ATRIBUTOS DEL OBJETO QUE SE DEVUELVE /// SOURCE SON LOS ATRIBUTOS DEL OBJETO QUE ESTA COMO PARÁMETRO

    @Mapping(target = "nombre", source = "name")
    @Mapping(target = "apellido", source = "lastname")
    @Mapping(target = "sede",source = "sedeDTO")
    EmpleadoDAO empleadoDtoToEmpleadoDAO(EmpleadoDTO empleadoDTO);


    @Mapping(target = "name", source = "nombre")
    @Mapping(target = "lastname", source = "apellido")
    EmpleadoDTO empleadoDaoToEmpleadoDTO(EmpleadoDAO empleadoDAO);


    SedeDAO sedeDtoToSedeDao(SedeDTO sedeDTO);

    SedeDTO sedeDaoToSedeDto(SedeDAO sedeDAO);
}