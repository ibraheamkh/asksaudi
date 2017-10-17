package co.akwad.asksaudi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ANSWER")
public class Answer {
	
		@Id
	    @Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		
		@Column(name = "USER_ID")
		@JsonProperty("user_id")
		private long userID;
		
		@Column(name = "QUESTION_ID")
		@JsonProperty("question_id")
		private long questionId;
		
		@Column(name = "ANSWER_BODY", length = 50, unique = true)
	    @NotNull
	    @Size(min = 4, max = 50)
		@JsonProperty("ANSWER_BODY")
		private String answerBody;

		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getUserID() {
			return userID;
		}

		public void setUserID(long userID) {
			this.userID = userID;
		}

		public long getQuestionId() {
			return questionId;
		}

		public void setQuestionId(long questionId) {
			this.questionId = questionId;
		}

		public String getAnswerBody() {
			return answerBody;
		}

		public void setAnswerBody(String answerBody) {
			this.answerBody = answerBody;
		}

		public Answer(long id, long userID, long question_id, String answer_Body) {
			super();
			this.id = id;
			this.userID = userID;
			this.questionId = question_id;
			answerBody = answer_Body;
		}

		public Answer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		

}
