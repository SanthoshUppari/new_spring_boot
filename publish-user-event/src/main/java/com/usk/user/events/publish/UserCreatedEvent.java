package com.usk.user.events.publish;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

	private String name;

	public UserCreatedEvent(Object source, String name) {
		super(source);
		this.name = name;
	}

}
