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

public abstract class TeachingActivity {
	
	private Long id;
	
	private Subject subject;
	
	private DayOfWeek dayOfWeek;
	
	private Integer startHour;
	
	private Integer durationInHours;
	
	private String roomId;
	
	private LocalDateTime lastModifiedDate;
	
	private String lastModifiedBy;
	
	private Set<Teacher> teachers = new HashSet<>();

}
