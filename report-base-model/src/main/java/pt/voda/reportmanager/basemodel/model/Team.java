package pt.voda.reportmanager.basemodel.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
@Table(name = "team")

public class Team{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeam;
	@NotEmpty
	@Size(max = 45)
	private String name;
	@NotEmpty
	private Boolean isDeleted;
	@NotEmpty
	@Size(max = 255)
	private Date createdAt;
}
