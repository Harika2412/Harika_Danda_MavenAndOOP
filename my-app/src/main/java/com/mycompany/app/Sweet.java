package com.mycompany.app;
import java.util.Arrays;

class Sweet implements NewYearGift
{
	double cost[];
	double sweetsWeight;
	int sweetsCnt;
	double sweetsWeights[];
	Sweet(int number,double weight[],double cost[])
	{
		sweetsCnt=number;
		sweetsWeights=weight;
		sweetsWeight=0;
		this.cost=cost;
	}
	public void calculateWeight()
	{
		double totWeight;
		for(int i=0;i<sweetsWeights.length;i++)
			sweetsWeight=sweetsWeight+sweetsWeights[i];
		totWeight=sweetsWeight*sweetsCnt;
		System.out.println("Total sweets weight in gift:"+totWeight);
	}
	public void sort()
	{
		Arrays.sort(cost);
		int i;
		for(i=0;i<cost.length;i++)
			System.out.print(cost[i]+" ");
		System.out.println("");
	}
	public void countWithinRange(int low,int high)
	{
		int sweetsInRange=0;
		for(int i=0;i<cost.length;i++)
			if(cost[i]<=high && cost[i]>=low)
				sweetsInRange+=1;
		System.out.println(sweetsInRange);
	}
}