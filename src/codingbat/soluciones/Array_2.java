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
        return count;
    }

    // Given an array length 1 or more of ints, return the difference between
    // the largest and smallest values in the array. Note: the built-in 
    // Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller 
    // or larger of two values.
    public int bigDiff(int[] nums)
    {
        int max = nums[0];        
        int min = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > max)
                max = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        }  
        return (max-min);
    }

// Return the "centered" average of an array of ints, which we'll say is the
// mean average of the values, except not counting the largest and smallest values in the array. Use int division to produce the final average. You may assume that the array is length 3 or more.    
}   
 
