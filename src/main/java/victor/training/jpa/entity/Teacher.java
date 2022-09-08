package victor.training.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Teacher {

	public enum Grade {
		LECTURER("L"),
		PROFESSOR("P"),
		CONF("C"),
		ASSISTANT("A");

		public final String dbValue;
		Grade(String dbValue) {
			this.dbValue = dbValue;
		}
	}
@Id
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Grade grade;

	@OneToOne(fetch = FetchType.LAZY)
	private TeacherDetails details;

	public void setDetails(TeacherDetails details) {
		this.details = details;
		details.setTeacher(this);
	}

	//
//	// TODO order by type and value ASC
//	private List<ContactChannel> channels = new ArrayList<>();
//
//	private Set<Subject> heldSubjects = new HashSet<>() ;
//
//	private Set<TeachingActivity> activities = new HashSet<>();

	private DayOfWeek counselingDay;

	private Integer counselingStartHour;

	private Integer counselingDurationInHours;

	private String counselingRoomId;

	public Teacher() {
	}

	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher{" +
			   "id=" + id +
			   ", name='" + name + '\'' +
			   '}';
	}
}
