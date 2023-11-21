package application.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;

@Entity
public class Questao {
    @Id
    @GeneratedValue(strategy = generationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String enunciado;

    @OneToMany(mappedBy = "questao", cascade = cascadeType.ALL)
    private List<Alternativa> alternativas;
}
