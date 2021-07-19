package ds.onedarray;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.Arrays;
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Scoreboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int len = sc.nextInt();
            int noOfUpdates = sc.nextInt();
            int[] scores = new int[len];
            for (int i = 0; i < len; i++) scores[i] = sc.nextInt();

            while (noOfUpdates-- > 0) {
                int positionToUpdate = sc.nextInt();
                int valueToUpdate = sc.nextInt();
                scores[positionToUpdate - 1] = valueToUpdate;
                ranker(scores);
            }
        }
    }

    private static void ranker(int[] modifiedscores) {
        Arrays.sort(modifiedscores);
        int rank = 2;
        for (int i = modifiedscores.length-1; i > 0; i--) {
            if (modifiedscores[i - 1] == modifiedscores[i]) {
                continue;
            }
            rank++;
        }
        System.out.println(rank);
        modifiedscores=null;
    }

}
