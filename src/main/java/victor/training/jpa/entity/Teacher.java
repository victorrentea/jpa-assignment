package victor.training.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.*;

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
	@OneToMany
	@JoinColumn(name = "TEACHER_ID")
	private List<ContactChannel> channels = new ArrayList<>();
//
	@OneToMany(mappedBy = "holderTeacher")
	private Set<Subject> heldSubjects = new HashSet<>() ;

	public void addSubject(Subject subject) {
		this.heldSubjects.add(subject);
		subject.setHolderTeacher(this);
	}
	public Set<Subject> getHeldSubjects() {
		return Collections.unmodifiableSet(heldSubjects);
	}

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
