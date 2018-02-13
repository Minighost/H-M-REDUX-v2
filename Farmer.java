import java.util.*;
public class Farmer extends Entity{
    private int x, y;
    private String name;
    Entity[] shopItems;

    public Farmer(){
    }

    public Farmer(int x, int y, String n){
        this.x = x;
        this.y = y;
        this.name = n;
        shopItems = new Entity[14];
        shopItems[0] = new Potion("Lesser Potion", 25, 25);
        shopItems[1] = new Potion("Lesser Potion", 25, 25);
        shopItems[2] = new Potion("Lesser Potion", 25, 25);
        shopItems[3] = new Potion("Medium Potion", 50, 50);
        shopItems[4] = new Potion("Medium Potion", 50, 50);
        shopItems[5] = new Potion("Greater Potion", 75, 100);
        shopItems[6] = new Potion("Phoenix Potion", 999, 500);
        shopItems[7] = new Bomb("Large Dynamite", 150);
        shopItems[8] = new Armor(0.25, "Guard's Plate", 125);
        shopItems[9] = new Satchel(9, "9-Slotted Satchel", 100);
        shopItems[10] = new Footwear(0.5, "Leather Sandals", 75);
        shopItems[11] = new Weapon("Iron Shortsword", 35, 40, 50);
        shopItems[12] = new Weapon("Steel Longsword", 40, 60, 75);
        shopItems[13] = new Weapon("Engraved Battle-axe", 90, 150, 150);
    }
    
    public ShopItem getItem(int number){
        ShopItem item = (ShopItem)shopItems[number];
        return item;
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
    
    public int getShopLength(){
        return this.shopItems.length;
    }
    
    public void getShopItems(){
        String s = "";
        for(int i = 0; i < shopItems.length; i++){
            int n = i + 1;
            if(shopItems[i] == null){
                s = s + n + ". SOLD OUT\n";
                continue;
            }
            s = s + n + ". " + this.shopItems[i].getName() + "\t" + ((ShopItem)shopItems[i]).getPrice() +" Hides\n";
        }
        System.out.println(s);
    }

    public String toString(){
        return "Name: " + this.name;
    }
}