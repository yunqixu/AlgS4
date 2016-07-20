package chapter1.ch1_1;

import java.util.Random;

public class Ex1_1_13 {
	public static void main(String[] args){
		int M = 5;
		int N = 4;
		Random r = new Random();
		double[][] array = new double[M][N];
		double[][] trans = new double[N][M];
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				array[i][j] = r.nextDouble();
			}
		}
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				trans[j][i] = array[i][j];
			}
		}
	}
}
