package ds.twodarray;
//1
//3 3
//8 8 3
//6 2 4
//12 1 2

import java.util.HashSet;
import java.util.Scanner;

public class UnsafeElements {


    static void addToSet(HashSet<Integer> set, int value) {
        if (set.contains(value)) {
            return;
        }
        set.add(value);
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while (--t >= 0) {

            int r =sc.nextInt();
            int c = sc.nextInt();

            int min = 999999999;
            int max = 0;
            int[][] arr = new int[r][c];

            //Read the array and find min and max
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int val = sc.nextInt();
                    arr[i][j] = val;
                    if (val > max) {
                        max = val;
                    }
                    if (val < min) {
                        min = val;
                    }
                }
            }

            int rows = 0;
            HashSet<Integer> columns = new HashSet<Integer>();
            for (int i = 0; i < r; i++) {
                boolean pass = false;
                for (int j = 0; j < c; j++) {
                    int val = arr[i][j];
                    if (val == max || val == min) {
                        addToSet(columns, j);
                        pass = true;
                    }
                }
                if (pass) {
                    rows++;
                }
            }

            System.out.println((r-rows) * (c - columns.size()));

        }

    }

}

