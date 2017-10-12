package co.akwad.asksaudi.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.akwad.asksaudi.auth.JwtUserFactory;
import co.akwad.asksaudi.models.User;
import co.akwad.asksaudi.repositories.UserRepository;

/**
 * Created by stephan on 20.03.16.
 */
@Service("jwtUserDetailsServiceImpl")
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)  {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        	//TODO handle the error 
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
