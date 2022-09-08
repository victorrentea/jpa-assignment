package victor.training.jpa.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.time.DayOfWeek;

@Getter
@ToString
@Embeddable
public class TimeSlot {

	private DayOfWeek day;
	// embeddable names are contextualized using spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl

	private int startHour;
	
	private int durationHours;
	
	private String roomId;

	protected TimeSlot() {}

	public TimeSlot(DayOfWeek day, int startHour, int durationHours, String roomId) {
		this.day = day;
		this.startHour = startHour;
		this.durationHours = durationHours;
		this.roomId = roomId;
	}

}
