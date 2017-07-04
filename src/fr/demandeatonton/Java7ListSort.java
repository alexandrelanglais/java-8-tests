package fr.demandeatonton;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7ListSort {

   public static void main(String[] args) {
      List<String> prenoms = Arrays.asList(new String[] { "Pierre", "Paul", "Jacques", "Robert", "Daniel" });
      sortListJava7Style(prenoms);
      showJava7Style(prenoms);
   }

   private static void sortListJava7Style(List<String> list) {
      Collections.sort(list, new Comparator<String>() {
         @Override
         public int compare(String o1, String o2) {
            return o1.compareTo(o2);
         }
      });
   }

   private static void showJava7Style(List<String> list) {
      for (String item : list) {
         System.out.println(item);
      }
   }

}
