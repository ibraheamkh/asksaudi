package co.akwad.asksaudi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "QUESTION")
public class Question {
	
	
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    @SequenceGenerator(name = "question_seq", sequenceName = "question_seq", allocationSize = 1)
	private long id;
	
	@Column(name = "TITLE", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
	private String title;
	
	@Column(name = "QUESTION_BODY", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
	private String questionBody;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
	
	
	public Question(){
		super();
	}
	
	public Question(long id, String title, String body) {
		
	}
	

}
