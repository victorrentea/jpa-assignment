package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ContactChannel {

	public enum Type {
		PERSONAL_PHONE,
		WORK_PHONE,
		PERSONAL_EMAIL,
		WORK_EMAIL,
		TWITTER,
		FACEBOOK,
		LINKED_IN
	}
	
	@Id
	private String id;
	private Type type;
	private String value;

	private ContactChannel() {
	}

	public ContactChannel(Type type, String id) {
		this.type = type;
		this.id = id;
	}

}
