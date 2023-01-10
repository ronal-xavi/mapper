package com.ronal.mapper.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_empleado")
public class EmpleadoDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    @OneToOne
    private SedeDAO sede;
}
