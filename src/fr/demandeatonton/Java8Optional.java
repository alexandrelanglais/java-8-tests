package fr.demandeatonton;

import java.util.Optional;

public class Java8Optional {
   public static void main(String args[]) {
      Java8Optional main = new Java8Optional();
      Integer value1 = null;
      Integer value2 = new Integer(10);

      // Optional.ofNullable - autorise le paramètre passé à être null
      Optional<Integer> a = Optional.ofNullable(value1);

      // Optional.of - lance un NullPointerException si le paramètre passé est
      // null
      Optional<Integer> b = Optional.of(value2);
      System.out.println(main.sum(a, b));
   }

   public Integer sum(Optional<Integer> a, Optional<Integer> b) {

      // Optional.isPresent - vérifie si la valeur est présente ou non

      System.out.println("Premier paramètre présent : " + a.isPresent());
      System.out.println("Second paramètre présent : " + b.isPresent());

      // Optional.orElse - retourne la valeur présente, sinon la valeur par
      // défaut passée en paramètre
      Integer value1 = a.orElse(new Integer(0));

      // Optional.get - récupère la valeur, elle doit être présente
      Integer value2 = b.get();
      return value1 + value2;
   }
}
