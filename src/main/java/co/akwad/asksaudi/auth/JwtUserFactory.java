package co.akwad.asksaudi.auth;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import co.akwad.asksaudi.models.Authority;
import co.akwad.asksaudi.models.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static User create(User user) {
        return new User(
                user.getId(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getPassword(),
                user.getEnabled(), 
               user.getLastPasswordResetDate(),
               user.getAuthorities()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());
    }
}
