/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.logger;

import net.craftions.gungame.config.Config;

public class Logger {

    public static String prefix = "";

    public static void initLogger(){
        prefix = (String) Config.getInstance("c").get("prefix") + " ";
    }

    public static void info(String msg){
        System.out.println(prefix + " => [INFO] " + msg);
    }

    public static void warn(String msg){
        System.out.println(prefix + " => [WARN] " + msg);
    }

    public static void error(String msg){
        System.out.println(prefix + " => [ERROR] " + msg);
    }
}