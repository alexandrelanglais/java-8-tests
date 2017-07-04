package fr.demandeatonton;

public class Java8Defaults {

   interface Vehicule {
      default void print() {
         System.out.println("Je suis un véhicule");
      }

      void roule();
   }

   static class Voiture implements Vehicule {
      @Override
      public void roule() {
         System.out.println("Vroum vroum !");
      }
   }

   static class Train implements Vehicule {
      @Override
      public void roule() {
         System.out.println("Tchou tchou !");
      }
   }

   public static void main(String[] args) {
      Vehicule voiture = new Voiture();
      Vehicule train = new Train();

      voiture.print();
      train.print();

      voiture.roule();
      train.roule();
   }
}
