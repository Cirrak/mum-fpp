package edu.mum.cs.cs390.lab.lab02;

import java.util.Arrays;

public class Prog6 {

	public static String[] removeDups(String[] a){
		
		String[] unique = new String[a.length];
		
		int uniqueCount = 0 ;
		for(int i = 0 ;  i< a.length ; i++)
		{
			boolean duplicate = false; 
			
			for(int j = 0 ; j < unique.length; j++)
			{
				
				if(a[i] == unique[j])
				{
					duplicate = true;
					break;
				}
			}
			
			if(!duplicate)
			{
				unique[uniqueCount] = a[i];
				uniqueCount++;
			}
		}
				
		String[] result = Arrays.copyOf(unique, uniqueCount);		
		return 	result;
	}
	

	

}