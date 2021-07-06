package com.thorfusion.titanpower;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class TitanpowerConfig {
    public static boolean Titanpoweroregeneration;
    public static boolean Blueradiengeneration;
    public static boolean Blueradiengenerationnether;
    public static boolean Blueradiengenerationend;
    public static boolean EnableTerralization;
    public static boolean EnableBluAxe;
    public static boolean EnableBluShovel;
    public static boolean EnableBluArmor;
    public static boolean EnableCapes;
    public static float TerralizationDamage;
    public static float BluAxeDamage;
    public static float BluShovelDamage;
    public static int BluArmourDurability;
    public static int BluHatArmour;
    public static int BluChestArmour;
    public static int BluLeggingsArmour;
    public static int BluBootsArmour;
    public static int Blueradiengenerationminveinsize;
    public static int Blueradiengenerationmaxveinsize;
    public static int Blueradiengenerationchanceveinsize;
    public static int Blueradiengenerationminy;
    public static int Blueradiengenerationmaxy;
    public static int Blueradiengenerationnetherminveinsize;
    public static int Blueradiengenerationnethermaxveinsize;
    public static int Blueradiengenerationnetherchanceveinsize;
    public static int Blueradiengenerationnetherminy;
    public static int Blueradiengenerationnethermaxy;
    public static int Blueradiengenerationendminveinsize;
    public static int Blueradiengenerationendmaxveinsize;
    public static int Blueradiengenerationendchanceveinsize;
    public static int Blueradiengenerationendminy;
    public static int Blueradiengenerationendmaxy;

    public static void init() {
        Configuration config;
        //this line either creates the file if it doesn't exist or opens it if it already exists.
        config = new Configuration(new File("config/Titanpower.cfg"));
        config.load();//reads the contents of the file into the Configuration object.

        //use the config.get* methods to add/get values from the config as I explained above.
        //OreGeneration
        Titanpoweroregeneration = config.get("Generation", "Oregeneration", true).getBoolean();
        //Generation in world
        Blueradiengeneration = config.get("Generation_World", "BluradienOre", true).getBoolean();
        Blueradiengenerationminveinsize = config.get("Generation_World", "Bluradien_minveinsize", 2).getInt();
        Blueradiengenerationmaxveinsize = config.get("Generation_World", "Bluradien_maxveinsize", 3).getInt();
        Blueradiengenerationchanceveinsize = config.get("Generation_World", "Bluradien_chance", 1).getInt();
        Blueradiengenerationminy = config.get("Generation_World", "Bluradien_miny", 10).getInt();
        Blueradiengenerationmaxy = config.get("Generation_World", "Bluradien_maxy", 40).getInt();
        //Generation in nether
        Blueradiengenerationnether = config.get("Generation_Nether", "BluradienGeneration", true).getBoolean();
        Blueradiengenerationnetherminveinsize = config.get("Generation_Nether", "Bluradien_minveinsize", 2).getInt();
        Blueradiengenerationnethermaxveinsize = config.get("Generation_Nether", "Bluradien_maxveinsize", 5).getInt();
        Blueradiengenerationnetherchanceveinsize = config.get("Generation_Nether", "Bluradien_chance", 1).getInt();
        Blueradiengenerationnetherminy = config.get("Generation_Nether", "Bluradien_miny", 105).getInt();
        Blueradiengenerationnethermaxy = config.get("Generation_Nether", "Bluradien_maxy", 120).getInt();
        //Generation in end
        Blueradiengenerationend = config.get("Generation_End", "BluradienGeneration", true).getBoolean();
        Blueradiengenerationendminveinsize = config.get("Generation_End", "Bluradien_minveinsize", 3).getInt();
        Blueradiengenerationendmaxveinsize = config.get("Generation_End", "Bluradien_maxveinsize", 10).getInt();
        Blueradiengenerationendchanceveinsize = config.get("Generation_End", "Bluradien_chance", 40).getInt();
        Blueradiengenerationendminy = config.get("Generation_End", "Bluradien_miny", 0).getInt();
        Blueradiengenerationendmaxy = config.get("Generation_End", "Bluradien_maxy", 200).getInt();

        //Tools
        TerralizationDamage = (float) config.get("Tools", "TerralizationDamage", 130.0).getDouble();
        BluAxeDamage = (float) config.get("Tools", "BluAxeDamage", 280.0).getDouble();
        BluShovelDamage = (float) config.get("Tools", "BluShovelDamage", 68.0).getDouble();
        EnableTerralization = config.get("Tools", "Terralization", true).getBoolean();
        EnableBluAxe = config.get("Tools", "BluAxe", true).getBoolean();
        EnableBluShovel = config.get("Tools", "BluShovel", true).getBoolean();

        //Armour
        EnableBluArmor = config.get("Armour", "Enable_BluArmour", true).getBoolean();
        BluArmourDurability = config.get("Armour", "BluArmour_Durability", 5000).getInt();
        BluHatArmour = config.get("Armour", "BluHat_Armour", 20).getInt();
        BluChestArmour = config.get("Armour", "BluChestplate_Armour", 70).getInt();
        BluLeggingsArmour = config.get("Armour", "BluLeggings_Armour", 50).getInt();
        BluBootsArmour = config.get("Armour", "BluBoots_Armour", 30).getInt();
        //General
        EnableCapes = config.get("General", "Capes", true).getBoolean();
        try {
            config.save();//saves the Configuration content into the file.
        } catch (Exception e) {
            System.out.println("Could't save changes to the config file");
        }
    }
}
