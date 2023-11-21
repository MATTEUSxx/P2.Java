package application.model;

import javax.persistence.*;

@Entity
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "questao_id", nullable = false)
    private Questao questao;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private boolean correta;

    // Getters e setters
}
