package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class CourseActivity extends TeachingActivity {
	private boolean sePoateDormi;
//	private StudentsYear year;

}
