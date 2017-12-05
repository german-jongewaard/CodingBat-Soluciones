package codingbat.soluciones;

/**
 *
 * @author german
 * 
 */
public class String_2 {
    
    // Given a string, return a string where for every char in the 
    // original, there are two chars.
    public String doubleChar(String str)
    {
            int len = str.length();
            char ch;
            StringBuilder stbuild = new StringBuilder(len*2);
            for(int i = 0; i < len; i++)
            {
                    ch = str.charAt(i);
                    stbuild.append(ch);
                    stbuild.append(ch);
            }
            return stbuild.toString();
    }

    // Return the number of times that the string "hi" appears anywhere in the given string.
    public int countHi(String str)
    {
            int len = str.length()-1;
            int times = 0;
            for(int i = 0; i < len; i++)
            {
                    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                            times++;
            }
            return times;
    }
    
    // Return true if the string "cat" and "dog" appear the same number of 
    // times in the given string.
    public boolean catDog(String str)
    {
            int len = str.length()-2;
            int diff = 0;
            for(int i = 0; i < len; i++)
            {
                    if(str.charAt(i) == 'c')
                    {
                            if(str.charAt(i+1) == 'a' && str.charAt(i+2) == 't')
                                    diff++;
                    }
                    else if(str.charAt(i) == 'd')       
                    {
                            if(str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g')    
                                    diff--;
                    }
	}
        return (diff == 0);  
    }


    // Return the number of times that the string "code" appears anywhere in the 
    // given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public int countCode(String str)
    {
            int times = 0;
            int i = 0;
            int len = str.length()-3;
            while(i <  len)
            {
                    if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e')
                    {
                            times++; 
                            i += 4;
                    }
                    else        
                            i++;
            }
            return times;
    }
    
    // Given two strings, return true if either of the strings appears at the 
    // very end of the other string, ignoring upper/lower case differences 
    // (in other words, the computation should not be "case sensitive"). 
    // Note: str.toLowerCase() returns the lowercase version of a string. 
    public boolean endOther(String a, String b) 
    {
            int aLen = a.length();
            int bLen = b.length();
            String end;
            String temp;
            a = a.toLowerCase();
            b = b.toLowerCase();
            if(aLen >= bLen)
            {
                    end = a.substring(aLen - bLen);
                    temp = b;
            }
            else        
            {
                    end = b.substring(bLen - aLen);
                    temp = a;
        
        
        
    
    
}
