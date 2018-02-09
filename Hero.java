import java.util.*;

public class Hero extends Entity{
    private int x, y;
    private int hp, dmg, hides;
    private String name;
    private Weapon weapon;
    private Armor armor;
    private int gold;
    private ArrayList<Entity> pockets;

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
        this.gold = 0;
        this.pockets = new ArrayList<Entity>();
        this.name = n;
    }
    
    public int getGold(){
        return gold;
    }
    
    public void setGold(int newGold){
        this.gold = newGold;
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
    
    public boolean addToPockets(Entity e){
        if(this.pockets.size() > 4){
            return false;
        }
        this.pockets.add(e);
        return true;
    }
    
    public String getPocketsContents(){
        String return_str = "";
        for(int i = 0; i < this.pockets.size(); i++){
            return_str += pockets.get(i).getName() + ", ";
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