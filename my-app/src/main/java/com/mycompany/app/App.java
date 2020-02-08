package com.mycompany.app;
import java.util.Scanner;
public class App{

	private static Scanner scan;

	public static void main(String[] args) {
		
		int number,low,high;
		double weights[];
		scan = new Scanner(System.in);
		double costs[];
		
		System.out.println("Gift Details:\n");
		System.out.println("Enter number of Sweets:");
		number=scan.nextInt();
		weights = new double[number];
		costs = new double[number];
		System.out.println("Enter weights of "+number+" candies.");
		for(int i=0;i<number;i++)
			weights[i]=scan.nextDouble();
		System.out.println("Enter costs of "+number+" candies.");
		for(int i=0;i<number;i++)
			costs[i]=scan.nextDouble();
		Sweet sweets=new Sweet(number,weights,costs);
		sweets.calculateWeight();
		System.out.println("Sorted order of sweets according to cost:");
		sweets.sort();
		System.out.println("Enter min and max cost range for sweets:");
		low=scan.nextInt();
		high=scan.nextInt();
		System.out.print("No of sweets in given range: ");
		sweets.countWithinRange(low,high);
		
		System.out.println("\nEnter number of chocolates:");
		number=scan.nextInt();
		weights = new double[number];
		costs = new double[number];
		System.out.println("Enter weights of "+number+" chocolates.");
		for(int i=0;i<number;i++)
			weights[i]=scan.nextDouble();
		System.out.println("Enter costs of "+number+" chocolates.");
		for(int i=0;i<number;i++)
			costs[i]=scan.nextDouble();
		Chocolate chocolates=new Chocolate(number,weights,costs);
		chocolates.calculateWeight();
		System.out.println("\nSorted order of chocolates according to cost:");
		chocolates.sort();
		System.out.println("Enter min and max cost range for chocolates:");
		low=scan.nextInt();
		high=scan.nextInt();
		System.out.print("No of Chocolates in given range: ");
		chocolates.countWithinRange(low,high);
	}
}