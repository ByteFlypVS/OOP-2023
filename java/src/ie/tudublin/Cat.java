package ie.tudublin;

public class Cat
{
    private int numLives;

    public void kill()
    {
        if (numLives > 0)
        {
            System.out.println("Ouch!");
            numLives --;
        }
        else
        {
            System.out.println("Im dead");
        }
    }
    
    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public Cat(String name)
    {
        numLives = 9;
    }
}