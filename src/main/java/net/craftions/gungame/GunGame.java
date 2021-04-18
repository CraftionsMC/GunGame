/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame;

import net.craftions.gungame.commands.CommandSetSpawn;
import net.craftions.gungame.config.Config;
import net.craftions.gungame.events.*;
import net.craftions.gungame.level.*;
import net.craftions.gungame.logger.Logger;
import net.craftions.gungame.util.FileUtil;
import org.bukkit.Bukkit;
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
                w.write("prefix: \"[§5GunGame§r]\"\n");
                w.write("spawn:\n");
                w.write("  ==: org.bukkit.Location\n");
                w.write("  world: world\n");
                w.write("  x: 0\n");
                w.write("  y: 0\n");
                w.write("  z: 0\n");
                w.write("  pitch: 0\n");
                w.write("  yaw: 0\n");
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Config _c = new Config(cfgFile, "c");
        Logger.initLogger();

        getCommand("setspawn").setExecutor(new CommandSetSpawn());

        Bukkit.getPluginManager().registerEvents(new EventPlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerDeath(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerMove(), this);
        Bukkit.getPluginManager().registerEvents(new EventPlayerRespawn(), this);
        Bukkit.getPluginManager().registerEvents(new EventItemDrop(), this);

        Levels.lvls.put(0, new Level0());
        Levels.lvls.put(1, new Level1());
        Levels.lvls.put(2, new Level2());
        Levels.lvls.put(3, new Level3());
        Levels.lvls.put(4, new Level4());
        Levels.lvls.put(5, new Level5());
        Levels.lvls.put(6, new Level6());
        Levels.lvls.put(7, new Level7());
        Levels.lvls.put(8, new Level8());
        Levels.lvls.put(9, new Level9());
        Levels.lvls.put(10, new Level10());

        Logger.info("Welcome to GunGame v" + this.getDescription().getVersion() + " by MCTzOCK");
        super.onEnable();
    }
}
