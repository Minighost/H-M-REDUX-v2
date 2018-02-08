public class Weapon extends Entity{
    private int minDmg, maxDmg;
    private int x, y;
    private String name;
    
    public Weapon(){
    }
    
    public Weapon(int x, int y, int minDmg, int maxDmg, String n){
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.x = x;
        this.y = y;
        this.name = n;
    }
  
    public int getMinDmg(){
      return minDmg;
    }

    public void setMinDmg(int newMinDmg){
      minDmg = newMinDmg;
    }

    public int getMaxDmg(){
      return maxDmg;
    }

    public void setMaxDmg(int newMaxDmg){
      maxDmg = newMaxDmg;
    }

    public int getX(){
      return this.x;
    }

    public int getY(){
      return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public String getName(){
        return this.name;
    }

    public String toString(){
      return "Weapon";
    }
}