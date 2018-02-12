public class Boss extends Entity{
    private String name, quote;
    private int health, attack, speed, level;
    private int x, y;
    
    public Boss(){
    }
    
    public Boss(String name, int health, int attack, int speed, int level, String quote){
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.level = level;
        this.quote = quote;
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
        return this.health;
    }
    
    public void setHP(int newHealth){
        this.health = newHealth;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getDMG(){
        return this.level;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getQuote(){
        return this.quote;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public String toString(){
        return this.name;
    }
}