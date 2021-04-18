/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class EventItemDrop implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        if(!e.getPlayer().hasPermission("gungame.drop.item")){
            e.setCancelled(true);
        }
    }
}
