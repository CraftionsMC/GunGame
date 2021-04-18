/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import net.craftions.gungame.config.Config;
import net.craftions.gungame.level.Levels;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventPlayerDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        e.setKeepInventory(true);
        e.setDeathMessage("");
        Levels.subtractLevelIfPossible(e.getEntity());
        if(e.getEntity().getKiller() instanceof Player){
            Levels.addLevelIfPossible(e.getEntity().getKiller());
        }
    }
}
