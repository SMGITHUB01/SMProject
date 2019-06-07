package com.git.main;

import com.git.add.Addition;

public class CalculatorMain {
	public static void main(String[] args) {
		Addition add=new Addition();
		int sum=add.add(10, 20);
		System.out.println(sum);
	}

}
