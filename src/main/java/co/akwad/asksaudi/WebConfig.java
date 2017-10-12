package co.akwad.asksaudi;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("co.akwad.asksaudi")
public class WebConfig {
	 
	
//	@Bean
//	ServletRegistrationBean h2servletRegistration(){
//	  
//	          ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
//	  
//	          registrationBean.addUrlMappings("/console/*");
//	  
//	          return registrationBean;
//	  
//	      }


}
