import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move (5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move (-5);
        }
    }
    public void eat()
    {
        if(isTouching(Tree.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
        }
        if(isTouching(Rock.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
        }
    } 
}
