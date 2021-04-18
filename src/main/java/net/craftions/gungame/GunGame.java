/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame;

import net.craftions.gungame.config.Config;
import net.craftions.gungame.util.FileUtil;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GunGame extends JavaPlugin {

    @Override
    public void onEnable() {
        // check config
        File cfgFile = new File("./plugins/GunGame/config.yml");
        FileUtil.createPath(cfgFile.getParentFile());
        if(!cfgFile.exists()){
            try {
                cfgFile.createNewFile();
                FileWriter w = new FileWriter(cfgFile);
                w.write("prefix: [§5GunGame§r]");
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Config _c = new Config(cfgFile, "c");
        super.onEnable();
    }


}
