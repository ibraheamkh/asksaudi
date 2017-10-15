package co.akwad.asksaudi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.akwad.asksaudi.models.Question;

@Repository
public interface QuestionRepsitory extends JpaRepository<Question, Long> {
	

}
