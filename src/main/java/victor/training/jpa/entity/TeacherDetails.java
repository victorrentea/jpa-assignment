package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class TeacherDetails {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	// TODO : what if this grows very big?
	private String cv;

}
