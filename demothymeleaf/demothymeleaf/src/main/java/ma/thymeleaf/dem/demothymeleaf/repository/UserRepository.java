package ma.thymeleaf.dem.demothymeleaf.repository;

import ma.thymeleaf.dem.demothymeleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
