import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Creador para el último nivel, se introducen tanto carros como personas.
        super(600, 600, 1); 
        addObject(new car(),570, 50);
        addObject(new bordes(),500, 50);
        addObject(new piso(),500, 180);
        addObject(new piso(),200, 400);
        addObject(new piso(),200, 600);
        addObject(new persona(),400, 0);
        addObject(new persona(),150, 300);
        addObject(new CO3(),30, 250);
        addObject(new CO3(),480, 550);
        addObject(new CO2(),80, 250);
        addObject(new CO2(),580, 550);
        addObject(new CO2(),530, 550);
        addObject(new carObstacles(),250, 250);
        addObject(new CO3(),210, 250);
        //se le agrega el atributo 3 para que el programa sepa que es el último nivel.
        addObject(new park(3),30, 570);
    }
}
