package fr.demandeatonton;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Streams {
   public static void main(String args[]) {
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
      List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
      Random random = new Random();

      System.out.println("List: " + strings);

      long count = strings.stream().filter(string -> string.isEmpty()).count();
      System.out.println("Strings vides : " + count);

      count = strings.stream().filter(string -> string.length() == 3).count();
      System.out.println("Strings de taille 3 : " + count);

      List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
      System.out.println("Liste filtrée: " + filtered);

      String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
      System.out.println("String mergée : " + mergedString);

      List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
      System.out.println("Liste de carrés: " + squaresList);
      System.out.println("List : " + integers);

      IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

      System.out.println("Plus haut nombre dans la liste : " + stats.getMax());
      System.out.println("Plus bas nombre de la liste : " + stats.getMin());
      System.out.println("Somme de tous les nombres : " + stats.getSum());
      System.out.println("Moyenne de tous les nombres : " + stats.getAverage());
      System.out.println("Nombres au hasard: ");

      random.ints().limit(10).sorted().forEach(System.out::println);

      // parallel processing
      count = strings.parallelStream().filter(string -> string.isEmpty()).count();
      System.out.println("Chaines vides en utilisant parallel processing : " + count);
   }

}
