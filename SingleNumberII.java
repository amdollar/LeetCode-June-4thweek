package com.leetcode.week4;

import java.util.HashMap;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 3, 2 };
		System.out.println(singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (int i : nums) {
			if (map.get(i) == 1) {
				return i;
			}
		}
		return 0;
	}
}
