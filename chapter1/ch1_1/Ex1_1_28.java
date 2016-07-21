package chapter1.ch1_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1_1_28 {
	public static ArrayList<Integer> delete(int[] array){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++){
			if (list.contains(array[i])){
				continue;
			}
			list.add(array[i]);
		}
		return list;
	}
	public static void main(String[] args){
		int[] a = {1,22,34,4,22,34,7,7,9,1};
		Arrays.sort(a);
		ArrayList<Integer> list = delete(a);
		for (int i : list) System.out.println(i);
	}
}
