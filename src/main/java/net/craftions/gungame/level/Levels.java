/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class Levels {

    public static HashMap<Integer, Level> lvls = new HashMap<>();
    public static HashMap<Player, Integer> plvls = new HashMap<>();

    public static void updateLevel(Player p){
        p.getInventory().setContents(lvls.get(plvls.get(p)).getInventory().getContents());
    }

    public static void subtractLevelIfPossible(Player p){
        if(plvls.get(p) > 0){
            plvls.put(p, plvls.get(p) - 1);
            updateLevel(p);
        }
    }

    public static void addLevelIfPossible(Player p) {
        if(plvls.get(p) < lvls.size()){
            plvls.put(p, plvls.get(p) + 1);
            updateLevel(p);
        }
    }
}
