package victor.training.jpa.entity;

import lombok.Getter;

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
	
	private String value;
	
	private ContactChannel() {
	}

	public ContactChannel(Type type, String value) {
		this.type = type;
		this.value = value;
	}

}
