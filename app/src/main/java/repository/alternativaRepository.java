package application.repository;
import org.springframework.data.repository.CrudRepository;

public class alternativaRepository {
    public interface AlternativaRepository extends CrudRepository<Alternativa, Long> {
}    
}
