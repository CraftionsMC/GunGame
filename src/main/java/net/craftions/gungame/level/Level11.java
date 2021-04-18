/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Level11 implements Level{

    @Override
    public Inventory getInventory() {
        Inventory inv = Levels.lvls.get(getLevel() - 1).getInventory();
        ItemStack head = new ItemStack(Material.IRON_HELMET);
        inv.setItem(39, head);
        return inv;
    }

    @Override
    public Integer getLevel() {
        return 11;
    }
}
