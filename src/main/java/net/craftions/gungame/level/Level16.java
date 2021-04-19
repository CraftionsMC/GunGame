/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.level;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Level16 implements Level{

    @Override
    public Inventory getInventory() {
        Inventory inv = Levels.lvls.get(getLevel() - 1).getInventory();
        ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
        ironSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
        return inv;
    }

    @Override
    public Integer getLevel() {
        return 16;
    }
}
