package com.java8;

import java.util.Arrays;
import java.util.List;

public class CommonArray {

	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(3,4,5,6,7,9,8);
		List<Integer> list2= Arrays.asList(1,2,3,4,5,22,44);
		list1.stream().filter(list2::contains)
		.forEach(s-> System.out.print(+s+" " ));
	}
}
