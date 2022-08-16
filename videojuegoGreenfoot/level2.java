import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        // Este es el creador del nivel 2, como se puede ver tiene dimensiones diferentes y ahora incluye actores persona
        super(600, 400, 1); 
        addObject(new car(),30, 50);
        addObject(new piso(),200, 400);
        addObject(new piso(),500, 400);
        addObject(new piso(),200, 100);
        addObject(new piso(),350, 200);
        addObject(new piso(),200, 300);
        addObject(new persona(),200, 300);
        addObject(new persona(),320, 0);
        addObject(new persona(),450, 200);
        //a park se le agrega el atributo "2" para indicar que se está en el nivel 2
        addObject(new park(2),0, 400);

    }
}
