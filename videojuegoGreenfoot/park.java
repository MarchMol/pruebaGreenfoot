import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class park here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class park extends Actor
{
    /**
     * Act - do whatever the park wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int level=1;
    public void act(int level)
    {
        //Park es una clase también, bastante sencilla. Esta solo posee constructor y un atributo (con sus respectivos
        //setters y getters). Esta clase sirve solo para indicar el punto al que desea llegar el jugador para terminar
        //el nivel con un boton rojo. 
        //Su único atributo indica el nivel en el que se encuentra el jugador en ese momento específico y es asignado
        //cuando se genera el nivel.
    }
    
    public park(int level){
        this.level = level;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public void setLevel(int level){
        this.level = level;
    }
}
