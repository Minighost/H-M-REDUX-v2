public class Farmer extends Entity{
    private int x, y;
    private String name;
    
    public Farmer(){
    }
    
    public Farmer(int x, int y, String n){
        this.x = x;
        this.y = y;
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getX(){
        return x;
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
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String toString(){
        return "Name: " + this.name;
    }
}