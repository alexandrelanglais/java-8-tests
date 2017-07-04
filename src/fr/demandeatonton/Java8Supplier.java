package fr.demandeatonton;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java8Supplier {
   public static void main(String[] args) {
      List<String> names = Arrays.asList(new String[] { "Pierre", "Paul", "Jacques" });
      // avec lambdas
      names.forEach(name -> {
         printName(() -> name);
      });

      // sans lambdas
      names.forEach(new Consumer<String>() {
         public void accept(String s) {
            System.out.println(new Supplier<String>() {
               public String get() {
                  return s;
               }
            }.get());
         }
      });
   }

   private static void printName(Supplier<String> supplier) {
      System.out.println(supplier.get());
   }
}
