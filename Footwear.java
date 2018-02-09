public class Footwear extends Entity implements ShopItem{
    private double chanceInc;
    private int price;
    private String name;
    
    public Footwear(){
        chanceInc = 0;
        price = 0;
        name = null;
    }
    
    public Footwear(double chanceInc, String name, int price){
        this.chanceInc = chanceInc;
        this.price = price;
        this.name = name;
    }
    
    public int getX(){
        return 0;
    }
    
    public int getY(){
        return 0;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name;
    }
}