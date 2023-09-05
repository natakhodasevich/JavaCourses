package lesson2;

import java.util.Arrays;

public class method8 {
    public static void main(String[] args) {
        int N = 5;
        int[][] twoD = new int[N][N];

        for (int i = 0; i < N; i++) {
            twoD[i][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}





