package com.company;
import  java.util.Scanner;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args)
    {
     produkt p1 = new produkt("Icecream", 17.5);
     produkt p2 = new produkt("Breat", 7.0);
     produkt p3 = new produkt("Carrot", 2.76);

     klient k1 = new klient();

     System.out.println("możliwe polecenia");
     System.out.println("1 - wyświetl produkty");
     System.out.println("2 - dodaj do koszyka");
     System.out.println("3 - usuń z koszyka");
     System.out.println("4 - wyświetl koszyk");
     System.out.println("5 - zakończ zakupy ");


     do {
      if(i == 1)
      {
          System.out.println(p1);
          System.out.println(p2);
          System.out.println(p3);
      }
      if(i == 2)
      {
        k1.addToBox();
      }
      if(i == 3)
      {
          k1.delFromBox();
      }
      if(i == 4)
      {

      }
      if(i == 5)
      {

      }



     }while( i != 5);

    }
}
