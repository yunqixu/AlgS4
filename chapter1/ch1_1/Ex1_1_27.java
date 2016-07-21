package chapter1.ch1_1;

public class Ex1_1_27 {
	public static double binomial(int N, int K, double p){
		System.out.println(N+" "+K);
		if (N == 0 && K == 0) return 1.0;
		if (N < 0 || K < 0) return 0.0;
		return (1.0 - p) * binomial(N-1, K ,p) + p * binomial(N-1, K-1, p);
	}
	public static void main(String[] args){
		System.out.println(binomial(100,50,0.5));
	}
}
