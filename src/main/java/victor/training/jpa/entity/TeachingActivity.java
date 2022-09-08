package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class TeachingActivity {
	@Id
	private Long id;

	@ManyToOne
	private Subject subject;

	@Embedded
	private TimeSlot timeSlot;

	private LocalDateTime lastModifiedDate;
	
	private String lastModifiedBy;

	@ManyToMany(mappedBy = "activities")
	private Set<Teacher> teachers = new HashSet<>();

}
