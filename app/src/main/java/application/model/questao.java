package application.model;

import javax.persistence.*;

@Entity
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String enunciado;

    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL)
    private List<Alternativa> alternativas;

    // Getters e setters
}
