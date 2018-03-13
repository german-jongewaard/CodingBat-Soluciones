package codingbat.soluciones;

/**
 *
 * @author german
 * 
 */
public class CodingBatSoluciones {

// Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 
public String helloName(String name)
{	return ("Hello " + name + '!');	}


// Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".
public String makeAbba(String a, String b)
{	return (a + b + b + a);	}


// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
// In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
// Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
public String makeTags(String tag, String word)
{ return ('<' + tag + '>' + word + '<' + '/' + tag + '>'); }
 

// Given an "out" string length 4, such as "<<>>", and a word, return a new string
// where the word is in the middle of the out string, e.g. "<<word>>".
// Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
public String makeOutWord(String out, String word)
{ return (out.substring(0, 2) + word + out.substring(2, 4)); }


// Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
// If the string is shorter than length 2, return whatever there is, so "X" yields "X",
// and the empty string "" yields the empty string "".Note that str.length() returns the length of a string.
public String firstTwo(String str)
{
	if(str.length() >= 3)
		return str.substring(0, 2);
	return str;
}


}
