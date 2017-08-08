package com.example;

/**
 * This is a class.
 */
public class Greeter {


  public Greeter() {

  }


  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
