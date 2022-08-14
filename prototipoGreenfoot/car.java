import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+1);
        mover();
        checkBordes();
    }
    
    public void checkBordes()
    {
        checkPiso();
        checkPared();
        checkCarroY();
        checkCarroX();
    }
    
    public void checkCarroX(){
        Actor bumped;
        int spriteWidth = getImage().getWidth();
        int xDistance = -spriteWidth/2;
        getOneObjectAtOffset(0,xDistance,carObstacles.class);
        bumped = getOneObjectAtOffset(0,xDistance,carObstacles.class);
        if (bumped!=null){
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()+20,getY());
            }
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()-20,getY());
            }
        }
    }

    public void checkCarroY(){
        int spriteHeight = getImage().getHeight();
        int yDistance = spriteHeight/2;
        getOneObjectAtOffset(0,yDistance,carObstacles.class);
        Actor bumped = getOneObjectAtOffset(0,yDistance,carObstacles.class);
        if (bumped!=null){
            setLocation(getX(),getY()-2);
        }
    }
    
    public void checkPared(){
        Actor bumped;
        int spriteWidth = getImage().getWidth();
        int xDistance = -spriteWidth/2;
        getOneObjectAtOffset(0,xDistance,bordes.class);
        bumped = getOneObjectAtOffset(0,xDistance,bordes.class);
        if (bumped!=null){
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()+20,getY());
            }
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()-20,getY());
            }
        }
    }
    
    public void checkPiso(){
        int spriteHeight = getImage().getHeight();
        int yDistance = spriteHeight/2;
        getOneObjectAtOffset(0,yDistance,bordes.class);
        Actor bumped = getOneObjectAtOffset(0,yDistance,bordes.class);
        if (bumped!=null){
            setLocation(getX(),getY()-2);
        }
    }
    public void mover() //Definición de método
    {
        if(Greenfoot.isKeyDown("Left"))
        {
             setLocation(getX()-10,getY());
        }
        if(Greenfoot.isKeyDown("Right"))
        {
             setLocation(getX()+10,getY());
        }
        if(Greenfoot.isKeyDown("Up"))
        {

             setRotation(getRotation()+90);
             Greenfoot.delay(9);
        }
    }
}
