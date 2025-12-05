
/**
 * This class runs the CryptoQuote class
 */
import java.io.*;
import java.util.*;

public class RunCryptoQuote
{
    public static void main() throws IOException
    {
        Scanner input = new Scanner(new File("crypto.txt"));
        Scanner kinput = new Scanner(System.in);
        while(input.hasNext())
        {
            String pt = input.nextLine();
            System.out.println("The original plaintext is: " + pt);
            System.out.println("Enter the shift: 1 - 25");
            int shift = kinput.nextInt();
            Q3CryptoQuote cq = new Q3CryptoQuote(shift);
           
            String ct = cq.encrypt(pt);
            System.out.println("The ciphertext is: " + ct);
            String answer = cq.decrypt(ct);
            System.out.println("The decrypted plaintext is: " + answer);
            System.out.println();

        }
    }
}
