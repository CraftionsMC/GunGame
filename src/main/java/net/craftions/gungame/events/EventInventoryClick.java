/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventInventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(!e.getWhoClicked().hasPermission("gungame.inventory.click")){
            e.setCancelled(true);
        }
    }
}
