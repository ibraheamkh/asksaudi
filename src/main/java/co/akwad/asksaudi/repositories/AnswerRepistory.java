package co.akwad.asksaudi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.akwad.asksaudi.models.Answer;

@Repository
public interface AnswerRepistory extends JpaRepository<Answer, Long> {

}
