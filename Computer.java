package com.javarush.task.task11.task1101;

public class Computer
{
    private Keyaboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(keyboard, mouse, monitor)
    {
keyboard = new Keyaboard();
mouse = new Mouse();
monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

}
