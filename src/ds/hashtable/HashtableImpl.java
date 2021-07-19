package ds.hashtable;

import java.util.Scanner;

public class HashtableImpl {

    private static int size = 0;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        String[] names = new String[size];

        for (int i=0;i<size;i++ ) {
            int key = sc.nextInt();
            names[hash(key)] = sc.next();
        }

        int q = sc.nextInt();

        for (int i=0;i<q;i++ ) {
            System.out.println(names[hash(sc.nextInt())]);
        }


    }

    private static int hash(int key){
        return key%size;
    }

}