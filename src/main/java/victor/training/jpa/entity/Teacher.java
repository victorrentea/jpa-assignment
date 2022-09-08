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
public class Teacher extends BaseEntity {

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

	private String name;


	@Enumerated(EnumType.STRING)
	private Grade grade;

	@OneToOne(fetch = FetchType.LAZY)
	private TeacherDetails details;

	public void setDetails(TeacherDetails details) {
		this.details = details;
		details.setTeacher(this);
	}

	@ElementCollection
	@OrderColumn(name = "INDEX") // +1 coloana folosita magic de Hib la READ si WRITE
//	@OrderBy("type")
	private List<ContactChannel> channels = new ArrayList<>();
//
	@OneToMany(mappedBy = "holderTeacher")
	@OrderBy("name")
	private Set<Subject> heldSubjects = new HashSet<>() ;

	public void addSubject(Subject subject) {
		this.heldSubjects.add(subject);
		subject.setHolderTeacher(this);
	}
	public Set<Subject> getHeldSubjects() {
		return Collections.unmodifiableSet(heldSubjects);
	}



	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "TEACHER_ID"),
			inverseJoinColumns = @JoinColumn(name = "ACTIVITY_ID"))
	private Set<TeachingActivity> activities = new HashSet<>();

	@Embedded
//	@AttributeOverrides(
		//@AttributeOverride(name = "room", @Column(name = "COUNSELING_HOUR")),
		//@AttributeOverride(name = "room", @Column(name = "COUNSELING_HOUR")),
		//@AttributeOverride(name = "room", @Column(name = "COUNSELING_HOUR")),
		//@AttributeOverride(name = "room", @Column(name = "COUNSELING_HOUR")),
//	)
	private TimeSlot counseling;

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
