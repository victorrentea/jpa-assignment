package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
@DiscriminatorValue("LAB")
public class LabActivity extends TeachingActivity {
	private String labType; // NOT NULL
//	private StudentsGroup group;

}
