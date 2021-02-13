package com.usk.user.events.publish;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {

	private ApplicationEventPublisher publisher;

	UserEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publishEvent(final String name) {
		System.out.println("Publishing events ===>>");
		// Publishing event created by extending ApplicationEvent
		publisher.publishEvent(new UserCreatedEvent(this, name));
		// Publishing an object as an event
		publisher.publishEvent(new UserRemovedEvent(name));
	}

}
