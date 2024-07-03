import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends Person
{
    private String up;
    private String down;
    private String left;
    private String right;

    public Police(String up,String down,String left, String right) 
    {
        super(3);
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    /**
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        
        if (this.isTouching(Robber.class)) 
        {
            World world = this.getWorld();
            Beach beach = (Beach)world;
            beach.endTheGame(true);
        }
    }

    public void movement() 
    {
        int x = this.getX();
        int y = this.getY();
        
        if (Greenfoot.isKeyDown(this.up)) 
        {
            this.setRotation(270);
            y = y - 1;
        } else if (Greenfoot.isKeyDown(this.down)) 
        {
            this.setRotation(90);
            y = y + 1;
        } else if (Greenfoot.isKeyDown(this.left)) 
        {
            this.setRotation(180);
            x = x - 1;
        } else if (Greenfoot.isKeyDown(this.right)) 
        {
            this.setRotation(0);
            x = x + 1;
        }
        
        if (this.getWorld().getObjectsAt(x, y, HidingSpot.class).isEmpty())
        {
            this.setLocation(x, y);
        }
    }

}
