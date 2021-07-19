package ds.onedarray;

import java.util.Scanner;

/*
Hacker earth
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-modulo-2-0cb15ded/
 */
public class Modulo {

    public static void main(String args[]) throws Exception {
       Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        char ch[] = scn.next().toCharArray();

        long pre[] = new long[n];
        long res = 0;

        for (int i = 0; i < n; i++) {
            ch[i] -= '0';
            res = (res * 10 + ch[i]) % k;
            pre[i] = res;
        }

        long reg = 0, p = 1;
        for (int i = n - 1; i >= 0; --i) {
            long cur = ((i - 1 >= 0 ? pre[i - 1] : 0) * p + reg) % k;
            res = Math.max(res, cur);
            reg = (p * ch[i] + reg) % k;
            p = p * 10 % k;
        }
        scn.close();
    }
}
