import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3);
        MyWorld world = (MyWorld) getWorld();
        world.setABoolean(false);
        if (isTouching(Car.class))
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
