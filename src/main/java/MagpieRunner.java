import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{
    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
    	Magpie maggie = new Magpie();
    	
    	System.out.println (maggie.getGreeting());
    	Scanner in = new Scanner (System.in);
    	String statement = "";
    	
    	while (!statement.equals("Bye"))
    	{
            while (true){
                statement = in.nextLine();
                if (statement.trim().length() == 0){
                    System.out.println("Say something, please.");
                }
                else {
                    break;
                }
            }
    		System.out.println (maggie.getResponse(statement));
        }
        in.close();
    }
}
