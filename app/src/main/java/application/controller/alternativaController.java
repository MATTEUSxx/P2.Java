package application.controller;
package com.example.crudquestaoalternativa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import application.repository.alternativaRepository.AlternativaRepository;

@Controller
@RequestMapping("/alternativas")
public class AlternativaController {
    @Autowired
    private AlternativaRepository alternativaRepository;

    @GetMapping
    public Iterable<Alternativa> listarAlternativas() {
        return alternativaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Alternativa buscarAlternativa(@PathVariable Long id) {
        return alternativaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Alternativa adicionarAlternativa(@RequestBody Alternativa alternativa) {
        return alternativaRepository.save(alternativa);
    }

    @PutMapping("/{id}")
    public Alternativa atualizarAlternativa(@PathVariable Long id, @RequestBody Alternativa alternativaAtualizada) {
        if (alternativaRepository.existsById(id)) {
            alternativaAtualizada.setId(id);
            return alternativaRepository.save(alternativaAtualizada);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletarAlternativa(@PathVariable Long id) {
        alternativaRepository.deleteById(id);
    }
}
