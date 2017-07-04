package fr.demandeatonton;

public class Java8LambdasHello {
   static SalutationService salutCordial = prenom -> System.out.println("Bonjour tr�s cher " + prenom);
   static SalutationService salutFamilier = prenom -> System.out.println("Salut " + prenom + " !");

   static interface SalutationService {
      void printMessage(String destinataire);
   }

   static void sendMessage(String destinataire, SalutationService service) {
      service.printMessage(destinataire);
   }

   public static void main(String[] args) {
      sendMessage("Paul", salutCordial);
      sendMessage("Paul", salutFamilier);
   }
}
