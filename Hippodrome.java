package com.javarush.task.task21.task2113;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome
{

    static Hippodrome game;
    private static List<Horse> horses = new ArrayList<>();
    
    public Hippodrome(List<Horse> horses)
    {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public  void  run() throws Exception
    {
        for(int i =0; i < 100; i++)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public  void  move()
    {
       for( Horse hor:horses)
           hor.move();
    }

    public  void print()
    {
        for(Horse horr:horses)
            horr.print();

        for(int j=0; j<10; j++)
            System.out.println();
    }

    public Horse getWinner()
    {
        Horse winnername = null;
        double maxdistance = 0.00;

        for (Horse h : horses)
        {
            if (h.getDistance() > maxdistance)
                winnername = h;
        }
        return winnername;
    }

    public void printWinner()
    {
System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main (String[] args) throws Exception
    {
        Horse horse1 = new Horse("horse1",3,0);
        Horse horse2 = new Horse("horse2",3,0);
        Horse horse3 = new Horse("horse3",3,0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome( horses);

        game.run();
        game.printWinner();
    }

}
