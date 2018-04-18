package codingbat.soluciones;

/**
 *
 * @author german
 * 
 */
public class String_3 {
    
    // Given a string, count the number of words ending in 'y' or 'z' -- so the 
    // 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
    // (not case sensitive). We'll say that a y or z is at the end of a word 
    // if there is not an alphabetic letter immediately following it. (Note: 
    // Character.isLetter(char) tests if a char is an alphabetic letter.)
    public int countYZ(String str)
    {
            int count = 0;
            int limit = str.length() - 1;
            char ch;
            str = str.toLowerCase();
            ch = str.charAt(0);
            for(int i = 1; i <= limit; i++)
            {
                    if(ch == 'y' || ch == 'z')
                    {
                            ch = str.charAt(i);
                            if(!Character.isLetter(ch))
                                    count++;
                    }
                    else
                            ch = str.charAt(i);
            }
            if(ch == 'y' || ch == 'z')
                    count++;
            return count;
    }
    
    // Given two strings, base and remove, return a version of the base string 
    // where all instances of the remove string have been removed (not case 
    // sensitive). You may assume that the remove string is length 1 or more. 
    // Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    public String withoutString(String base, String remove)
    {
            int blen = base.length();
            int rlen = remove.length();
            int current = 0;
            int place;
            StringBuilder stbuild = new StringBuilder(blen);
            String blow = base.toLowerCase();
            String rlow = remove.toLowerCase();
            place = blow.indexOf(rlow);
            while(place != -1)
            {
                    for(; current < place; current++)
                    { 
                            stbuild.append(base.charAt(current));
                    }
                    current = place+rlen;
                    place = blow.indexOf(rlow, current);
            }
            for(; current < blen; current++)        
            {
                            stbuild.append(base.charAt(current));    
            }
            return stbuild.toString(); 
    }        
                            
    // Given a string, return true if the number of appearances of "is" anywhere
    // in the string is equal to the number of appearances of "not" anywhere in
    // the string (case sensitive). 
    public boolean equalIsNot(String str)
    {
                int balance = 0;
                int p;
                p = str.indexOf("is");
                while(p != -1)
                {   
                            balance++;
                        p = str.indexOf("is", p+2);
                        }
                        p = str.indexOf("not");
                while(p != -1)
                {
                            balance--;    
                        p = str.indexOf("not", p+3);    
                        }
                        return (balance == 0); 
    }
    
    // We'll say that a lowercase 'g' in a string is "happy" if there is 
    // another 'g' immediately to its left or right. Return true if all the 
    // g's in the given string are happy. 
    public boolean gHappy(String str)
    {
            int check = 0; 
            int limit = str.length();
        for(int i = 0; i < limit; i++)    
        {
                if(str.charAt(i) == 'g')
                {
                        check = 0;
                        if(i > 0)
                        {
                                        if(str.charAt(i-1) != 'g')
                                                check++;
                                }
                                else
        
        
            
}
