public class Armor extends Entity{
    private int hp;
    private int x, y;
    private double dmgReduction = 0;
    private String name;
    
    public Armor(){
    }
    
    public Armor(int x, int y, double dmReduction, String name){
        this.x = x;
        this.y = y;
        this.dmgReduction = dmgReduction;
        this.name = name;
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
    
    public int reduceDmg(int dmg){
        int reducedDmg = (int)(dmg - (dmg * dmgReduction));
        return reducedDmg;
    }
    
    public String toString(){
        return "Name: " + this.name + "; Integrity: " + this.hp;
    }
}