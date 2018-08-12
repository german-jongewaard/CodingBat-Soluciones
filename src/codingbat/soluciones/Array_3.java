package codingbat.soluciones;

/**
 *
 * @author german
 */
public class Array_3 {

    // Consider the leftmost and righmost appearances of some value in an 
    //array. We'll say that the "span" is the number of elements between 
    //the two inclusive. A single value has a span of 1. Returns the largest 
    //span found in the given array. (Efficiency is not a priority.)
    public int maxSpan(int[] nums) 
    {
        int maxSpan = 0;
        int span;
        int j;
        for(int i = 0; i < nums.length; i++)
        {
            for(j = nums.length - 1; nums[i] != nums[j]; j--);
                span = 1 + j - i;
                if(span > maxSpan)
                    maxSpan = span;
        }
        return maxSpan;
    }    
    
    // Return an array that contains exactly the same numbers as the 
    //given array, but rearranged so that every 3 is immediately followed 
    //by a 4. Do not move the 3's, but every other number may move. The array
    //contains the same number of 3's and 4's, every 3 has a number after it 
    //that is not a 3 or 4, and a 3 appears in the array before any 4.     
    public int[] fix34(int[] nums) 
    {
        int j = 1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 3 && nums[i+1] != 4)
                for(; nums[j] != 4; j++);
                nums[j] = nums[i+1];
                nums[i+1] = 4;
         
    
    
    
    
    
    
    
    
    
    
    
    
}
