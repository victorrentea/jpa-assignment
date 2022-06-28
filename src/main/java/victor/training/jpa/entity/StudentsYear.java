package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class StudentsYear {

	private Long id;
	
	private String code;

	// Order groups by POSITION (order matters)
	private List<StudentsGroup> groups = new ArrayList<>();
	
	private Set<CourseActivity> courses = new HashSet<>();

	public StudentsYear() {
	}
	public StudentsYear(String code) {
		this.code = code;
	}

}
