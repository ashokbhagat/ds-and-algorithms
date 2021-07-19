package ds.twodarray;

import java.util.Scanner;

public class GridAndPhrase {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 's' && i + 3 < n && arr[i + 1][j] == 'a' && arr[i + 2][j] == 'b' && arr[i + 3][j] == 'a')
                    count++;
                if (arr[i][j] == 's' && j + 3 < m && arr[i][j + 1] == 'a' && arr[i][j + 2] == 'b' && arr[i][j + 3] == 'a')
                    count++;
                if (arr[i][j] == 's' && i + 3 < n && j + 3 < m && arr[i + 1][j + 1] == 'a' && arr[i + 2][j + 2] == 'b' && arr[i + 3][j + 3] == 'a')
                    count++;
                if (arr[i][j] == 's' && i - 3 >= 0 && j + 3 < m && arr[i - 1][j + 1] == 'a' && arr[i - 2][j + 2] == 'b' && arr[i - 3][j + 3] == 'a')
                    count++;
            }
        }

        System.out.println(count);
    }

}
