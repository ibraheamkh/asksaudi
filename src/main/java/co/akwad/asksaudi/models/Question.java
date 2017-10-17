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

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "QUESTION")
public class Question {
	
	
	@Id
    @Column(name = "ID")
	private long id;
	
	
	@Column(name = "USER_ID")
	@JsonProperty("user_id")
	private long userID;
	
	@Column(name = "TITLE", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
	@JsonProperty("title")
	private String title;
	
	@Column(name = "QUESTION_BODY", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
	@JsonProperty("question_body")
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
	
	
	
	
	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public Question(){
		super();
	}
	
	public Question(long id, String title, String body) {
		
	}
	

}
