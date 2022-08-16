import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends Actor
{
    /**
     * Act - do whatever the gameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Act()
    {
        //La clase GameOver es también una clase casi vacía. Esta no se encuentra en el World sino que es agregado
        //Cuando se pierde o gana el juego para mostrar el mensaje correcto en forma de texto
    }
    
    public void gameOver(){
        setImage(new GreenfootImage("Game Over", 48, Color.WHITE, Color.BLACK));
    }
}
