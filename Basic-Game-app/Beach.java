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
        this.addObject(new Police("w","s","a","d"), 0, 0);
        //this.addObject(new Police("up","down","left","right"), 1, 1);
        this.addObject(
            new Robber(),
            Greenfoot.getRandomNumber(this.getWidth()),
            Greenfoot.getRandomNumber(this.getHeight())
        );
    }
    
    public void endTheGame(boolean win)
    {
        int x = this.getWidth() / 2;
        int y = this.getHeight() / 2;
        String message;
        if (win) {
            message = "The robber was caught. You won!";
        } else {
            message = "The robber escaped. You lost!";
        }
        this.showText(message, x, y);
        Greenfoot.stop();
    }
}
