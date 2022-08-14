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
        super(300, 450, 1); 
        addObject(new piso(),150, 450);
        addObject(new piso(),300, 150);
        addObject(new piso(),0, 250);
        addObject(new carObstacles(),150, 405);
        addObject(new carObstacles(),110, 405);
        addObject(new CO2(),30, 405);
        addObject(new park(), 70, 405);
        addObject(new CO3(),200, 405);
        addObject(new CO3(),270, 405);
        addObject(new bordes(),240, 405);
        
        addObject(new car(),150, 0);

    }
}
