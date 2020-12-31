package com.thorfusion.titanpower;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class TitanpowerConfig {
    public static boolean Titanpoweroregeneration;
    public static boolean Blueradiengeneration;
    public static float TerralizationDamage;

    public static void init() {
        //this line either creates the file if it doesn't exist or opens it if it already exists.
        Configuration config = new Configuration(new File("config/Titanpower.cfg"));
        config.load();//reads the contents of the file into the Configuration object.

        //use the config.get* methods to add/get values from the config as I explained above.
        //OreGeneration
        Titanpoweroregeneration = config.get("Generation", "Oregeneration", true).getBoolean();
        Blueradiengeneration = config.get("Generation", "BluradienGeneration", true).getBoolean();
        //Tools
        TerralizationDamage = (float) config.get("Tools", "TerralizationDamage", 130.0).getDouble();
        //after you're done:
        config.save();//saves the Configuration content into the file.
    }
}
