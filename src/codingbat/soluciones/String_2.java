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
    
    
}
