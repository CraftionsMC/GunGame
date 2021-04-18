/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Level1 implements Level{

    @Override
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, InventoryType.PLAYER);
        ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);
        inv.setItem(0, stoneSword);
        return inv;
    }

    @Override
    public Integer getLevel() {
        return 1;
    }
}
