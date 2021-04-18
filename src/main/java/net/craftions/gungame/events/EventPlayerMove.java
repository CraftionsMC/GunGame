/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class EventPlayerMove implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        try {
            if(e.getPlayer().getLocation().getBlock().getType().equals(Material.WATER)){
                e.getPlayer().setHealth(0.0D);
            }
        }catch (Exception ex){}
    }
}
