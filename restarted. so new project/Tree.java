import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3);
        MyWorld world = (MyWorld) getWorld();
        world.setABoolean(false);
        if (getY()>= world.getHeight())
        {
            world.removeObject(this);
            world.gameOver();
            world.setABoolean(true);
        }
        boolean gameover = world.getABoolean();
        if (gameover = true)
        {
            world.removeObject(this);
            world.gameOver();
        }
    }
}
