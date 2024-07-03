import greenfoot.*; 

public class Beach extends World
{
    private int counter;
    
    public Beach()
    {    
        // Create a new world with 15x10 cells with a cell size of 60x60 pixels.
        super(15, 10, 60);
        this.prepareTheBeach();
    }
    
    public void endTheGame(boolean win)
    {
        this.removeObjects(this.getObjects(Actor.class));
        
        int x = this.getWidth() / 2;
        int y = this.getHeight() / 2;
        String message;
        if (win) {
            message = "The robber was caught. You won!";
        } else {
            message = "The robber escaped. You lost!";
        }
        this.showText(message, x, y);
        Greenfoot.delay(40);
        this.showText(null, x, y);
        this.prepareTheBeach();
        Greenfoot.stop();
    }
    
    public void act()
    {
        this.counter = this.counter - 1;
        if (this.counter == 0) {
            this.endTheGame(false);
        }
    }
    
    private void prepareTheBeach()
    {
        this.addObject(new Police("w","s","a","d"), 0, 0);
        this.addObject(
            new Robber(),
            Greenfoot.getRandomNumber(this.getWidth()),
            Greenfoot.getRandomNumber(this.getHeight())
        );        
        this.counter = 500;       
    }
}
