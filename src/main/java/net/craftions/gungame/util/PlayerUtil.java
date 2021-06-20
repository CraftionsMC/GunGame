/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.util;

import net.luckperms.api.LuckPermsProvider;
import org.bukkit.entity.Player;

public class PlayerUtil {

    public static String getNameWithPrefix(Player p){
        return LuckPermsProvider.get().getGroupManager().getGroup(LuckPermsProvider.get().getUserManager().getUser(p.getUniqueId()).getPrimaryGroup()).getCachedData().getMetaData().getPrefix() + p.getName();
    }
}
