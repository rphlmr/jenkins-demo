package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

   /**
   * This is a method. Cool.
   * @param someone the name of a person
   * @return the sentence
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
