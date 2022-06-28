package victor.training.jpa.entity;

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

public class Subject  {
	private Long id;
	
	private String name;
	
	private boolean active;
	
	private Teacher holderTeacher;
	
	private List<TeachingActivity> activities = new ArrayList<>();
	
	private LocalDateTime lastModifiedDate;
	private String lastModifiedBy;

	public Subject() {
	}

	public Subject(String name) {
		this.name = name;
	}
}
