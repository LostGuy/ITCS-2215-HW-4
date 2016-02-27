public class Driver
{	
	public static void main(String[] args)
	{
		//Long sequence going B, W, B, W...
		char[] disks = {'B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W','B', 'W'};
		
		//Print out initial state
		for(int j = 0; j < disks.length; j++)
		{
			System.out.print(disks[j]);
		}
		System.out.println();
		
		//Call the function
		swapDisks(disks);
	}
	
	
	/**
	 * Swaps disks around until all of the light disks are on the left half of the array and all
	 * of the dark disks are on the right half
	 * @param c - array of 2 different characters
	 */
	private static void swapDisks(char[] c)
	{
		//Main algorithm loops only half of the array since it puts the disk in the correct place on
		//both sides working towards the middle
		for(int i = 0; i < c.length/2; i++)
		{
			//Hold the temp variable
			char temp;
			
			//Start from next iteration
			int k = i;
					
			//Move right until it's out of memory
			while(k + 1 < c.length)
			{
				//Assign temp
				temp = c[k];
						
				//Swap to the left
				c[k] = c[k+1];
						
				//Swap to the right
				c[k+1] = temp;
						
				//Increment current position
				k++;
			}
					
			//Print out after each iteration
			for(int j = 0; j < c.length; j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}
}