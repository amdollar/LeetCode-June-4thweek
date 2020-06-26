package com.leetcode.week4;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	private static Set<Integer> data = new HashSet<>();

	public static void main(String[] args) {
		int[] arr = new int[] {};
		int duplicate = findDuplicate(arr);
		System.out.println(duplicate);
	}

	private static int findDuplicate(int[] arr) {

		for (int i : arr) {
			boolean flag = data.add(i);
			if (flag == false)
				return i;
		}
		return 0;
	}

}
