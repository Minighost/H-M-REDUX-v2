import java.util.*;

public class Hero extends Entity{
    private int x, y;
    private int hp, dmg, hides;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private Entity[] storage;
    private Footwear footwear;
    int index = 0;

    public Hero(){
    }
    
    public Hero(int x, int y, Weapon w, Armor a, String n){
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.dmg = 10;
        this.weapon = w;
        this.armor = a;
        this.hides = 0;
        this.storage = new Entity[2];
        this.name = n;
        this.footwear = new Footwear(0, "Bare Feet", 0);
    }
    
    public void buyObject(int objectNumber, Farmer farmer){
        if(index >= storage.length){
            System.out.println("Looks like you don't have any space to hold anything else!");
            return;
        }
        ShopItem item = farmer.getItem(objectNumber-1);
        if(hides < item.getPrice()){
            System.out.println("Insufficient hides...");
        }else{
            farmer.shopItems[objectNumber-1] = null;
            hides -= item.getPrice();
            if((item.getClass()).isInstance(new Potion())){
                storage[index] = (Potion)item;
                index++;
            }
            if((item.getClass()).isInstance(new Bomb())){
                storage[index] = (Bomb)item;
                index++;
            }
            if((item.getClass()).isInstance(new Armor())){
                storage[index] = (Armor)item;
                index++;
            }
            if((item.getClass()).isInstance(new Satchel())){
                Entity[] newStorage = new Entity[((Satchel)item).getSize()];
            }
            if((item.getClass()).isInstance(new Footwear())){
                footwear = (Footwear)item;
            }
        }
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
        return this.dmg;
    }

    public void setDMG(int newDMG){
        this.dmg = newDMG;
    }
    
    public int getHides(){
        return this.hides;
    }
    
    public void setHides(int newHides){
        this.hides = newHides;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon newWeap){
        this.weapon = newWeap;
    }

    public Armor getArmor(){
        return this.armor;
    }

    public void setArmor(Armor newArmor){
        this.armor = newArmor;
    }
    
    
    public void addToStorage(Entity item){
        if(index >= storage.length){
            return;
        }else{
            if((item.getClass()).isInstance(new Weapon())){
                storage[index] = (Weapon)item;
                index++;
            }
            if((item.getClass()).isInstance(new Armor())){
                storage[index] = (Armor)item;
                index++;
            }
            if((item.getClass()).isInstance(new Potion())){
                storage[index] = (Potion)item;
                index++;
            }
        }
    }
    
    
    public String getPocketsContents(){
        String return_str = "";
        for(int i = 0; i < storage.length; i++){
            return_str += storage[i].getName() + ", ";
        }
        return return_str;
    }
    
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Name: " + this.name + ", HP: " + this.hp + ", Weapon: " + this.weapon.toString() + ", Damage: " + this.dmg + ", Armor: " + this.armor.toString();
    }
}