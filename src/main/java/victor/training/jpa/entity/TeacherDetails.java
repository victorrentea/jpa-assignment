package victor.training.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class TeacherDetails {
	@Id
	private Long id;
	
	@Lob
	private String cv;

	@OneToOne(mappedBy = "details") // 'inverse side' of a bidirectional relationship
	@Setter(AccessLevel.PACKAGE)
	private Teacher teacher;

}
