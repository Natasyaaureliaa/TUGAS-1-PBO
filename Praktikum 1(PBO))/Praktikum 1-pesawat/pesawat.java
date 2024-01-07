import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        take;
    }
    public void moveAndTurn()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    public void take()
    {
        Actor bom;
        bom = getOneObjectAtOffset(0, 0, Bom.class);
        if (bom != null)
        {
            World world;
            world = getWorld();
            world.removeObject(bom);
    
        }
    
        
    

