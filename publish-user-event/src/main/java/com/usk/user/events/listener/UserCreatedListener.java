package com.usk.user.events.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.usk.user.events.publish.UserCreatedEvent;

@Component
class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

  @Override
  public void onApplicationEvent(UserCreatedEvent event) {
    System.out.println("Received User created event ========>> ");
  }
}
