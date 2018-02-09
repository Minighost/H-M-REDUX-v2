public class Potion extends Entity{
    private int x, y;
    private int potency;
    private String name;

    public Potion(){
    }
    
    public Potion(int x, int y, String n, int potency){
        this.x = x;
        this.y = y;
        this.name = n;
        this.potency = potency;
    }

    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPotency(){
        return this.potency;
    }

    public String toString(){
        return "Potion";
    }
}