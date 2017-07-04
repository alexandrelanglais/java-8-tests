package fr.demandeatonton;

import java.util.Arrays;
import java.util.List;

public class Java8MethodReference {
   public static void main(String[] args) {
      List<String> prenoms = Arrays.asList(new String[] { "Pierre", "Paul", "Jacques", "Robert", "Daniel" });
      prenoms.forEach(System.out::println);
   }
}
