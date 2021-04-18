/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class Levels {

    public static HashMap<Integer, Level> lvls = new HashMap<>();
    public static HashMap<String, Integer> plvls = new HashMap<>();

    public static void updateLevel(Player p){
        p.getInventory().setContents(lvls.get(plvls.get(p.getName())).getInventory().getContents());
    }

    public static void subtractLevelIfPossible(Player p){
        if(plvls.get(p.getName()) > 0){
            plvls.put(p.getName(), plvls.get(p.getName()) - 1);
            updateLevel(p);
        }
    }

    public static void addLevelIfPossible(Player p) {
        if(plvls.get(p.getName()) < lvls.size()){
            plvls.put(p.getName(), plvls.get(p.getName()) + 1);
            updateLevel(p);
        }
    }
}
