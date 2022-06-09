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
        Counter one = new Counter("1");
        Counter two = new Counter("2");
        Counter three = new Counter("3");
        Counter four = new Counter("4");
        Counter five = new Counter("5");
        Counter six = new Counter("6");
        spawnMine();
        spawnMine();
        spawnMine();
        spawnMine();
        spawnMine();
        spawnMine();
        
        /*for (int i = 0; i<5;i++)
        {
          spawnPlate(i*104+90, 2*32);
        }
        for (int i = 0; i<5;i++)
        {
            spawnPlate(i*104+90, 5*32);
        }
        for (int i = 0; i<5;i++)
        {
            spawnPlate(i*104+90, 8*32);
        }
        for (int i = 0; i<5;i++)
        {
            spawnPlate(i*104+90, 11*32);
        }
        */
    }
    public void spawnMine()
    {
        Mine mine = new Mine("BOOM", 20);
        int x = (Greenfoot.getRandomNumber(5)+1)*104+90;
        int y = ((Greenfoot.getRandomNumber(5)+1)*64)+32;
        addObject(mine, x, y);
        spawnPlate(x,y);
    }
    public void spawndigit(int x,int y)
    {
        mine0 zero = new mine0(" ",0);
        addObject(zero, x, y);
    }
    public void spawnnum()
    {
        for (int i = 0; i<5;i++)
        {
            spawndigit(i*104+90,64);
        }
    }
    public void spawnPlate(int x, int y)
    {
        counter2 plate = new counter2(" ");
        addObject(plate,x,y);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
