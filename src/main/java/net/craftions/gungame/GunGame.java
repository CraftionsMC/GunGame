/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class GunGame extends JavaPlugin {

    @Override
    public void onEnable() {
        // check config
        File cfgFile = new File("./plugins/GunGame/config.yml");
        if(!cfgFile.getParentFile().isDirectory()){
            cfgFile.getParentFile().mkdirs();
        }
        if(!cfgFile.exists()){

        }
        super.onEnable();
    }


}
