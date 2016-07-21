package chapter1.ch1_1;

public class Ex1_1_26 {
	public static void sort(int a, int b, int c){
		int t;
		if (a > b){
			t = a; a = b; b = t;
		}
		if (a > c){
			t = a; a = c; c = t;
		}
		if (b > c){
			t = b; b = c; c = t;
		}
		System.out.printf("a=%d,b=%d,c=%d\n", a,b,c);
	}
	
	public static void main(String[] args){
		sort(1,2,3);
		sort(1,3,2);
		sort(2,1,3);
		sort(2,3,1);
		sort(3,1,2);
		sort(3,2,1);
	}
}
