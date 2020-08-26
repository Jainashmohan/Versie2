package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	    //opdracht1(10, 5);
	    //opdracht2(250, 500);
	    //opdracht3(13);
        //opdracht4();
        // opdracht5();
        int[] lijst = {13, 7, 1};
        System.out.println("Does number 20 exist: "+contains(lijst,13 ) );
    }

    public static void opdracht1(double oud, double nieuw){
        System.out.println( "-----Opdracht1-----");
        double prijs = ((oud - nieuw)/oud)*100;
        System.out.println( "Het percentage is "+ prijs);
    }

    public static void opdracht2(int startGrens, int eindeGrens){
        System.out.println( "-----Opdracht2-----");
        for (int i = startGrens; i <= eindeGrens; i++){
            double result = i%6;
            System.out.println( "Getal nummer: "+ i +", Modulo 6: "+result);
        }
    }

    public static void opdracht3(int value){
        System.out.println( "-----Opdracht3-----");
        double[] array = new double [13];
        // doe berekening en vul de array via loop tot de ingevoerde value
        for (int i = 0; i <= (value -1); i++){
            array[i] = Math.pow((i+1),3);
        }

        System.out.println( "Values");
        // druk alle cijfer/value van de array/lijst
        for (double item : array) {
            System.out.println( (int)Math.round(item));
        }
    }

    public static void opdracht4(){
        System.out.println( "-----Opdracht4-----");
        int[] lijst = {3,4,5,-1,9,10,-3,3}   ;
        hardVal(lijst);
    }

     public static void hardVal(int[] lijst) {
        int lenght =   lijst.length -1;
        for (int i = 0; i <= lenght; i++){
            if (i == lenght ) {
               break;
            }
            else {
                int current = lijst[i];
                int next = lijst[i + 1];
                int difference = next - current;
                if (Math.abs(difference) > 10){
                    System.out.println(  "Auw!");
                    break;
                }else{  System.out.println( "Vlak!" ); }
            }
         }
     }

     public static void opdracht5(){
         System.out.println( "-----Opdracht5-----");
        int[] lijst = {13, 7, 1};
        raden(lijst);
     }

     public static void raden(int[] lijst){
        List<Integer> list = Arrays.stream(lijst).boxed().collect(Collectors.toList());
        int poging = 1;
        List<Integer> listGevondenNummer =  new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
          while (poging <= 10){
          System.out.println("Voer nummer in:");
          int invoer = Integer.parseInt(in.nextLine());
          if (list.contains(invoer)){
              poging++;
              listGevondenNummer.add(invoer);
              list.remove(list.lastIndexOf(invoer));
              if(listGevondenNummer.size() == lijst.length) {
                  System.out.println("Yes!");
                  break;
              }
          }
          else{

              if(poging > 10){System.out.println("No!");}
              System.out.println("Invoer waarde niet gevonden. Je heb nog: "+( 10- poging)+ " poging");
              poging++;
           }
        }
     }

     public static boolean contains(int[] array, int value){
        boolean result = false;
         for (int item: array) {
                  if (item == value){
                      result = true;
                      break;
                  }
         }
         return  result;
     }
}
