import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class persona extends Actor
{
    /**
     * Act - do whatever the persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    public void act()
    {
        //las clases personas solo poseen un método y un atributo. Su atributo es velocidad "speed" y el método
        //es move o moverse. Estos actores tienen el único propósito de obstaculizar el paso del jugador, pero
        //a diferencia de las clases carObstacles, estos pueden hacer que el jugador pierda y tenga que volver a empezar.
        move();
    }
    
    public void move(){
        //el método move detecta si la persona ha tocado el borde superior o inferior del nivel 
        //para saber si tiene que cambiar el sentido de su velocidad para moverse siempre en un ciclo.
        int wh = getWorld().getHeight();
        if(getY()==wh-1){
            this.speed=(-3);
        } else if(getY()==0){
            this.speed=3;
        }
        setLocation(getX(),getY()+this.speed);
    }
}
