package victor.training.jpa.entity;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter

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
	
	private Type type;
	
	private String id;
	
	private ContactChannel() {
	}

	public ContactChannel(Type type, String id) {
		this.type = type;
		this.id = id;
	}

}
