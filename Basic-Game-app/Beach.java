import greenfoot.*; 

public class Beach extends World
{

    /**
     * Constructor for objects of class Beach.
     * 
     */
    public Beach()
    {    
        // Create a new world with 15x10 cells with a cell size of 60x60 pixels.
        super(15, 10, 60); 
        this.addObject(new Police(), 0, 0);
    }
}
