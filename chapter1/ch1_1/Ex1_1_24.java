package chapter1.ch1_1;

public class Ex1_1_24 {
	public static int gcd(int p, int q){
		System.out.printf("p=%d, q=%d\n",p,q);
		if (q == 0) return p;
		int r = p % q;
		return gcd(q,r);
	}
	
	public static void main(String[] args){
		System.out.println(gcd(1111111,1234567));
	}
}
