import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bordes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bordes extends Actor
{
    /**
     * Act - do whatever the bordes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public bordes()
    {
        //los bordes son clases simples pues no requieren de ningún método interno, simplemente constructor
        //para cambiar el tamaño de la imagen original.
        GreenfootImage myImage = getImage();
        myImage.scale(10,100);
    }
    public void act()
    {
        // Add your action code here.
    }
}
