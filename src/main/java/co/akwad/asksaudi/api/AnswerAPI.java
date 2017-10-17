package co.akwad.asksaudi.api;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.akwad.asksaudi.models.Answer;
import co.akwad.asksaudi.models.Question;
import co.akwad.asksaudi.models.User;
import co.akwad.asksaudi.repositories.AnswerRepistory;


@RestController
public class AnswerAPI {
	
	private static Logger log = LoggerFactory.getLogger(AnswerAPI.class);
	
	
	@Autowired
	AnswerRepistory answerRepository;
	
	@RequestMapping(value = "/answer", method = RequestMethod.POST)
    public String postAnswerHandler(@RequestBody PostAnswerRequest request, @AuthenticationPrincipal User user) {
		
		
		//TODO add other services before insertion
		
	
		
		
		Answer a = new Answer();
		a.setAnswerBody(request.getAnswerBody());
		a.setUserID(user.getId());
		a.setQuestionId(request.getQuestionId());
		
		
		//FIXME set user id before saving
		
		log.info("Befor saving new question user id: " + user.getId());
		answerRepository.save(a);
		
    	return "Answer Posted";
    }

}

class PostAnswerRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("answer_body")
	private String answerBody;
	
	@JsonProperty("question_id")
	private long questionId;

	public String getAnswerBody() {
		return answerBody;
	}

	public void setAnswerBody(String answer_Body) {
		answerBody = answer_Body;
	}
	

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public PostAnswerRequest(String answer_Body, long question_Id) {
		super();
		answerBody = answer_Body;
		questionId = question_Id;
	}

	public PostAnswerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
