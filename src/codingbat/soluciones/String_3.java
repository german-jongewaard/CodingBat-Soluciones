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
     
        
        
        
        
            
}
