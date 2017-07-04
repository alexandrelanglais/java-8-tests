package fr.demandeatonton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8ListSort {

   public static void main(String[] args) {
      List<String> prenoms = Arrays.asList(new String[] { "Pierre", "Paul", "Jacques", "Robert", "Daniel" });
      sortListJava8Style(prenoms);
      show(prenoms);

   }

   private static void sortListJava8Style(List<String> list) {
      Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
   }

   private static void show(List<String> list) {
      list.forEach(System.out::println);
   }
}
