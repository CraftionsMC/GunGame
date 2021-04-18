/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame;

import net.craftions.gungame.commands.CommandSetSpawn;
import net.craftions.gungame.config.Config;
import net.craftions.gungame.logger.Logger;
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
                w.write("prefix: [§5GunGame§r]\n");
                w.write("spawn:\n");
                w.write("\t==: org.bukkit.Location\n");
                w.write("\tworld: world\n");
                w.write("\tx: 0\n");
                w.write("\ty: 0\n");
                w.write("\tz: 0\n");
                w.write("\tpitch: 0\n");
                w.write("\tyaw: 0\n");
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Config _c = new Config(cfgFile, "c");
        Logger.initLogger();

        getCommand("setspawn").setExecutor(new CommandSetSpawn());

        Logger.info("Welcome to GunGame v" + this.getDescription().getVersion() + " by MCTzOCK");
        super.onEnable();
    }
}
