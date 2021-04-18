/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.gungame.util;

import java.io.File;

public class FileUtil {

    public static void createPath(File f){
        if(!f.isDirectory()){
            f.mkdirs();
        }
    }

    public static void createPath(String path){
        if(!(new File(path).isDirectory())){
            new File(path).mkdirs();
        }
    }
}
