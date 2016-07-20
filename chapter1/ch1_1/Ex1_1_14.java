package chapter1.ch1_1;

public class Ex1_1_14 {
	public static int lg(int N){
		int result = -1;
		while (N > 0){
			N = N / 2;
			result += 1;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(lg(1024));
		System.out.println(lg(1022));
	}
}
