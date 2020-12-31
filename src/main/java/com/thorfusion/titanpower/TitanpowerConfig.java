package com.thorfusion.titanpower;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class TitanpowerConfig {
    public static boolean Titanpoweroregeneration;
    public static void init() {
        //this line either creates the file if it doesn't exist or opens it if it already exists.
        Configuration config = new Configuration(new File("config/Titanpower.cfg"));
        config.load();//reads the contents of the file into the Configuration object.

        //use the config.get* methods to add/get values from the config as I explained above.
        Titanpoweroregeneration = config.get("Settings", "Oregeneration", true).getBoolean();
        //after you're done:
        config.save();//saves the Configuration content into the file.
    }
}
