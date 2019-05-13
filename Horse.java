package com.javarush.task.task21.task2113;

public class Horse
{
   private String name;
    double speed;
    double distance;

    public   Horse (String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
        public String getName()
        { return name; }

        public void setName(String name)
        { this.name = name; }

        public double getSpeed()
        { return speed; }

        public void setSpeed(double speed)
        { this.speed = speed; }

        public double getDistance()
        { return distance; }

        public void setDistance(double distance)
        { this.distance = distance; }

        public void move()
        {
            distance+= speed * Math.random();
        }

        public void print()
        {
           // int m  = (int) Math.round(distance);
            for (int t = 0; t < (int)  distance ; t++)
                System.out.print(".");

            System.out.println(getName());
        }
}

