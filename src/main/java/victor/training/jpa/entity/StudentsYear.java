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
@Entity
public class StudentsYear {
@Id
	private Long id;
	
	private String code;

	// Order groups by POSITION (order matters)
	@OneToMany(mappedBy = "year")
	private List<StudentsGroup> groups = new ArrayList<>();
	@OneToMany(mappedBy = "year")
	private Set<CourseActivity> courses = new HashSet<>();

	public StudentsYear() {
	}
	public StudentsYear(String code) {
		this.code = code;
	}

}
