package am.cs322;

import am.cs322.model.Banking;
import am.cs322.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRepository extends CrudRepository<Banking, Long> {
}
