package ch.zuehlke.fullstack.data.repository;

import ch.zuehlke.fullstack.data.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Integer> {
    List<Example> findByIdGreaterThan(int id);
}
