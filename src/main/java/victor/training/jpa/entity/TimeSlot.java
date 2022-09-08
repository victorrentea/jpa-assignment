package victor.training.jpa.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.time.DayOfWeek;
import java.util.Objects;

@Getter
@ToString
@Embeddable
public class TimeSlot {

	private DayOfWeek day;
	// embeddable names are contextualized using spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl

	private int startHour;
	
	private int durationHours;
	
	private String roomId;

	protected TimeSlot() {} // pt hibernate

	public TimeSlot(DayOfWeek day, int startHour, String roomId) { // pt deloperi
		this.day = Objects.requireNonNull(day);
		if (startHour < 7 || startHour > 20) {
			throw new IllegalArgumentException();
		}
		this.startHour = startHour;
		this.roomId = Objects.requireNonNull(roomId);
	}

}
