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
        //La clase Car es el corazon del juego, pues es el que tiene todos los listeners:
        
        //EL setLocation es una gravedad constante con la que tiene que lidiar el jugador
        setLocation(getX(),getY()+1);
        
        //Mover es el método que tiene todos lso listeners de teclas para saber que acción está tomando el usuario.
        mover();
        
        //CheckBordes hace lo que indica su nombre, busca si hay clases bordes (o que la hereden) para que cuando el 
        //jugador las intercepte, estas no lo dejen pasar.
        checkBordes();
        
        //CheckPark es el que escucha si el jugador llego al final del nivel para indicarle que ganó y abrir el siguiente nivel
        checkPark();
        
        //checkPersona es el que está pendiente si el jugador intercepta con una clase persona. Si lo hace, es un game over instantáneo
        //aunque solo reinicia el nivel actual.
        checkPersona();
    }
    
    public void checkPersona(){
        //Se hace una clase World que apunta al mundo actual para poder agregar el mensaje de "Game Over"
        //tambien se obtiene el actor park actual para saber que nivel se debe reiniciar.
        World MW = getWorld();
        gameOver GO = new gameOver();
        if(isTouching(persona.class)){
            MW.addObject(GO,MW.getWidth()/2,MW.getHeight()/2);
            GO.setImage(new GreenfootImage("Game Over!", 48, Color.WHITE, Color.BLACK));
            Greenfoot.delay(60);
            park p = getWorld().getObjects(park.class).get(0);
            if (p.getLevel()==2){
                Greenfoot.setWorld(new level2());
            } else if (p.getLevel()==3){
                Greenfoot.setWorld(new level3());
            }
        }
    }
    public void checkPark(){
        //Se hace una clase World que apunta al mundo actual para poder agregar el mensaje de "gano el juego"
        //tambien se obtiene el actor park actual para saber que nivel abrir despues o si ya se completó el juego
        World MW = getWorld();
        gameOver GO = new gameOver();
        if(isTouching(park.class)){
            MW.addObject(GO,MW.getWidth()/2,MW.getHeight()/2);
            GO.setImage(new GreenfootImage("You Won!", 48, Color.WHITE, Color.BLACK));
            Greenfoot.delay(50);
            park p = getWorld().getObjects(park.class).get(0);
            if(p.getLevel()==1){
                Greenfoot.setWorld(new level2());
            } else if (p.getLevel()==2){
                Greenfoot.setWorld(new level3());
            } else if (p.getLevel()==3){
                GO.setImage(new GreenfootImage("You Completed The Game!!!", 48, Color.WHITE, Color.BLACK));
                Greenfoot.stop();
            } 
        }
    }
    
    public void checkBordes()
    {
        //checkBordes revisa 4 métodos:
        //CheckPiso y pared por si colisiona con actor de clase bordes en el eje x o y
        //CheckCarroX y carroY por si colisiona con actor de clase carObstacles en el eje x o y
        checkPiso();
        checkPared();
        checkCarroY();
        checkCarroX();
    }
    
    public void checkCarroX(){
        //CheckCarroX crea otro actor llamado bumped en el que utiliza el método getOneObjectAtOffset
        //este método le indica si hay un objeto con el que colisiona a xdistancia y  de que clase.
        Actor bumped;
        int spriteWidth = getImage().getWidth();
        int xDistance = -spriteWidth/2;
        getOneObjectAtOffset(0,xDistance,carObstacles.class);
        bumped = getOneObjectAtOffset(0,xDistance,carObstacles.class);
        //Luego el siguiente If determina si se estaba moviendo a la izquierda, que cancele ese movimiento y viceversa
        if (bumped!=null){
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()+10,getY());
            }
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()-10,getY());
            }
        }
    }

    public void checkCarroY(){
        //Esta método funciona exactamente igual que checkCarroX solo que la distancia es en el eje y
        
        int spriteHeight = getImage().getHeight();
        int yDistance = spriteHeight/2;
        getOneObjectAtOffset(0,yDistance,carObstacles.class);
        Actor bumped = getOneObjectAtOffset(0,yDistance,carObstacles.class);
        //Ya que el jugador solo cae y no sube, no se necesita saber hacia donde se mueve para cancelar el movimient
        //de manera que solo se le resta la velocidad global constantemente.
        if (bumped!=null){
            setLocation(getX(),getY()-2);
        }
    }
    
    public void checkPared(){
        //Este étodo funciona exactamente igual que CheckCarroX solo que busca clases bordes en lugar de clases CarObstacles.
        Actor bumped;
        int spriteWidth = getImage().getWidth();
        int xDistance = -spriteWidth/2;
        getOneObjectAtOffset(0,xDistance,bordes.class);
        bumped = getOneObjectAtOffset(0,xDistance,bordes.class);
        if (bumped!=null){
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()+10,getY());
            }
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()-10,getY());
            }
        }
    }
    
    public void checkPiso(){
        //Este étodo funciona exactamente igual que CheckCarroy solo que busca clases bordes en lugar de clases CarObstacles.
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
        //Aquí se encuentran todos los listener de teclas
        //los de las flechas "right" y "Left" proporcionan velocidad
        if(Greenfoot.isKeyDown("Left"))
        {
             setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("Right"))
        {
             setLocation(getX()+5,getY());
        }
        //la tecla "up" cambia la orientación del carro por 90 grados
        if(Greenfoot.isKeyDown("Up"))
        {

             setRotation(getRotation()+90);
             Greenfoot.delay(9);
        }
    }
}
