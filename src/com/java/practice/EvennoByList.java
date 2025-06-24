package com.java.practice;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//used filter method
public class EvennoByList {
	public static void main(String[] args) {
// find even number by list
		//List<Integer>data=Arrays.asList(10,5,23,4,6,20,27);
		//List<Integer>newdata=data.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(newdata);
	    //}
		
// find odd number by list
		//List<Integer> data = Arrays.asList(10, 5, 23, 4, 6, 20, 27);
		//List<Integer> newdata = data.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		//System.out.println(newdata);
		//}
		
// How many times Suraj occurs(name doesn't matter in uper & lower case )
		//List<String> data = Arrays.asList("milk","Suraj","welcome","Sohan","Suraj");
		//List<String> newdata = data.stream().filter(n ->n.equalsIgnoreCase("Suraj")).collect(Collectors.toList());
		//System.out.println(newdata);
		//}
		// o/p=[Suraj,Suraj]
		
// Give me name which is start from latter "s".[start name from capital here, so we write capital "S" in formula].		
		//List<String> data = Arrays.asList("milk","Suraj","welcome","Sohan","Suraj");
		//List<String> newdata = data.stream().filter(n ->n.startsWith("S")).collect(Collectors.toList());
		//System.out.println(newdata);
		//System.out.println(newdata.size());
	    //}
		// o/p= [Suraj, Sohan, Suraj],3
		
// Used Map Method
		
// All string convert to upper case		
		//List<String> data = Arrays.asList("milk", "Suraj", "welcome", "sohan", "Suraj");
		//List<String> newdata = data.stream().map(n ->n.toUpperCase()).collect(Collectors.toList());
		//System.out.println(newdata);
		//System.out.println(newdata.size());
        // o/p= [MILK, SURAJ, WELCOME, SOHAN, SURAJ],5
		
//	Every data multiple by 2 from list.	
		//List<Integer> data = Arrays.asList(10, 20, 30, 40);
		//List<Integer> newData = data.stream().map(n -> n * 2).collect(Collectors.toList());
		//System.out.println(newData);
		
//	other methods
// sort some data by list		
		
		//List<Integer> data = Arrays.asList(100, 20,55, 200);
		//List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
		//System.out.println(newData);
		// o/p= [20, 55, 100, 200]
		
// Short some String by list
		//List<String> data = Arrays.asList("Suraj","Deepa","Lipsa","Amrita");
		//List<String> newData = data.stream().sorted().collect(Collectors.toList());
		//System.out.println(newData);
		
// Give me unic record from the collection & value is duplicate.
// remove duplicate elements by list
		List<String> data = Arrays.asList("Suraj", "Deepa","Suraj","Lipsa","Deepa","Amrita");
		List<String> newData = data.stream().distinct().collect(Collectors.toList());
		System.out.println(newData);
	}
}
