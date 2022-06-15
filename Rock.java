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
        GreenfootSound crash = new GreenfootSound("car-crash-sound-eefect.mp3");
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
        if (score<40 &&score>=30)
        {
            setLocation(getX(), getY()+24);
        }
        if (score>40)
        {
            setLocation(getX(), getY()+48);
        }
        if (isTouching(Car.class))
        {
            world.removeObject(this);
            world.gameOver();
            crash.play();
        }
    }
}
