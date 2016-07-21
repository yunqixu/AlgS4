package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_29 {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else {
				int result = mid;
				while (result >= 0 && a[result] == key) result--;
				return result + 1;
			}
		}
		return -1;
	}
	
	public static int count(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else {
				int left = mid;
				while (left >= 0 && a[left] == key) left--;
				//System.out.println(left);
				int right = mid;
				while (right < a.length && a[right] == key) right++;
				//System.out.println(right);
				return(right - left - 1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,5,5,5,5,8,9,10};
		int key = 5;
		int result = rank(key,a);
		System.out.println(result);
		int result1 = count(key,a);
		System.out.println(result1);
	}
}
