package com.projeto.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Agendamento {
    private String tipo;
    private String descricao;
    private LocalDate data;
    private LocalDateTime horario;
    private Paciente paciente;
    private Medico medico;
}
