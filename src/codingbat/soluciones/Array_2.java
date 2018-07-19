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
    // mean average of the values, except not counting the largest and smallest 
    // values in the array. Use int division to produce the final average. You 
    // may assume that the array is length 3 or more.   
    public int centeredAverage(int[] nums)
    {
        int max = nums[0];
            int min = nums[0];
            int sum = nums[0];
            for(int i = 1; i < nums.length; i++)
            {
                    sum += nums[i];
                    if(nums[i] > max)
                        max = nums[i];
                    else if(nums[i] < min)
                        min = nums[i];
            }    
            return (sum-max-min) / (nums.length - 2);
    }
    
    // Return the sum of the numbers in the array, returning 0 for an empty array. 
    // Except the number 13 is very unlucky, so it does not count and numbers 
    // that come immediately after a 13 also do not count.
    public int sum13(int[] nums) 
    {
        int sum = 0;    
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 13)    
                    i++;
            else
                    sum += nums[i];
        }
	return sum;
    }    
    
    // Return the sum of the numbers in the array, except ignore sections of 
    // numbers starting with a 6 and extending to the next 7 (every 6 will be 
    // followed by at least one 7). Return 0 for no numbers. 
    public int sum67(int[] nums){
                
                int sum = 0;
                boolean sixMode = false;
                for(int i = 0; i < nums.length; i++)
                {
                        if(sixMode)    
                        {
                               if(nums[i] == 7)  
                                        sixMode = false;
                        }
                        else if(nums[i] == 6)
                                sixMode = true;
                        else
                                sum += nums[i];
                }        
                return sum;
    }
            
            
    // Given an array of ints, return true if the array contains 
    // a 2 next to a 2 somewhere.
    public boolean has22(int[] nums)
    {
        for(int i = 0; i < nums.length-1; i++)
        {
                if(nums[i] == 2 && nums[i+1] == 2)
                            return true;
                }
                return false;
    }
    
    
    // Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean lucky13(int[] nums)
    {
            for(int i = 0; i < nums.length; i++)        
            {
                    if(nums[i] == 1 || nums[i] == 3)  
                                return false;
            }
            return true;        
    }        
                 
    // Given an array of ints, return true if the sum of all the 2's 
    // in the array is exactly 8.
    public boolean sum28(int[] nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
                if(nums[i] == 2)    
                            sum += 2;
        }
        return (sum == 8);        
    }    
    
    // Given an array of ints, return true if the number of 1's is 
    // greater than the number of 4's
    public boolean more14(int[] nums)
    {
            int balance = 0;      
            for(int i = 0; i < nums.length; i++)
            {
                    if(nums[i] == 1)    
                                balance++;
                    else if(nums[i] == 4)
                                balance--;
            }
            return (balance > 0);  
    }        
    
    // Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums)
    {
            for(int i = 0; i < nums.length; i++)
            {
                    if(nums[i] != 1 && nums[i] != 4) 
                                return false;
            }
            return true;        
    }

    // Given an array of ints, return true if it contains no 1's or it contains no 4's.        
    public boolean no14(int[] nums)
    {
            boolean noOne = true, noFour = true;
            for(int i = 0; i < nums.length && (noOne || noFour); i++)
            {
                        if(nums[i] == 1)  
                                    noOne = false;
                        else if(nums[i] == 4)            
                                    noFour = false;
    
            }	
            return (noOne || noFour);            
    }
    
    // We'll say that a value is "everywhere" in an array if for every 
    // pair of adjacent elements in the array, at least one of the pair 
    // is that value. Return true if the given value is everywhere in the array.
    public boolean isEverywhere(int[] nums, int val)
    {
            for(int i = 0; i < nums.length-1; i++)
            {
                    if(nums[i] != val && nums[i+1] != val)
                                return false;
    
            }  
            return true;        
    }
    
    // Given an array of ints, return true if the array contains a 2 next 
    // to a 2 or a 4 next to a 4, but not both.
    public boolean either24(int[] nums){
        
        int no2pair = 1, no4pair = 1;
        for(int i = 0; i < nums.length - 1 && (no2pair + no4pair != 0); i++){
            if(nums[i] == 2 && nums[i+1] == 2)
                no2pair = 0;
            else if(nums[i] == 4 && nums[i+1] == 4)
                no4pair = 0;
            }
        return ((no2pair ^ no4pair) == 1);
    }
    // Given arrays nums1 and nums2 of the same length, for every element in nums1, 
    // consider the corresponding element in nums2 (at the same index). Return the 
    //count of the number of times that the two elements differ by 2 or less, but are not equal. 
    public int matchUp(int[] nums1, int[] nums2){
        int count = 0;
        int diff;
        for(int i = 0; i < nums1.length; i++)
    }
    
    
    
    
}   
 
