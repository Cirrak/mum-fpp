package edu.mum.cs.cs390.lab.lab02.test;

import edu.mum.cs.cs390.lab.lab02.Prog6;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestProg6 {

	@Test
	public void testRemoveDups() {

		Prog6 prog = new Prog6();
		
		String[] a = new String[] {"horse", "dog", "cat", "horse", "dog" };	
	   			
		String[] actuals = prog.removeDups(a);
		
		boolean duplicateExist = false;

		for (int i = 0; i < actuals.length; i++) {
			for (int j = i + 1; j < actuals.length - 1; j++) {
				if (actuals[i] == actuals[j]) {
					duplicateExist = true;
					break;

				}
			}
		}
		
		assertTrue(!duplicateExist);
			
		// check every element of actual is in the original array input
		boolean falseResult = false;		
		for(int i = 0  ; i < actuals.length; i++)
		{
			boolean isInOrginalArray = false;
			for(int j = 0 ; j < a.length ; j++)
			{
				if(actuals[i] == a[j])
				{
					isInOrginalArray = true;
					break;
				}
			}
			
			if(!isInOrginalArray)
			{
				falseResult = true;
				break;
			}
		}		
		assertTrue(!falseResult);
	}

}