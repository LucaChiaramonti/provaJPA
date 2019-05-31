package sincronoGroup.provaJPA.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudenteUtil extends JpaRepository<Studente, Integer> 
{
	@Query("SELECT s FROM Studente s WHERE s.nome = ?1")
	List<Studente> findByName(String name);
	
	@Query("SELECT s FROM Studente s WHERE s.cognome = ?1")
	List<Studente> findByCognome(String lastName);
	
	@Query("INSERT INTO `scuola`.`studenti` (`nome`, `cognome`) VALUES (?1, ?2);")
	Boolean aggiungiStudente(String name,String lastName);
}
