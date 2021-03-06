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
    public int score = 0;
    Label scoreLabel;
    boolean gameOver = false;
    GreenfootSound bgm = new GreenfootSound("Bali v2.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, true); 
        Car car = new Car();
        policeCar policecar = new policeCar();
        addObject(car, 200,400);
        addObject(policecar, 200, 500);
        createTree();
        createTree();
        createRock();
        for (int i = 0; i<50;i++)
        {
            int x = i*10;
            createFloor(x,600);
        }
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 20, 20);
    }
    public void act()
    {
        bgm.play();
    }
    public void createTree()
    {
        tree tree = new tree();
        int x = Greenfoot.getRandomNumber(4);
        int [] xarr = {25,50, 325,375};
        int y = 0;
        addObject(tree, xarr[x], y);
    }
    public void createRock()
    {
        Rock rock = new Rock();
        int x = Greenfoot.getRandomNumber(5);
        int y = 0;
        int [] xarr = {100,150,200,250,300};
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
        gameOver=true;
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public int getScore()
    {
        return score;
    }
}
