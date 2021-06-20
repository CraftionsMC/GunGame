/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.events;

import net.craftions.gungame.config.Config;
import net.craftions.gungame.level.Levels;
import net.craftions.gungame.util.PlayerUtil;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Objects;

public class EventPlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatColor.RED + PlayerUtil.getNameWithPrefix(e.getPlayer()) + ChatColor.GRAY + " joined " + ChatColor.RED + "the game");
        e.getPlayer().teleport((Location) Config.getInstance("c").get("spawn"));
        e.getPlayer().setHealth(e.getPlayer().getMaxHealth());
        e.getPlayer().setFoodLevel(20);
        Levels.plvls.put(e.getPlayer().getName(), 0);
        e.getPlayer().getInventory().setContents(Levels.lvls.get(0).getInventory().getContents());
        Objects.requireNonNull(e.getPlayer().getAttribute(Attribute.GENERIC_ATTACK_SPEED)).setBaseValue(16.0);
    }
}
