package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter

public class CourseActivity extends TeachingActivity {
	private StudentsYear year;

}
