import java.util.*;
import java.io.*;


public class Driver{
    public static void main(String args[]){
        Hero hero;
        Entity[][] map = new Entity[15][15];
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        int[][] takenCoord = new int[10][2];
        int index = 0;
        int newCoordX = 0;
        int newCoordY = 0;
        
        System.out.println("\f\n\tI could tell you an amazing fantasy story about a great old castle with " + 
        "good kings and evil kings, princes and princesses, knights and heroes.");
        pressEnter();
        System.out.println("\f\n\tIt all starts in Nebus,an old yet dainty town. But unlike everywhere else in the land...");
        pressEnter();
        System.out.println("\f\n\tNebus didn't have kings. Nor did it have queens, or princes or princesses.");
        pressEnter();
        System.out.println("\f\n\tInstead, the old seers and warlocks guided the happenings of the town.\n" + 
        "If they had anything wrong to say, nobody knew. They were right, whether you knew better or not...");
        pressEnter();
        System.out.println("\f\n\tSo it seemed inevitable for the mighty Malkos the Slayer to stumble upon\n" + 
        "the little village of Nebus. He'd freed the last village from the evil plights of dragons, what\n" + 
        "difficulty was there in learning a little magic?");
        pressEnter();
        System.out.println("\f\n\tSo Malkos studied and learned, gaining his ranks through aggressive spells and witchcraft\n" + 
        "Before the little town of Nebus knew it, Malkos had become their most powerful seer...");
        pressEnter();
        System.out.println("\f\n\tBut, the powerhungry Malkos killed all of Nebus' advisors and assumed absolute control\n" +
        "So there was nobody to warn him of the evil in Nebus' magic...");
        pressEnter();
        System.out.println("\f\n\tBy the time Malkos discovered Nebus' secrets, it was too late.\n" + 
        "Malkos had summoned the Dark Circle, a portal through which legions of hellish creatures\n" + 
        "entered and appeared on the land. They wreaked havoc and brought chaos.");
        pressEnter();
        System.out.println("\f\n\tThat's where you come in.");

        Scanner theName = new Scanner(System.in);
        System.out.println("I'm sorry, I didn't catch your name...");
        System.out.print("Name: ");
        String heroName = theName.next();
        
        System.out.println("\f\n\tAh, " + heroName + ", a pleasure to meet you. Oh my, where are my \n" + 
        "manners? My name's Apex, and I served in the 38th Battalion back in the day...but these\n" + 
        "old bones are as rusty as my armor! Like I said, I could have told you a nice dainty\n" + 
        "story about kings and queens and castles and all that nonsense...");
        pressEnter();
        System.out.println("\f\n\tBut that'd be a lie. Your story is about hacking and slashing through the\n" +
        "many hellspawns of the Dark Circle. No romance, no preparations. Now, let's get to the killing!");
        pressEnter();
        
        // Testing map printout
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                map[i][j] = new Air();
            }
        }

        //create obj
        Weapon dagger = new Weapon(0, 0, 1, 20, "Dagger");
        Armor leatherArmor = new Armor(0, 0, 0, "Leather Chestplate");
        if(heroName.equals("godmode")){
            hero = new Hero(0, 14, new Weapon(1200, 2000, "God Sword"), new Armor(1, "God Plate", 0), 999999, "TESTER");
            hero.setFootwear(new Footwear(1, "God Boots", 0));
            hero.setPhoenixMode(true);
        }else{
            hero = new Hero(0, 14, dagger, leatherArmor, 0, heroName);
        }

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
        Armor bronzeArmor = new Armor(newCoordX, newCoordY, 30, "Bronze Armor");
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
        
        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){
            newCoordX = (int)(Math.random() * 15);
            newCoordY = (int)(Math.random()*15);
        }
        Boss boss1 = new Boss("Glog the Slug", newCoordX, newCoordY, 175, 20, 1, 4, "Glub glub");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;
        
        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){
            newCoordX = (int)(Math.random() * 15);
            newCoordY = (int)(Math.random()*15);
        }
        Boss boss2 = new Boss("Mikmik the Troll", newCoordX, newCoordY, 150, 35, 3, 5, "My treasure! Mine!");
        takenCoord[index][0] = newCoordX;
        takenCoord[index][1] = newCoordY;
        index++;
        
        while(checkCoord(takenCoord, newCoordX, newCoordY) == false){
            newCoordX = (int)(Math.random() * 15);
            newCoordY = (int)(Math.random()*15);
        }
        Boss boss3 = new Boss("Malkos the Slayer", newCoordX, newCoordY, 200, 40, 2, 6, "Cold as death!");
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
        entityList.add(boss1);
        entityList.add(boss2);
        entityList.add(boss3);

        for(int i = 0; i < entityList.size(); i++){ //set all obj to map
            Entity currentObj = entityList.get(i);
            map[currentObj.getY()][currentObj.getX()] = currentObj;
        }

        runGame(map, entityList, hero);
        
        //ENDGAME
        System.out.println("\f\n\tYou've done it! You cleared the waves of the Dark Circle!");
        pressEnter();
        System.out.println("\f\n\tThank you so much from the bottom of my old heart. And I'm sure\n" +
        "Nebus--no, the entire world--is extremely grateful for your acts. Maybe I was wrong...");
        pressEnter();
        System.out.println("\f\n\tMaybe there are heroes...\n\n\t\tTHE END");
    }

    public static void runGame(Entity[][] map, ArrayList<Entity> entityList, Hero hero){
        Scanner s = new Scanner(System.in);
        String lastAction = "Spawned into the game.";
        String toNorth = "";
        String toWest = "";
        String toSouth = "";
        String toEast = "";
        double monsterChance = 0.25; //Hardcoded Monster Creation chance; default = 0.15
        
        while(true){
            System.out.println("\f");
            System.out.println(printMap(map));
            
            System.out.println("\n-- Info --");
            System.out.println(hero);
            int item_counter = 0;
            for(int i = 0; i < hero.getHardStorage().length; i++){
                if(!(hero.getHardStorage()[i] == null)){
                    item_counter++;
                }
            }
            System.out.println("Inventory: " + item_counter + "/" + (hero.getHardStorage()).length + " items\n");
            
            String surroundings = updateSurroundings(hero, map);
            String[] surrounding_parts = surroundings.split("_");
            
            toNorth = surrounding_parts[0];
            toWest = surrounding_parts[1];
            toSouth = surrounding_parts[2];
            toEast = surrounding_parts[3];
            
            System.out.println("Feed: " + lastAction);
            System.out.println("\nNorth: " + toNorth);
            System.out.println("West: " + toWest);
            System.out.println("South: "  + toSouth);
            System.out.println("East: " + toEast);
            
            System.out.println("\n\n\t\tW - North\tE - Inventory");
            System.out.println("A - West\tS - South\tD - East");
            
            System.out.print("\nNext action: ");
            String action = s.next();

            switch(action){
                case "w":
                    if(hero.getY() == 0){
                        lastAction = "You hit a wall.";
                        hero.setHP(hero.getHP() - 1);
                        break;
                    }
                    switch(staticCheck(hero, map, entityList, action).getClass().toString()){
                        case "class Air":
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Moved North";
                            break;
                        case "class Farmer":
                            FarmerSeq(hero, map, (Farmer)map[hero.getY()-1][hero.getX()]);    
                            break;
                        case "class Potion":
                            hero.addToStorage(map[hero.getY() - 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up potion";
                            break;
                        case "class Weapon":
                            hero.addToStorage(map[hero.getY() - 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up weapon";
                            break;
                        case "class Armor":
                            hero.addToStorage(map[hero.getY() - 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up armor";
                            break;
                        case "class Boss":
                            
                        default:
                            break;
                    }
                    if(Math.random() < monsterChance){
                        AttackSequence(map, hero);
                        lastAction = "Fought monster";
                    }
                    break;
                case "a":
                    if(hero.getX() == 0){
                        lastAction = "You hit a wall.";
                        hero.setHP(hero.getHP() - 1);
                        break;
                    }
                    switch(staticCheck(hero, map, entityList, action).getClass().toString()){
                        case "class Air":
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Moved West";
                            break;
                        case "class Farmer":
                            FarmerSeq(hero, map, (Farmer)map[hero.getY()][hero.getX() - 1]);
                            break;
                        case "class Potion":
                            hero.addToStorage(map[hero.getY()][hero.getX() - 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up potion";
                            break;
                        case "class Weapon":
                            hero.addToStorage(map[hero.getY()][hero.getX() - 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up weapon";
                            break;
                        case "class Armor":
                            hero.addToStorage(map[hero.getY()][hero.getX() - 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() - 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up armor";
                            break;
                        default:
                            break;
                    }
                    if(Math.random() < monsterChance){
                        AttackSequence(map, hero);
                        lastAction = "Fought monster";
                    }
                    break;
                case "s":
                    if(hero.getY() == 14){
                        lastAction = "You hit a wall.";
                        hero.setHP(hero.getHP() - 1);
                        break;
                    }
                    switch(staticCheck(hero, map, entityList, action).getClass().toString()){
                        case "class Air":
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Moved South";
                            break;
                        case "class Farmer":
                            FarmerSeq(hero, map, (Farmer)map[hero.getY() + 1][hero.getX()]);
                            break;
                        case "class Potion":
                            hero.addToStorage(map[hero.getY() + 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up potion";
                            break;
                        case "class Weapon":
                            hero.addToStorage(map[hero.getY() + 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up weapon";
                            break;
                        case "class Armor":
                            hero.addToStorage(map[hero.getY() + 1][hero.getX()]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setY(hero.getY() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up armor";
                            break;
                        default:
                            break;
                    }
                    if(Math.random() < monsterChance){
                        AttackSequence(map, hero);
                        lastAction = "Fought monster";
                    }
                    break;
                case "d":
                    if(hero.getX() == 14){
                        lastAction = "You hit a wall.";
                        hero.setHP(hero.getHP() - 1);
                        break;
                    }
                    switch(staticCheck(hero, map, entityList, action).getClass().toString()){
                        case "class Air":
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Moved East";
                            break;
                        case "class Farmer":
                            FarmerSeq(hero, map, (Farmer)map[hero.getY()][hero.getX()+1]);
                            break;
                        case "class Potion":
                            hero.addToStorage(map[hero.getY()][hero.getX() + 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up potion";
                            break;
                        case "class Weapon":
                            hero.addToStorage(map[hero.getY()][hero.getX() + 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up weapon";
                            break;
                        case "class Armor":
                            hero.addToStorage(map[hero.getY()][hero.getX() + 1]);
                            map[hero.getY()][hero.getX()] = new Air();
                            hero.setX(hero.getX() + 1);
                            map[hero.getY()][hero.getX()] = hero;
                            lastAction = "Picked up armor";
                            break;
                        default:
                            break;
                    }
                    if(Math.random() < monsterChance){
                        AttackSequence(map, hero);
                        lastAction = "Fought monster";
                    }
                    break;
                case "e":
                    inventoryMenu(hero);
                    break;
                case "kill":
                    return;
                default:
                    break;
            }
            if(hero.getHP() <= 0){
                return;
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
        if(y < 0 || y > 14 || x < 0 || x > 14){
            return new Air();
        }
        return map[y][x];
    }
    
    public static String updateSurroundings(Hero hero, Entity[][] map){
        int x = hero.getX();
        int y = hero.getY();
        String temp_str = "";
        String[] sub = new String[2];
        
        y--; // north
        if(y < 0){
            temp_str += "A wall_";
        } else {
            sub = map[y][x].getClass().toString().split(" ");
            temp_str += sub[1] + "_";
        }
        y++;
        
        x--; // west
        if(x < 0){
            temp_str += "A wall_";
        } else {
            sub = map[y][x].getClass().toString().split(" ");
            temp_str += sub[1] + "_";
        }
        x++;
        
        y++; // South.
        if(y > 14){
            temp_str += "A wall_";
        } else {
            sub = map[y][x].getClass().toString().split(" ");
            temp_str += sub[1] + "_";
        }
        y--;
        
        x++; // East
        if(x > 14){
            temp_str += "A wall_";
        } else {
            sub = map[y][x].getClass().toString().split(" ");
            temp_str += sub[1] + "_";
        }
        x--;
        
        return temp_str;
    }

    public static String printMap(Entity[][] map){
        String s = "";
        for(int r = 0; r < 15; r++){
            for(int c = 0; c < 15; c++){
                Object i = map[r][c];
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
                }else if((i.getClass().isInstance(new Boss()))){
                    s = s + "Boss\t";
                }else{
                    s = s + ".\t";
                }
            }
            s += "\n";
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
        int turn = 0;
        while(true){
            if(monster.getHP() < 0){
                break;
            }
            int dmgReceived = monster.getDMG();
            if(turn > 0){
                System.out.println("You took " + dmgReceived + " damage from " + monster.getName() + "!");
            }
            if(hero.getHP() <= 0){
                if(hero.hasPhoenix() == true){
                    System.out.println("\n---------Phoenix Mode has been triggered! Heroes never die!---------\n");
                    hero.setHP(100);
                    hero.setPhoenixMode(false);
                }else{
                    System.out.println("\f\n\n\t\t\tYOU HAVE DIED");
                    return;
                }
            }
            int choice = 0;
            
            System.out.println("\f---------TURN " + (turn + 1) + "---------");
            System.out.println("Hero stats: HP - " + hero.getHP() + ", Weapon - " + hero.getWeapon().getName() + ", Armor - " + hero.getArmor().getName());
            System.out.println("Monster stats: HP-" + monster.getHP() + ", Level-" + monster.getLevel());
            System.out.println("Your turn!\n");
            System.out.println("1. Attack");
            System.out.println("2. Run");
            if(hero.hasBomb() == true){
                System.out.println("3. Use Bomb (Instant Kill)");
            }
            System.out.print("Choice: ");
            try{
                choice = s.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Not an option, try again!");
                pressEnter();
                choice = 0;
                s = new Scanner(System.in);
                continue;
            }
            switch(choice){
                case 1:
                    System.out.println("Your " + hero.getWeapon().getName() + " slices out, cutting the monster!");
                    int heroDMGdealt = (int)(Math.random() * hero.getWeapon().getMaxDmg() - hero.getWeapon().getMinDmg()) + hero.getWeapon().getMinDmg();
                    monster.setHP(monster.getHP() - heroDMGdealt);
                    if(monster.getHP() < 0){
                        monster.setHP(0);
                    }
                    System.out.println("\n---You dealt " + heroDMGdealt + " damage to the " + monster.getName() + "!---" +
                        "\nThe " + monster.getName() + " has " + monster.getHP() + " health left.");
                    if(monster.getHP() == 0){
                        if(monster.getLevel() == 1){
                            hero.setHides(hero.getHides() + 25);
                            System.out.println("---You got 25 hides!---");
                        }else if(monster.getLevel() == 2){
                            hero.setHides(hero.getHides() + 50);
                            System.out.println("---You got 50 hides!---");
                        }else if(monster.getLevel() == 3){
                            hero.setHides(hero.getHides() + 75);
                            System.out.println("---You got 75 hides!---");
                        }
                        System.out.println("");
                        pressEnter();
                        return;
                    }
                    
                    System.out.println("\nThe monster counterattacks, dealing " + heroDMGdealt + " to the hero.\n");
                    
                    pressEnter();
                    break;
                case 2:
                    boolean hasRun = false;
                    double chance = Math.random();
                    double chanceInc = (hero.getFootwear()).getChanceInc();
                    chance = chance + chanceInc;
                    if(monster.getLevel() == 1 && chance > 0.25){
                        hasRun = true;
                    }else if(monster.getLevel() == 2 && chance > 0.5){
                        hasRun = true;
                    }else if(monster.getLevel() == 3 && chance > 0.75){
                        hasRun = true;
                    }
                    else if(monster.getLevel() >=4 && chance > 0.9){
                        hasRun = true;
                    }
                    if(hasRun == true){
                        System.out.println("You run far away...");
                        pressEnter();
                        return;
                    }
                    break;
                case 3:
                    if(hero.hasBomb() == true){
                        monster.setHP(0);
                        break;
                    }else{
                        continue;
                    }
                default:
                    System.out.println("Uh oh, you broke");
                    break;
            }
            hero.setHP(hero.getHP() - dmgReceived);
            turn++;
        }
    }
    
    public static void FarmerSeq(Hero hero, Entity[][] map, Farmer farmer){
        Scanner s = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("\f");
        System.out.println("You meet a farmer.");
        pressEnter();
        while(true){
            System.out.println("\fWelcome to the Farmer's Shoppe! What can we do for you today?");
            System.out.println("1. Buy Items\n2. Buy Information\n3. Exit Shop\n");
            System.out.print("Choice: ");
            try{
                choice = s.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Not an option, please try again!");
                pressEnter();
                choice = 0;
                s = new Scanner(System.in);
                continue;
            }
            switch(choice){
                case 1:
                    farmer.getShopItems();
                    System.out.println("\n\n9. Go back");
                    System.out.print("Choice: ");
                    choice = s.nextInt();
                    if(choice == 9){
                        System.out.println("\nPurchase cancelled.\n");
                        pressEnter();
                        continue;
                    } else {
                        hero.buyObject(choice, farmer);
                        System.out.println("");
                        pressEnter();
                    }
                    break;
                case 2:
                    System.out.println("\nI don't have anything for you right now. Please c'mon back later!\n");
                    pressEnter();
                    break;
                case 3:
                    System.out.println("Shop exited.");
                    pressEnter();
                    return;
            }
        }
    }

    
    public static void inventoryMenu(Hero hero){
        Scanner s = new Scanner(System.in);
        Entity[] list = hero.getHardStorage();
        
        while(true){
            System.out.println("\f");
            for(int i = 0; i < list.length; i++){
                if(list[i] != null){
                    System.out.println(list[i]);
                }
            }
            System.out.println("What would you like to do?");
            System.out.println("1. Use/Equip Item");
            System.out.println("2. Quit");
            System.out.print("Choice: ");
            int choice = 0;
            
            try{
                choice = s.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Not an option, please try again!");
                pressEnter();
                choice = 0;
                s = new Scanner(System.in);
                continue;
            }
            
            if(choice == 2){
                break;
            }
            if(choice == 1){
                System.out.println("\f");
                System.out.println("Which item would you like to use/equip?");
                for(int i = 0; i < list.length; i++){
                    if(list[i] != null){
                        System.out.println((i + 1) + ". " + list[i].getName());
                    }
                }
                System.out.println("\n7. Exit");
                System.out.println("\nChoice: ");
                try{
                    choice = s.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Not an option, please try again!");
                    pressEnter();
                    choice = 0;
                    s = new Scanner(System.in);
                    continue;
                }
                choice--;
                if(choice >= list.length || list[choice] == null || choice == 7){
                    break;
                }
                Entity item = list[choice];
                if((item.getClass()).isInstance(new Potion(null, 0, 0))){
                    if((((Potion)item).getName()).equals("Phoenix Potion")){
                        hero.setPhoenixMode(true);
                    }else{
                        hero.setHP(hero.getHP() + ((Potion)item).getPotency());
                    }
                    list[choice] = null;
                    for(int m = choice; m < list.length - 1; m++){
                        list[m] = list[m + 1];
                    }
                    list[list.length - 1] = null;
                    hero.setIndex(hero.getIndex() - 1);
                }else if((item.getClass()).isInstance(new Weapon(0, 0, null))){
                    hero.setWeapon((Weapon)item);
                    list[choice] = null;
                    for(int m = choice; m < list.length - 1; m++){
                        list[m] = list[m + 1];
                    }
                    list[list.length - 1] = null;
                    hero.setIndex(hero.getIndex() - 1);
                }else if((item.getClass()).isInstance(new Armor(0, null, 0))){
                    hero.setArmor((Armor)item);
                    list[choice] = null;
                    for(int m = choice; m < list.length - 1; m++){
                        list[m] = list[m + 1];
                    }
                    list[list.length - 1] = null;
                    hero.setIndex(hero.getIndex() - 1);
                }else if((item.getClass()).isInstance(new Footwear(0, null, 0))){
                    hero.setFootwear((Footwear)item);
                    list[choice] = null;
                    for(int m = choice; m < list.length - 1; m++){
                        list[m] = list[m + 1];
                    }
                    list[list.length - 1] = null;
                    hero.setIndex(hero.getIndex() - 1);
                }
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