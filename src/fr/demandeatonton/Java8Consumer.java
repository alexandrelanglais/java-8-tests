package fr.demandeatonton;

import java.util.function.Consumer;

public class Java8Consumer {
   public static void main(String[] args) {
      Consumer<String> consumer = Java8Consumer::print;
      consumer.accept("Bonjour");
      consumer.accept("tout le");
      consumer.accept("monde");
   }

   static void print(String message) {
      System.out.println(message);
   }
}
