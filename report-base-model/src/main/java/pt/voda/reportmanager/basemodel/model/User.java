package pt.voda.reportmanager.basemodel.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
//@Audited
@Entity
@ToString
@Table(name = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 270990445985081124L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.PRIVATE)
	private Long id;
	
	@NotEmpty
	@Size(max = 255)
	private String name;
	
	@NotEmpty
	@Size(max = 45)
	private String color;
	
	@NotEmpty
	@Size(max = 255)
	private String email;
	
	@NotEmpty
	@Size(max = 255)
	private String password;
	
	@NotNull
	private Date createdAt;
	
	@NotNull
	private Boolean isAdmin;
	
	@NotNull
	private Boolean isDeleted;
	
	@ManyToOne
	private Team team;
	
	public User(String name, String email, String color, String password, Boolean isDeleted, Team team) {
		this.name = name;
		this.email = email;
		this.color = color;
		this.password = password;
		this.isDeleted = isDeleted;
		this.team = team;
	}
}
