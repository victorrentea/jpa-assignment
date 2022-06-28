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

public class StudentsGroup {
	private Long id;

	private String code;

	private StudentsYear year;

	private Set<LabActivity> labs = new HashSet<>();
	
	private List<String> emails = new ArrayList<>();

	public StudentsGroup() {
	}
	public StudentsGroup(String code) {
		this.code = code;
	}

}
