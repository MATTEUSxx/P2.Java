package application.controller;
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import application.repository.questaoRepository.QuestaoRepository;

@Controller
@RequestMapping("/questoes")
public class QuestaoController {
    @Autowired
    private QuestaoRepository questaoRepository;

    @GetMapping
    public Iterable<Questao> listarQuestoes() {
        return questaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Questao buscarQuestao(@PathVariable Long id) {
        return questaoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Questao adicionarQuestao(@RequestBody Questao questao) {
        return questaoRepository.save(questao);
    }

    @PutMapping("/{id}")
    public Questao atualizarQuestao(@PathVariable Long id, @RequestBody Questao questaoAtualizada) {
        if (questaoRepository.existsById(id)) {
            questaoAtualizada.setId(id);
            return questaoRepository.save(questaoAtualizada);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletarQuestao(@PathVariable Long id) {
        questaoRepository.deleteById(id);
    }
}
