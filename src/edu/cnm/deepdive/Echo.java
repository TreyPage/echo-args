package edu.cnm.deepdive; //Package name lower case

public class Echo { // Class name UpperCamelCase

  private static final String ARG_ITEM_FORMAT = "%d: %s%n"; // Constant name UPPER_SNAKE_CASE

  public static void main(String[] args) { // Method name lowerCamelCase

    for (int i = 0; i < args.length; i++) { // Local variable name lowerCamelCase
      if (args[i].length() > 3) {
        System.out.printf(ARG_ITEM_FORMAT, i, args[i].toUpperCase());
      }
      else {
        System.out.printf(ARG_ITEM_FORMAT, i, args[i].toLowerCase());
      }
    }
  }

}
