package codingbat.soluciones;

/**
 *
 * @author german
 * 
 */
public class Array_2 {
    
    // Return the number of even ints in the given array. Note: the % "mod" 
    // operator computes the remainder, e.g. 5 % 2 is 1.
    public int countEvens(int[] nums)
    {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {   
            if(nums[i] % 2 == 0)
                count++;
        }    
            
            
}   
 
