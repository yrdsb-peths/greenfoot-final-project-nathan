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
        int[] xarr = {(Greenfoot.getRandomNumber(5)+1)*104,(Greenfoot.getRandomNumber(5)+1)*104,(Greenfoot.getRandomNumber(5)+1)*104,(Greenfoot.getRandomNumber(5)+1)*104,(Greenfoot.getRandomNumber(5)+1)*104,(Greenfoot.getRandomNumber(5)+1)*104};
        int[] yarr = {(Greenfoot.getRandomNumber(5)+1)*64,(Greenfoot.getRandomNumber(5)+1)*64,(Greenfoot.getRandomNumber(5)+1)*64,(Greenfoot.getRandomNumber(5)+1)*64,(Greenfoot.getRandomNumber(5)+1)*64,(Greenfoot.getRandomNumber(5)+1)*64};
        Label mine = new Label("BOOM", 20);
        counter2 plate = new counter2(" ");
        Counter one = new Counter("1");
        Counter two = new Counter("2");
        Counter three = new Counter("3");
        Counter four = new Counter("4");
        Counter five = new Counter("5");
        Counter six = new Counter("6");
        for (int i=0;i<6;i++)
        {
            addObject(mine, yarr[i], xarr[i]);
        }
        int[] numx = {104,208,312,416,520};
        int[] numy = {64,128,192,256,320};
        for (int i=0;i<5;i++)
        {
            addObject(plate, 64,numx[i]); 
        }
        for (int i=0;i<5;i++)
        {
            addObject(plate, 128,numx[i]); 
        }
        for (int i=0;i<5;i++)
        {
            addObject(plate, 192,numx[i]); 
        }
        for (int i=0;i<5;i++)
        {
            addObject(plate, 256,numx[i]); 
        }
        for (int i=0;i<5;i++)
        {
            addObject(plate, 320,numx[i]); 
        }
    }
}
