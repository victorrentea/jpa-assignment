package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class TeacherDetails {
	@Id
	private Long id;
	
	// TODO : what if this grows very big?
	@Lob
	private String cv;

	@OneToOne(mappedBy = "details") // 'inverse side' of a bidirectional relationship
	private Teacher teacher;

}
