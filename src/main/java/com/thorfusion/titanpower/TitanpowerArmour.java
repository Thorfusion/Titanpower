package com.thorfusion.titanpower;

import com.thorfusion.titanpower.armour.Bluarmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class TitanpowerArmour {
    public static Item Bluchest;
    public static Item Bluleggings;
    public static Item Bluboots;
    public static Item Bluhat;

    private static final String bluhatname = "blu_hat";
    private static final String bluchestname = "blu_chest";
    private static final String bluleggingsname = "blu_leggings";
    private static final String blubootsname = "blu_boots";

    public static final ItemArmor.ArmorMaterial bluArmorMaterial = EnumHelper.addArmorMaterial("bluArmorMaterial", 5000, new int[]{20,70,50,30}, 99);

    public static void init() {
        Bluhat = new Bluarmor(bluArmorMaterial, 0, 0).setCreativeTab(Titanpower.tabTitanpower).setTextureName(Titanpower.MODID + ":" + bluhatname).setUnlocalizedName(bluhatname);
        Bluchest = new Bluarmor(bluArmorMaterial, 0, 1).setCreativeTab(Titanpower.tabTitanpower).setTextureName(Titanpower.MODID + ":" + bluchestname).setUnlocalizedName(bluchestname);
        Bluleggings = new Bluarmor(bluArmorMaterial, 0, 2).setCreativeTab(Titanpower.tabTitanpower).setTextureName(Titanpower.MODID + ":" + bluleggingsname).setUnlocalizedName(bluleggingsname);
        Bluboots = new Bluarmor(bluArmorMaterial, 0, 3).setCreativeTab(Titanpower.tabTitanpower).setTextureName(Titanpower.MODID + ":" + blubootsname).setUnlocalizedName(blubootsname);
    }
        public static void register() {
            GameRegistry.registerItem(Bluhat, bluhatname);
            GameRegistry.registerItem(Bluchest, bluchestname);
            GameRegistry.registerItem(Bluleggings, bluleggingsname);
            GameRegistry.registerItem(Bluboots, blubootsname);
    }
}
