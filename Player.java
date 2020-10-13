import java.util.Scanner;
import java.util.Random;
public class Player
{
    private String name;
    private int baseAtk;
    private int baseHP;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public Player(String playerName, int attack, int health)
    {
        playerName = name;
        attack = baseAtk;
        health = baseHP;
    }
    public void setup()//sets stats and name of the player test
    {
        System.out.println("What is your name?");
        System.out.print("My name is: ");
        name = scan.nextLine();
        baseAtk = rand.nextInt(25 - 15 ) + 15;
        baseHP = rand.nextInt(125 - 100 ) + 100;
        return;
    }
    public int getHealth()
    {
        return baseHP;
    }
    public String getStats()
    {
        return ("Current Stats\nHealth:  "+ baseHP + "\nAttack: " + baseAtk);
    }
    public String toString()
    {
        return("Name: " + name + "\nAttack: " + baseAtk + "\nHealth: " + baseHP);
    }
    
    
}