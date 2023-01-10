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
@Table(name = "tb_sede")
public class SedeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSede;
    private String nombre;
}
