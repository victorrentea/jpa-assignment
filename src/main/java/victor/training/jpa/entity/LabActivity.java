package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class LabActivity extends TeachingActivity {
	@Column(nullable = false)
	private String labType; // NOT NULL
//	private StudentsGroup group;

}

