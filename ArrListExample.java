package DefinitionExample;

import java.util.ArrayList;

public class ArrListExample {
	public static void main(String[]args) {
	ArrayList<Integer> li=new ArrayList<>();
	li.add(13);
	li.add(24);
	li.add(42);
	li.add(52);
	li.forEach((x)->System.out.println(x));
	//System.out.println(li);
	}

}
