package com.usk.user.events.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.usk.user.events.publish.UserRemovedEvent;

@Component
public class UserRemovedListener {

	@EventListener
	public void handleUserRemovedEvent(UserRemovedEvent event) {
		System.out.println("Received user removed event =====>> " + event);
	}

	/*
	 * @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION) void
	 * handleAfterUserRemoved(UserRemovedEvent event) { // handle UserRemovedEvent }
	 */

}
