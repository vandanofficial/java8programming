package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvennoByList {
	public static void main(String[] args) {
		List<Integer>data=Arrays.asList(10,5,23,4,6,20,27);
		List<Integer>newdata=data.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(newdata);
	}

}
