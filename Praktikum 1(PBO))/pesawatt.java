import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawatt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawatt extends Actor
{
    /**
     * Act - do whatever the pesawatt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move(1);
        if(Greenfoot.isKeyDown("up")) {
            setRotation(-90);
       }
       if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
       }
       if(Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
    }
}
