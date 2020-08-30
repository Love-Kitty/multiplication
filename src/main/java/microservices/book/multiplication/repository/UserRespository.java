package microservices.book.multiplication.repository;

import microservices.book.multiplication.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRespository extends CrudRepository<User, Long> {
    Optional<User> findByAlias(final String alias);
}
