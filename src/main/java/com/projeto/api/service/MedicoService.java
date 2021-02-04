package com.projeto.api.service;

import com.projeto.api.entity.Medico;

import java.util.List;

public interface MedicoService {

    List<Medico> obterMedicos();

    Medico obterMedico(Long id);

    Medico salvarMedico(Medico medico);

    Medico atualizarMedico(Medico medico, Long id);

    void deletarMedico(Long id);
}
