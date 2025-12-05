
/**
 * Hildebrandt
 * Print out the ascii codes for a variety of different symbols
 * Casting char as an int
 */
public class ASCII
{
    public static void main()
    {
        
        System.out.println("List of ascii value followed by character");
        System.out.println();
        for (int x = 0; x < 200; x++)
        {
            System.out.print(x + " " + (char)x + "\t");
            if (x != 0 && x % 15 == 0)
                System.out.println();
        }
        
        System.out.println();
        System.out.println("List of character followed by ascii value");
        System.out.println();
        for (char c = '$'; c <= 'z'; c++)
        {
             System.out.print(c + " " + (int)c + "\t");
             if ((int)c != 0 && (int)(c % 15) == 0)
                System.out.println();
            }
    }
}