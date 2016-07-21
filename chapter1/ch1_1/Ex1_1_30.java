package chapter1.ch1_1;

public class Ex1_1_30 {
	public static int gcd(int p, int q){
		if (q == 0) return p;
		return gcd(q, p%q);
	}
	public static boolean[][] createArray(int N){
		boolean[][] array = new boolean[N][N];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				if (gcd(i,j) == 1) array[i][j] = true;
			}
		}
		return array;
	}
	public static void main(String[] args){
		boolean[][] array = createArray(10);
		for (int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
