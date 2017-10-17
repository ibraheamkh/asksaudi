package co.akwad.asksaudi.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Entity
@Table(name = "AUTHORITY")
public class Authority implements GrantedAuthority{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authority_seq")
    @SequenceGenerator(name = "authority_seq", sequenceName = "authority_seq", allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 50)
    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private List<User> users;
    
    

    public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	public Authority(@NotNull AuthorityName name) {
		super();
		this.name = name;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.getName().name();
	}
}