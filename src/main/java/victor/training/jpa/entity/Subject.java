package victor.training.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Subject  { // eg Fizica 2, SDA
	@Id
	private Long id;
	
	private String name;
	
	private boolean active;

	@ManyToOne
	@JoinColumn(name = "TEACHER_ID")
	@Setter(AccessLevel.PACKAGE)
	private Teacher holderTeacher;

	// TODO List sau Set de copii?
//	private List<TeachingActivity> activities = new ArrayList<>();
	
	private LocalDateTime lastModifiedDate; // TIMESTAMP autmat
	private String lastModifiedBy;

	public Subject() {
	}

	public Subject(String name) {
		this.name = name;
	}
}
