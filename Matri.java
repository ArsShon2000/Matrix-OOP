package Matrix;
import java.util.Scanner;
public class Matri {
    public static void main(String [] args){
//        Matrix1. Даны целые положительные числа M и N. Сформировать целочислен-
//                ную матрицу размера M × N, у которой все элементы I-й строки имеют зна-
//                чение 10·I (I = 1, ..., M).
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(), N = in.nextInt();
        int I = 1;
        int mtx [][] = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                mtx[i][j] = 10 * I;
                I++;
                System.out.print(mtx[i][j] + " ");
            }
            I = 1;
            System.out.println();
        }
    }
}
