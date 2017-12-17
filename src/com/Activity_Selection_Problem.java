package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Activity_Selection_Problem {
	public static void maximumActivitiesPossible(Map<Integer, Integer> map,int[] Sortedfinish){	
		Map<Integer, Integer> newMap=new HashMap<Integer, Integer>();
		newMap.put(Sortedfinish[0], map.get(Sortedfinish[0]));
		for (int j = 0; j < Sortedfinish.length-1; j++) {
			if(Sortedfinish[j]<=map.get(Sortedfinish[j+1])){

				System.out.println(Sortedfinish[j]);
				newMap.put(Sortedfinish[j+1],map.get(Sortedfinish[j+1]));}
		}
	}

	public static void main(String[] args) {
		int start[]={1,0,1,4,2,5,3,4};
		int finish[]={3,4,2,6,9,8,5,5};
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < start.length; i++) {
			map.put(start[i], finish[i]);
		}
		Arrays.sort(finish);
		maximumActivitiesPossible(map,finish);
	}
}
