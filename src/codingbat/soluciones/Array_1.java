package codingbat.soluciones;

/**
 *
 * @author german
 * 
 */

public class Array_1 {
    
    // Given an array of ints, return true if 6 appears as either the first 
    // or last element in the array.
    // The array will be length 1 or more. 
    public boolean firstLast6(int[] nums)
    { 
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }  
    
    
    // Given an array of ints, return true if the array is length 1 or more, and the 
    // first element and the last element are the same. 
    public boolean sameFirstLast(int[] nums)
    {         
        return (nums.length >= 1 && nums[0] == nums[nums.length-1]);
    }
            
    // Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public int[] makePi()        
            
            
            
            
            
            
            
            
            
            
            
            
            
}
