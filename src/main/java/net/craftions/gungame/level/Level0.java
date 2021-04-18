/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Level0 implements Level{

    @Override
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, InventoryType.PLAYER);
        ItemStack woodenAxe = new ItemStack(Material.WOODEN_AXE);
        inv.setItem(0, woodenAxe);
        return inv;
    }

    @Override
    public Integer getLevel() {
        return 0;
    }
}
