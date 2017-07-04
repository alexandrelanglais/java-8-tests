package fr.demandeatonton;

public class Java8Lambdas {

   static MathOperation addition = (a, b) -> a + b;

   static MathOperation soustraction = (a, b) -> {
      return a - b;
   };

   static MathOperation multiplication = (int a, int b) -> (a * b);

   static MathOperation division = (a, b) -> ((double) a / (double) b);

   static interface MathOperation {
      double operation(int a, int b);
   }

   private static double operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }

   public static void main(String[] args) {
      final int x = 5, y = 3;
      System.out.println(operate(x, y, addition));
      System.out.println(operate(x, y, soustraction));
      System.out.println(operate(x, y, multiplication));
      System.out.println(operate(x, y, division));
   }
}
