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
public class StudentsGroup {
	@Id
	private Long id;

	private String code;

	@ManyToOne
	private StudentsYear year;

	@OneToMany(mappedBy = "group")
	private Set<LabActivity> labs = new HashSet<>();

	@ElementCollection
	private List<String> emails = new ArrayList<>();

	public StudentsGroup() {
	}
	public StudentsGroup(String code) {
		this.code = code;
	}

}
