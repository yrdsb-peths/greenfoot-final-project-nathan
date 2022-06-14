import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class floor extends Actor
{
    /**
     * Act - do whatever the floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        killtree();
        killrock();
    }
    public void killtree()
    {
        if(isTouching(tree.class))
        {
            removeTouching(tree.class);
            MyWorld world = (MyWorld) getWorld();
            world.createTree();
        }
    }   
    public void killrock()
    {
        if(isTouching(Rock.class))
        {
            removeTouching(Rock.class);
            MyWorld world = (MyWorld) getWorld();
            world.createRock();
            world.increaseScore();
        }
    }   
}
