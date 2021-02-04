package com.projeto.api.service;

import com.projeto.api.entity.Paciente;

import java.util.List;

public interface PacienteService {

    List<Paciente> obterPacientes();

    Paciente obterPaciente(Long id);

    Paciente salvarPaciente(Paciente paciente);

    Paciente atualizarPaciente(Paciente paciente, Long id);

    void deletarPaciente(Long id);

}
