package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

public class TeacherDetails {
	
	private Long id;
	
	// TODO : what if this grows very big?
	private String cv;

}
