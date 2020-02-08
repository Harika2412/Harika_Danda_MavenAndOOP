package com.mycompany.app;
import java.util.Arrays;

public class Chocolate implements NewYearGift
{
	double cost[];
	double chocoWeight;
	int chocolatesCnt;
	double chocolateWeights[];
	Chocolate(int number,double weight[],double cost[])
	{
		chocolatesCnt=number;
		chocolateWeights=weight;
		chocoWeight=0;
		this.cost=cost;
	}
	public void calculateWeight()
	{
		double totWeight;
		for(int i=0;i<chocolateWeights.length;i++)
			chocoWeight=chocoWeight+chocolateWeights[i];
		totWeight=chocoWeight*chocolatesCnt;
		System.out.println("Total Weight of Chocolates in Gift:"+totWeight);
	}
	public void countWithinRange(int low,int high)
	{
		int chocosInRange=0;
		for(int i=0;i<cost.length;i++)
			if(cost[i]<=high && cost[i]>=low)
				chocosInRange+=1;
		System.out.println(chocosInRange);
	}
	public void sort()
	{
		Arrays.sort(cost);
		for(int i=0;i<cost.length;i++)
			System.out.print(cost[i]+" ");
		System.out.println("");
	}
}