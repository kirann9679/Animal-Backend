package APIS.demo.Repository;

import APIS.demo.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.name = :value")
    Animal findByNonPrimaryKeyColumn(String value);
}
