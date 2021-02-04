package com.projeto.api.controller;

import com.projeto.api.entity.Medico;
import com.projeto.api.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping()
    public List<Medico> obterMedicos() {
        return medicoService.obterMedicos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Medico> obterMedico(@PathVariable Long id){
        Medico medico = medicoService.obterMedico(id);
        if(medico.getNome() != null){
            return ResponseEntity.ok(medico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{id}")
    public ResponseEntity<Medico> salvarMedico(@RequestBody Medico medico){
        Medico medicoNovo = medicoService.salvarMedico(medico);
        if(medicoNovo.getCpf().equals(medico.getCpf())){
            return ResponseEntity.status(HttpStatus.CREATED).body(medicoNovo);
        }else {
            return ResponseEntity.badRequest().build();
        }
    }

    /*@PutMapping("/{id}")
    public ResponseEntity<Medico> atualizarMedico(@RequestBody Medico medico, @PathVariable Long id){
        if(medicoService.atualizarMedico(medico, id).getIdMedico() == medico.getIdMedico()){

        }
    }*/
}
