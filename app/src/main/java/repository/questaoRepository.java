package application.repository;

import org.springframework.data.repository.CrudRepository;

public class questaoRepository {
    public interface QuestaoRepository extends CrudRepository<Questao, Long> {
}
}