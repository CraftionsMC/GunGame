/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import net.craftions.gungame.config.Config;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(e.getPlayer().hasPermission("gungame.join.visible")) {
            e.setJoinMessage("§c" + e.getPlayer().getName() + " §7joined §cGunGame");
        }else {
            e.setJoinMessage("");
        }
        e.getPlayer().teleport((Location) Config.getInstance("c").get("spawn"));
    }
}
