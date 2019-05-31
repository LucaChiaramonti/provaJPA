package sincronoGroup.provaJPA.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudenteUtil extends JpaRepository<Studente, Integer> 
{
	@Query("SELECT s FROM Studente s WHERE s.nome = ?1")
	List<Studente> findByName(String name);
}
