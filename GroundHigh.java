import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundHigh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundHigh extends Actor
{
    public GroundHigh(){
        getImage().scale(getImage().getWidth(),getImage().getHeight());
    }
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(4);
        }
         if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(100)+355);
        }
    }    
}
