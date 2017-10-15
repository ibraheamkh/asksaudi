package co.akwad.asksaudi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;


import co.akwad.asksaudi.models.Question;
import co.akwad.asksaudi.repositories.QuestionRepsitory;;

@RestController
public class QuestionsAPI {
	
	private static Logger log = LoggerFactory.getLogger(QuestionsAPI.class);
	
	
	@Autowired
	QuestionRepsitory questionRepository;
	
	@RequestMapping(value = "/questions", method = RequestMethod.POST)
    public String postQuestionHandler(@RequestBody  PostQuestionRequest request) {
		
		
		//TODO add other services before insertion
		
		Question q = new Question();
		q.setQuestionBody(request.getQuestionBody());
		q.setTitle(request.getTitle());
		
		//FIXME set user id before saving
		
		log.info("Befor saving new question");
		questionRepository.save(q);
		
    	return "Hello";
    }

}

class PostQuestionRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;
	
	
	private String questionBody;



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
	
	
	public PostQuestionRequest(){
		super();
	}

	public PostQuestionRequest(String title, String questionBody) {
		super();
		this.title = title;
		this.questionBody = questionBody;
	}
	

}
