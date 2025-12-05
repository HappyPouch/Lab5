/**
 * Lab 5 Strings Q3
 * CryptoQuote.
 * 
 * Savi K.
  */
public class Q3CryptoQuote
{
   private int shift;

    public Q3CryptoQuote(int s)
    {   
        shift = s;
    }

    
    public int getShift()
    {
        return shift;
    }

    public String decrypt(String cipher)
    {
        String result = "";
        
        for(int i = 0; i < cipher.length(); i++){
            char ch = cipher.charAt(i);
            
            // check if ch is between a and z to shift and if not just return ch
            if(ch >= 'a' && ch <= 'z') {
                char shifted = (char)(ch - shift);
                // if index is less then a then add 26 to reset
                if (shifted < 'a') {
                    shifted += 26;
                }
                result += shifted;
            }
            else{
                result += ch;
            }
        }
        
        return result;
    }
    

    public String encrypt(String phrase)
    {
        String result = "";

        for (int i = 0; i < phrase.length(); i++) {
            // put each letter into variable ch
            char ch = phrase.charAt(i);

            // if letters are between a and z, add the shift to encrypt the entire string
            if (ch >= 'a' && ch <= 'z') {
                // add shift to ch and convert back to char and add into the shifted variable
                char shifted = (char)(ch + shift);
                // if greater then z then -26
                if (shifted > 'z') {
                    shifted -= 26;
                }
                result += shifted;
            } else {
                // if not, then return it as it is
                result += ch;
            }
        }

        return result;
    }
}

    