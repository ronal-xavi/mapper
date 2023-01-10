package com.ronal.mapper.cotroller;

import com.ronal.mapper.dto.EmpleadoDTO;
import com.ronal.mapper.service.EmpleadoService;
import com.ronal.mapper.util.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @PostMapping(value = "/save")
    public ResponseDTO<EmpleadoDTO> save(@RequestBody EmpleadoDTO empleadoDTO){
        return  empleadoService.save(empleadoDTO);
    }


}
