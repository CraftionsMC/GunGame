/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Level10 implements Level{

    @Override
    public Inventory getInventory() {
        Inventory inv = Levels.lvls.get(getLevel() - 1).getInventory();
        ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
        inv.setItem(100, boots);
        return inv;
    }

    @Override
    public Integer getLevel() {
        return 10;
    }
}
