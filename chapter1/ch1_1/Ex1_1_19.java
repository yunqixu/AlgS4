package chapter1.ch1_1;

import java.util.ArrayList;

import edu.princeton.cs.algs4.StdOut;
public class Ex1_1_19 {
	public static long F(int N){
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	public static long F1(int N){
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(0L);
		list.add(1L);
		for (int i = 2; i <= N; i++){
			list.add(list.get(i-1) + list.get(i-2));
		}
		return list.get(N);
	}
	
	public static void main(String[] args){
		for (int n = 0; n < 10; n++){
			StdOut.println(n+" "+F(n));
			StdOut.println(n+" "+F1(n));
		}
	}
}
