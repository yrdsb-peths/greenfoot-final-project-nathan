import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends Actor
{
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        int score = world.getScore();
        if (score<=10)
        {
            setLocation(getX(), getY()+3);
        }
        if (score<=20 && score>=10)
        {
            setLocation(getX(), getY()+6);
        }
        if (score<=30 && score>=20)
        {
            setLocation(getX(), getY()+12);
        }
        if (score>=30)
        {
            setLocation(getX(), getY()+24);
        }
        world.setABoolean(false);
        boolean gameover = world.getABoolean();
        if (isTouching(Car.class))
        {
            world.removeObject(this);
            world.gameOver();
            world.setABoolean(true);
            Greenfoot.playSound("car-crash-sound-eefect");
        }

    }
}
