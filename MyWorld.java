import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label mine = new Label("BOOM", 20);
        for (int i=0;i<6;i++)
        {
            
        }
        Label one = new Label("1", 40);
        Label two = new Label("2", 40);
        Label three = new Label("3", 40);
        Label four = new Label("4", 40);
        Label five = new Label("5", 40);
        Label six = new Label("6", 40);
        Label seven = new Label("7", 40);
    }
}
