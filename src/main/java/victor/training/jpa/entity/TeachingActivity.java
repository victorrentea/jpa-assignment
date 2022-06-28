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
@DiscriminatorColumn(name = "DISCR")
public abstract class TeachingActivity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Subject subject;
	
	@Enumerated(EnumType.STRING)
	private DayOfWeek day;
	
	private Integer startHour;
	
	private Integer durationInHours;
	
	private String roomId;
	
	private LocalDateTime lastModifiedDate;
	
	private String lastModifiedBy;
	
	@ManyToMany
	private Set<Teacher> teachers = new HashSet<>();

}
