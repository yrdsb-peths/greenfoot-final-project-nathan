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
        super(400, 400, 1, false); 
        Car car = new Car();
        addObject(car, 200,300);
        createTree();
        createRock();
        for (int i = 0; i<575;i++)
        {
            int x = i;
            createFloor(x,400);
        }
    }
    public void createTree()
    {
        Tree tree = new Tree();
        int x = Greenfoot.getRandomNumber(2);
        int y = 0;
        addObject(tree, x*300+50, y);
    }
    public void createRock()
    {
        Rock rock = new Rock();
        int x = Greenfoot.getRandomNumber(3);
        int y = 0;
        int [] xarr = {200,100,300};
        addObject(rock, xarr[x], y);
    }
    public void createFloor(int x, int y)
    {
        floor floor=  new floor();
        addObject(floor, x, y);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 75);
        addObject(gameOverLabel, 200, 200);
    }
    private boolean gamecheck = false;
    public boolean getABoolean()
    {
        return gamecheck;
    }
    public void setABoolean(boolean gamecheck)
    {
        this.gamecheck = gamecheck;
    }
}
