import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titlescreen extends World
{
    /**
     * Constructor for objects of class titlescreen.
     * 
     */
    Label title = new Label("police chase!",50);
    Label control1 = new Label("> to move right", 50); 
    Label control2 = new Label("< to move left", 50);
    Label startgame = new Label("press space to start", 50);
    public titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, false);
        addObject(title, getWidth()/2, 200);
        addObject(control1, getWidth()/2, 250);
        addObject(control2, getWidth()/2, 300);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
