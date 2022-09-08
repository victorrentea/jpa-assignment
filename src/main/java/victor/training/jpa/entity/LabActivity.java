package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class LabActivity extends TeachingActivity {
	@Column(nullable = false)
	private String labType; // NOT NULL

	@ManyToOne
	private StudentsGroup group;

}

