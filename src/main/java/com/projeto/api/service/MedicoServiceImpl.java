package com.projeto.api.service;

import com.projeto.api.entity.Medico;
import com.projeto.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> obterMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico obterMedico(Long id) {
        return medicoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID NÃO ENCONTRADO"));
    }

    @Override
    public Medico salvarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Medico atualizarMedico(Medico medico, Long id) {
        if(medicoRepository.existsById(id)){
            return medicoRepository.save(medico);
        } else {
            throw new IllegalArgumentException("ID OU ENTIDADE NÃO ENCONTRADO");
        }
    }


    @Override
    public void deletarMedico(Long id){
        if(id != null && id != 0) {
            medicoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("ID NÃO ENCONTRADO");
        }
    }
}
