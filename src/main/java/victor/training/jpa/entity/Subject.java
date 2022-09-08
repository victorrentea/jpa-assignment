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

public class Subject  { // eg Fizica 2, SDA
	private Long id;
	
	private String name;
	
	private boolean active;
	
	private Teacher holderTeacher;

	// TODO List sau Set de copii?
	private List<TeachingActivity> activities = new ArrayList<>();
	
	private LocalDateTime lastModifiedDate;
	private String lastModifiedBy;

	public Subject() {
	}

	public Subject(String name) {
		this.name = name;
	}
}
