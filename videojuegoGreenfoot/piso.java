import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class piso extends bordes
{
    /**
     * Act - do whatever the piso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public piso()
    {
        //El actor piso es una clase que hereda de bordes, y funciona exactamente igual que ella.
        //sin embargo, piso está hecho para ser un borde horizontal y no vertical como lo son los bordes.
        GreenfootImage myImage = getImage();
        myImage.scale(500,10);        
    }
    public void act()
    {
        // Add your action code here.

    }
}
