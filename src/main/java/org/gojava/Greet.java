package org.gojava;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class Greet {

  private static final AtomicLong seed = new AtomicLong(1);

  public final LocalDateTime timestamp;

  public final long id;

  public final String greeting;

  public Greet(String greeting) {
    this.timestamp = LocalDateTime.now();
    this.id = seed.getAndIncrement();
    this.greeting = greeting;
  }

}