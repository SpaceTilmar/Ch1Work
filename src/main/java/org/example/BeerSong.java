package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum ==1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take on down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop

    } // end main
} // end class