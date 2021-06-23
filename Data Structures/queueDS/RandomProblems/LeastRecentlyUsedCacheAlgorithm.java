package RandomProblems;

import java.util.LinkedList;
import java.util.Queue;

public class LeastRecentlyUsedCacheAlgorithm {
	
	static int windowSize=3;
	static int[] pageRequests= {1,2,3,4,1,3};
	//111
	static int pageFaults=0;
	static Queue<Integer>cache=new LinkedList<>();

	public static void main(String[] args) {
		
		for(int i=0;i<pageRequests.length;i++)
		{

			if(cache.contains(pageRequests[i]))
			{
				if(cache.size()>=windowSize)
				{
					cache.remove();
					cache.add(pageRequests[i]);
				}
				else
				{
					cache.add(pageRequests[i]);
				}
				
			}
			else
			{
				if(cache.size()>=windowSize)
				{
					cache.remove();
				}
				cache.add(pageRequests[i]);
				pageFaults++;
			}
		}
		System.out.println("Total Page Faults are "+pageFaults);
		System.out.println("Present cache include "+cache);
	}

}


/*
 * 
					OUTPUT:
					Total Page Faults are 5
					Present cache include [4, 1, 3]
					
 * 
 */
