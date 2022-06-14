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
        MyWorld world = (MyWorld) getWorld();
        int score = world.getScore();
        GreenfootSound carCrash = new GreenfootSound("car-crash.mp3");
        if (score<=10)
        {
            setLocation(getX(), getY()+3);
        }
        else
        {
            setLocation(getX(), getY()+6);
        }
        world.setABoolean(false);
        boolean gameover = world.getABoolean();
        if (isTouching(Car.class))
        {
            world.removeObject(this);
            world.gameOver();
            world.setABoolean(true);
            carCrash.play();
        }
        if (gameover == true)
        {
            world.removeObject(this);
            world.gameOver();
        }
    }
}
