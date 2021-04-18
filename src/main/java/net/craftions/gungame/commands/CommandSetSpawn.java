/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.commands;

import net.craftions.gungame.config.Config;
import net.craftions.gungame.logger.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSetSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player){
            Config.getInstance("c").set("spawn", ((Player) sender).getLocation());
            sender.sendMessage(Logger.prefix + "§cThe spawn was successfully set!");
        }else {
            Logger.error("You need to be a player in order to run this command!");
        }
        return true;
    }
}
