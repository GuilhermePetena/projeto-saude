package com.projeto.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
}
