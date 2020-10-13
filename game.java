import java.util.Scanner;
public class game {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        Player user = new Player("null", 0, 0);
        int pathPick;

        System.out.println(
                "**************************************************************************************************");
        System.out.println("                                Welcome to Dungeon Crawler!");
        System.out.println("           To play the game use the numbers that corresponds to the ingame command");
        System.out.println("               For example, if you want to go onwards press 1 on the keyboard");
        System.out.println("");
        System.out.println("                                   Lets begin the game!");
        
        try {//adds 9 second delay
            Thread.sleep(9 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        user.setup();//
        System.out.println("\n\n\n\n\n\n             You wake up on a cold floor of an unfamiliar area");
        System.out.println("Nothing looks familiar however there are three options in front of you\n");
        while (user.getHealth() > 0)//if users health drops to 0 or below game ends
        {
            
            System.out.println("1. Go onwards");
            System.out.println("2. Turn right");
            System.out.println("3. Turn left");
            pathPick = scan.nextInt();
            if (pathPick == 1)
            {
                
            }
            else if (pathPick == 2)
            {

            }
            else if (pathPick == 3)
            {

            }
        }
        System.out.println("GAME OVER!");
    }
}
