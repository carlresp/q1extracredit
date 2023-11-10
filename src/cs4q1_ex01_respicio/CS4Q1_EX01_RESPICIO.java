/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4q1_ex01_respicio;

    public class CS4Q1_EX01_RESPICIO {

        public static void main(String[] args) {
        String s1n = "Cowboy Bebop";
        int e1 = 26;
        int r1 = 10;

        String s2n = "Beastars";
        int e2 = 24;
        int r2 = 9;

        String s3n = "Cyberpunk: Edgerunners";
        int e3 = 10;
        int r3 = 8;

        boolean highest = r1 > r2 && r1 > r3;
        System.out.println("\nTV Show 1");
        System.out.println("Name: " + s1n);
        System.out.println("Number of episodes: " + e1);
        System.out.println("My Rating: " + r1);

        System.out.println("\nTV Show 2");
        System.out.println("Name: " + s2n);
        System.out.println("Number of episodes: " + e2);
        System.out.println("My Rating: " + r2);

        System.out.println("\nTV Show 3");
        System.out.println("Name: " + s3n);
        System.out.println("Number of episodes: " + e3);
        System.out.println("My Rating: " + r3);

        System.out.println("\nTotal amount of 24 minute episodes: " + (e1 + e2 + e3));
        System.out.println("Is Cowboy Bebop the highest rated show?: " + highest);
        System.out.println("Average rating of the three series: " + ((r1 + r2 + r3)/3));
      }
    
}
