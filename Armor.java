public class Armor extends Entity implements ShopItem{
    private int x, y;
    private double dmgReduction = 0;
    private String name;
    private int price;
    
    public Armor(){
    }
    
    public Armor(double dmgReduction, String name, int price){
        this.dmgReduction = dmgReduction;
        this.name = name;
        this.price = price;
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
    
    public int getPrice(){
        return price;
    }
    
    public int reduceDmg(int dmg){
        int reducedDmg = (int)(dmg - (dmg * dmgReduction));
        return reducedDmg;
    }
    
    public String toString(){
        return "Armor";
    }
}