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
            {    for(; nums[j] != 4; j++);
                nums[j] = nums[i+1];
                nums[i+1] = 4;
            }    
        }        
        return nums;
    }    
    
    // (This is a slightly harder version of the fix34 problem.) Return 
    //an array that contains exactly the same numbers as the given array, 
    //but rearranged so that every 4 is immediately followed by a 5. Do not 
    //move the 4's, but every other number may move. The array contains the 
    //same number of 4's and 5's, and every 4 has a number after it that is 
    //not a 4. In this version, 5's may appear anywhere in the original array.    
    public int[] fix45(int[] nums)
    { 
        int j = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 4 && nums[i+1] != 5)
            {
                for(; !(nums[j] == 5 && (j == 0 || j > 0 && nums[j-1] != 4)); j++);
                       nums[j] = nums[i+1];
                       nums[i+1] = 5;
            }
        }    
        return nums;
    }     
    
    // Given a non-empty array, return true if there is a place to split the 
    //array so that the sum of the numbers on one side is equal to the sum of 
    //the numbers on the other side.
    public boolean canBalance(int[] nums)           
    {
        int left = 0;     
        int right;    
        for(int i = 0; i < nums.length - 1; i++)
                left += nums[i];
                right = nums[nums.length-1];
            for(int i = nums.length - 2; i > 0; i--)
            {
                if(left == right)
                    return true;
                left -= nums[i];
                right += nums[i];
            }
            return (left == right);
    }        
            
    // Given two arrays of ints sorted in increasing order, outer and inner, 
    //return true if all of the numbers in inner appear in outer. The best 
    //solution makes only a single "linear" pass of both arrays, taking 
    //advantage of the fact that both arrays are already in sorted order.
    public boolean linearIn(int[] outer, int[] inner)
    {
       boolean notFound;
       for(int inI = 0, outI = 0; inI < inner.length; inI++)
       {
           notFound = true;
           for(; outI < outer.length && notFound; outI++)
           {
               if(inner[inI] == outer[outI])
                   notFound = false;
           }
           if(notFound)
               return false;
       }
       return true;
    }
    
    // Given n>=0, create an array length n*n with the following pattern, shown 
    //here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
    public int[] squareUp(int n)
    {
        int[] arr = new int[n*n];
        int p;
        for(int i = 1; i <= n; i++)
        {
             p = n * i - 1;
             for(int j = 1; j <= i; j++, p--)
                 arr[p] = j;
        }
        return arr;
    }

    // Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,
    //... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the 
    //length of the array will be 1 + 2 + 3 ... + n, which is known to sum 
    to exactly n*(n + 1)/2.









    
        
    
    
    
    
    
}
