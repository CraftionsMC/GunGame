/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import net.craftions.gungame.config.Config;
import net.craftions.gungame.level.Levels;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import java.util.logging.Level;

public class EventPlayerRespawn implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){
        try {
            e.setRespawnLocation((Location) Config.getInstance("c").get("spawn"));
            Levels.updateLevel(e.getPlayer());
        }catch (NullPointerException ex){}
    }

}
