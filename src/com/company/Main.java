package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args)
        throws IOException {


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

        int i = 0;
       do {
           // Enter data using BufferReader
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           // Reading data using readLine
           String name = reader.readLine();

           try{
               i = Integer.parseInt(name);
           }
           catch (NumberFormatException ex){
               ex.printStackTrace();
           }

            if (i == 1) {
                System.out.println(p1);
                System.out.println(p2);
                System.out.println(p3);
            }
            if (i == 2) {
                System.out.println("1 - Icecream, 2 - Breat, 3 - Carrot ");

                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                String n = reader.readLine();
                int num = 0;

                try{
                    num = Integer.parseInt(n);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                if(num == 1) k1.addToBox(p1);
                if(num == 2) k1.addToBox(p2);
                if(num == 3) k1.addToBox(p3);
            }
            if (i == 3) {
                if(p1.getInBox() == true) System.out.println(   "1 - Icecream");
                if(p2.getInBox() == true) System.out.println(   "2 - Breat");
                if(p3.getInBox() == true) System.out.println(   "3 - Carrot");

                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                String  k = reader.readLine();
                int n = 0;

                try{
                    n = Integer.parseInt(k);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                if(n == 1){ k1.delFromBox(p1); p1.setInBox(false); }
                if(n == 2){ k1.delFromBox(p2); p2.setInBox(false); }
                if(n == 3){ k1.delFromBox(p3); p3.setInBox(false); }
            }
            if (i == 4) {
               if(p1.getInBox() == true) System.out.println(  p1  );
               if(p2.getInBox() == true) System.out.println(  p2  );
               if(p3.getInBox() == true) System.out.println(  p3  );

               if(p1.getInBox() == false & p2.getInBox() == false & p3.getInBox() == false) System.out.println("nothing to show");
            }
            if (i == 5) {
                System.out.println("To payment: " + k1.getToPayment());
                i++;
            }


        } while (i != 6);


    }
}
