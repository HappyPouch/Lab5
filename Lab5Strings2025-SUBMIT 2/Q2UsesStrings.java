
/**
 * UsesStrings - complete functions using Strings
 * 
 * Hildebrandt - Lab 5 Strings - palindromes, allVowelsInOrder, Dupledrome, americanize
 * 
 */

public class Q2UsesStrings
{
    //isPalindrome: String --> boolean
    // hint: change everything to lower case
    public boolean isPalindrome(String s)
    {
        // lowercase all
        s = s.toLowerCase();
        String reverse = "";
        
        // make reversed string to check
        for(int i = s.length() - 1; i >=0; i--) {
            reverse += s.charAt(i);
        }

        // check if palindrome
        if (s.equals(reverse)) {
            return true;
        }

        return false;

    }

    // return true if all 5 vowels are present and in order
    // example: facetious --> should be true
    public static boolean allVowelsInOrder(String s)
    {
        // initiate varibales for vowel index and string index and vowels
        int vowelIndex = 0;
        int stringIndex = 0;
        String vowels = "aeiou";

        // check each letter of string one by one through the vowels string
        while(stringIndex < s.length()){
            if(s.charAt(stringIndex) == vowels.charAt(vowelIndex)){
                vowelIndex++;
                if(vowelIndex == 5){
                    return true;
                }
            }
            stringIndex++;
        }

        return false;
    }

    // isDupledrome: String --> boolean
    // returns true if all letters occur as doubles eg. "aabbccdd" --> should be true
    public static boolean isDupledrome(String word)
    {
        // return false if word is not even lettered
        if(word.length() % 2 != 0){
            return false;
        }
        // check if letter after first letter is same or not
        for(int i = 0; i < word.length(); i += 2){
            if(word.charAt(i) != word.charAt(i+1)) {
                return false;
            }
        }
        
        return true;
    }   

    
    public static String americanize(String postal)
    {
        String digits = "";
        // check the indexes which are numbers to add to the digits variable
        for(int i = 0; i < postal.length(); i++){
            char c = postal.charAt(i);
            
            if (c >= '0' && c <= '9'){
                digits += c;
            }
        }
        
        // add 00 to the digits to americanize
        String result = digits + "00";
        return result;
    }


    // Bonus - do after Q3 is done
    //isPunctuationPalindrome: String --> boolean
    // Madam I'm Adam --> should be true
    // ignore spaces and punctuation - if palindrome then true.
    // Hint: create a new String that only has the letters contained in s and 
    //     then call the isPalindrome function.
    public boolean isPunctuationPalindrome(String s)
    {  
        String noPunct = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // check capitals and lowercase letters to add to no punctuation variable
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                noPunct += ch;
            }
        }
        
        // check if palindrome
        return isPalindrome(noPunct);
    }

}

