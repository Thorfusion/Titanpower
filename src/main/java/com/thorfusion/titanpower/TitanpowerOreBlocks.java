package com.thorfusion.titanpower;


import com.thorfusion.titanpower.ore.Bluradien;
import com.thorfusion.titanpower.ore.Bluradienend;
import com.thorfusion.titanpower.ore.Bluradiennether;
import net.minecraft.block.Block;

public class TitanpowerOreBlocks {
    public static Block bluradien;
    public static Block bluradiennether;
    public static Block bluradienend;

    public static void init() {
        bluradien = new Bluradien();
        bluradiennether = new Bluradiennether();
        bluradienend = new Bluradienend();
    }

    public static void register() {

    }
}






