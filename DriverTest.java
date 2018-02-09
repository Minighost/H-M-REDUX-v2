import java.util.*;
import java.io.*;

public class DriverTest{
    public static void main(String args[]){
        Entity[][] map = new Entity[15][15];
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        int[][] takenCoord = new int[7][2];
        int index = 0;
        int newCoordX = 0;
        int newCoordY = 0;
        
        Scanner theName = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print("Name: ");
        String heroName = theName.next();

        // Testing map printout
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                map[i][j] = new Air();
            }
        }

        //create obj
        Weapon dagger = new Weapon(0, 0, 1, 20, "Dagger");
        Armor leatherArmor = new Armor(0, 0, 0, "Leather");
        Hero hero = new Hero(0, 14, dagger, leatherArmor, heroName);
        takenCoord[index][0] = hero.getX();
        takenCoord[index][1] = hero.getY();
        index++;

        newCoordX = (int)Math.random()*15;
        newCoordY = (int)Math.random()*15;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //farmer1
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Farmer farmer1 = new Farmer(newCoordX, newCoordY, "Chuck");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //farmer 2
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Farmer farmer2 = new Farmer(newCoordX, newCoordY, "Bill");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //weapon
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Weapon shortSword = new Weapon(newCoordX, newCoordY, 20, 30, "Shortsword");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //potion
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Potion potion1 = new Potion(newCoordX, newCoordY, "Medium Potion", 50);
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //armor
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Armor bronzeArmor = new Armor(newCoordX, newCoordY, 30, "bronze");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){       //armor
            newCoordX = (int)(Math.random()*15);
            newCoordY = (int)(Math.random()*15);
        }
        Weapon shadowbane_curse = new Weapon(newCoordX, newCoordY, 30, 50, "Shadowbane's Curse");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;

        //number of random weapon/armor in map?

        entityList.add(hero); //add all obj to list
        entityList.add(farmer1);
        entityList.add(farmer2);
        entityList.add(shortSword);
        entityList.add(potion1);
        entityList.add(bronzeArmor);
        entityList.add(shadowbane_curse);

        for(int i = 0; i < entityList.size(); i++){ //set all obj to map
            Entity currentObj = entityList.get(i);
            map[currentObj.getY()][currentObj.getX()] = currentObj;
        }
        
        runGame(map, entityList, hero);
    }

    public static void runGame(Entity[][] map, ArrayList<Entity> entityList, Hero hero){
        Scanner s = new Scanner(System.in);
<<<<<<< HEAD:Driver2.java
        printMap(map);
        while(true){            
=======
        while(true){
>>>>>>> e7b11352dba7e0994d3c97422b8803153a716904:DriverTest.java
            System.out.println("\f");
            System.out.println(printMap(map));
            
            String action = s.next();
            
            switch(action){
                case "w":
                    switch(staticCheck(hero, map, entityList, action).getClass().toString()){
                        case "class Air":
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            break;
                        case "class Farmer":
                            break;
                        case "class Potion":
                            hero.addToPockets(map[hero.getY() - 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            break;
                        case "class Weapon":
                            hero.addToPockets(map[hero.getY() - 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            break;
                    }
                    if(Math.random() < 0.25){
                        AttackSequence(map, hero);
                    }
                    break;
                case "a":
                    break;
                case "s":
                    break;
                case "d":
                    break;
                case "kill":
                    return;
                default:
                    break;
            }
        }
    }
    
    public static Entity staticCheck(Hero hero, Entity[][] map, ArrayList<Entity> EntityList, String action){
        int x = hero.getX();
        int y = hero.getY();
        switch(action){
            case "w":
                y -= 1;
                break;
            case "a":
                x -= 1;
                break;
            case "s":
                y += 1;
                break;
            case "d":
                x += 1;
                break;
        }
        return map[y][x];
    }

    public static String printMap(Entity[][] map){
        String s = "";
        for(Entity[] r : map){
            for(Object i : r){
                if((i.getClass().isInstance(new Hero()))){
                    s = s + "Hero\t";
                }else if((i.getClass().isInstance(new Weapon()))){
                    s = s + "Weapon\t";
                }else if((i.getClass().isInstance(new Potion()))){
                    s = s + "Potion\t";
                }else if((i.getClass().isInstance(new Armor()))){
                    s = s + "Armor\t";
                }else if((i.getClass().isInstance(new Monster()))){
                    s = s + "Monster\t";
                }else if((i.getClass().isInstance(new Farmer()))){
                    s = s + "Farmer\t";
                }else{
                    s = s + ".\t";
                }
            }
            s = s + "\n\n";
        }
        return s;
    }

    public static void AttackSequence(Entity[][] map, Hero hero){
        System.out.println("\f");

        Scanner s = new Scanner(System.in);

        //x, y, hp, level, name
        String[] names = {"Skeleton", "Slime", "Zombie", "Witch", "Spider", "Giant", "Bug", "Crawler", "Alien"};
        int tempHP = (int)Math.random()*90 + 20;
        int level = (int)Math.random()*2 + 1;
        String tempName = getRandomString(names);
        Monster monster = new Monster(hero.getX(), hero.getY(), tempHP, level, tempName);
        System.out.println("A wild " + monster.getName() + " appeared!");
        pressEnter();
        System.out.println("\f");
        while(monster.getHP() > 0){
            int choice = 0;
            
            System.out.println("Your turn!\n");
            System.out.println("1. Attack");
            System.out.println("2. Run");
            choice = s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your " + hero.getWeapon().getName() + " slices out, cutting the monster!");
                    int heroDMGdealt = (int)(Math.random()*hero.getWeapon().getMaxDmg() - hero.getWeapon().getMinDmg()) + hero.getWeapon().getMinDmg();
                    monster.setHP(monster.getHP() - heroDMGdealt);
                    if(monster.getHP() < 0){
                        monster.setHP(0);
                    }
                    System.out.println("\n---You dealt " + heroDMGdealt + " damage to the " + monster.getName() + "!---" +
                    "\nThe " + monster.getName() + " has " + monster.getHP() + " health left.");
                    if(monster.getHP() == 0){
                        if(monster.getLevel() == 1){
                            hero.setGold(hero.getGold() + 25);
                        }else if(monster.getLevel() == 2){
                            hero.setGold(hero.getGold() + 50);
                        }else if(monster.getLevel() == 3){
                            hero.setGold(hero.getGold() + 75);
                        }
                        return;
                    }
                    break;
                case 2:
                    boolean hasRun = false;
                    double chance = Math.random();
                    if(monster.getLevel() == 1 && chance < 0.75){
                        hasRun = true;
                    }else if(monster.getLevel() == 2 && chance < 0.5){
                        hasRun = true;
                    }else if(monster.getLevel() == 3 && chance < 0.25){
                        hasRun = true;
                    }
                    if(hasRun == true){
                        System.out.println("You run far away...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Uh oh, you broke");
                    break;
            }
        }
    }

    public static boolean checkCoord(int[][] tc, int x, int y){
        int[] currentArray = new int[0];
        for(int i = 0; i < tc.length; i++){
            currentArray = tc[i];
            if(currentArray[0] == x){
                if(currentArray[1] == y){
                    return false;
                }
            }
        }
        return true;
    }

    public static String getRandomString(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void pressEnter(){
        Scanner s = new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        String str = s.nextLine();
    }
}