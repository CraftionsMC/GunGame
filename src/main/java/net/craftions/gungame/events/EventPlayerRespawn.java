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

public class EventPlayerRespawn implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){
        try {
            e.setRespawnLocation((Location) Config.getInstance("c").get("spawn"));
            e.getPlayer().getInventory().setContents(Levels.lvls.get(Levels.plvls.get(e.getPlayer())).getInventory().getContents());
        }catch (NullPointerException ex){}
    }

}
