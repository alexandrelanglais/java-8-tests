package fr.demandeatonton;

import java.util.Optional;

public class Java8Optional {
   public static void main(String args[]) {
      Java8Optional main = new Java8Optional();
      Integer value1 = null;
      Integer value2 = new Integer(10);

      // Optional.ofNullable - autorise le param�tre pass� � �tre null
      Optional<Integer> a = Optional.ofNullable(value1);

      // Optional.of - lance un NullPointerException si le param�tre pass� est
      // null
      Optional<Integer> b = Optional.of(value2);
      System.out.println(main.sum(a, b));
   }

   public Integer sum(Optional<Integer> a, Optional<Integer> b) {

      // Optional.isPresent - v�rifie si la valeur est pr�sente ou non

      System.out.println("Premier param�tre pr�sent : " + a.isPresent());
      System.out.println("Second param�tre pr�sent : " + b.isPresent());

      // Optional.orElse - retourne la valeur pr�sente, sinon la valeur par
      // d�faut pass�e en param�tre
      Integer value1 = a.orElse(new Integer(0));

      // Optional.get - r�cup�re la valeur, elle doit �tre pr�sente
      Integer value2 = b.get();
      return value1 + value2;
   }
}
