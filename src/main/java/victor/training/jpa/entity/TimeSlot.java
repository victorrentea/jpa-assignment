package victor.training.jpa.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.DayOfWeek;

@Getter
@ToString

@Embeddable
public class TimeSlot {

	@Enumerated(EnumType.STRING)
	private DayOfWeek day;
	// embeddable names are contextualized using spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl
	
	private int startHour;
	
	private int hours;
	
	private String roomId;

	protected TimeSlot() {}

	public TimeSlot(DayOfWeek day, int startHour, int hours, String roomId) {
		this.day = day;
		this.startHour = startHour;
		this.hours = hours;
		this.roomId = roomId;
	}

}
