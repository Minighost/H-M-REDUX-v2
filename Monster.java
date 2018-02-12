public class Monster extends Entity{
    private int x, y;
    private int hp;
    private int level;
    private String name;
    
    public Monster(){
    }
    
    public Monster(int x, int y, int h, int l, String n){
        this.x = x;
        this.y = y;
        this.hp = h;
        this.level = l;
        this.name = n;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int newX){
        this.x = newX;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int newY){
        this.y = newY;
    }
    
    public int getHP(){
        return this.hp;
    }
    
    public void setHP(int newHP){
        this.hp = newHP;
    }
    
    public int getDMG(){
        int dmg = (int)(Math.random() * 20) + (10 * level);
        return dmg;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String toString(){
        return this.name;
    }
}