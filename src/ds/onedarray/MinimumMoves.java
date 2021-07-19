package ds.onedarray;

import java.util.Scanner;

public class MinimumMoves {
    public static void main(String[] args) {/*
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt(); //get numbers of mountains
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) nums[i] = sc.nextInt();

        int moves = 0;
        boolean allZero = false;
        while (!allZero) {
            allZero = true;
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    if (nums[i] % 2 == 0) {
                        nums[i] /= 2;
                    } else {
                        nums[i]--;
                    }
                    moves++;
                    allZero = false;
                }
            }
            for (int i = 0; i < len; i++) {
                System.out.print(nums[i] + "|");
            }
            System.out.println();
        }
        System.out.println(moves);
    */
    }
}


class TestClass {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = solve(arr, n, 0);
        System.out.println(ans);
    }

    static int solve(int[] arr, int n, int count) {
        if (allZero(arr)) {
            return count;
        }

        if (allEven(arr)) {
            for (int i = 0; i < n; i++) {
                arr[i] /= 2;
            }
            count++;
        }

        for (int i = 0; i < n; i++) {
            if ((arr[i] % 2) != 0) {
                arr[i]--;
                count++;
            }
        }
        return solve(arr, n, count);
    }

    static boolean allEven(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean allZero(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
