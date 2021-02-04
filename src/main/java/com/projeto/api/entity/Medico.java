package com.projeto.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico extends Pessoa {
    private Long idMedico;
    private String especialidade;
}
