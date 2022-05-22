package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TitanpowerItems {
    public static Item blurod;
    public static Item TerralizationCreative;
    public static Item bludust;
    public static Item bluplate;

    public static void init() {
        blurod = new Item().setUnlocalizedName("blurod").setTextureName(Titanpower.MODID + ":blurod").setCreativeTab(Titanpower.tabTitanpower);
        TerralizationCreative = new Item().setUnlocalizedName("TerralizationCreative").setTextureName(Titanpower.MODID + ":TerralizationCreative").setCreativeTab(Titanpower.tabTitanpower);
        bludust = new Item().setUnlocalizedName("bludust").setTextureName(Titanpower.MODID + ":bludust").setCreativeTab(Titanpower.tabTitanpower);
        bluplate = new Item().setUnlocalizedName("bluplate").setTextureName(Titanpower.MODID + ":bluplate").setCreativeTab(Titanpower.tabTitanpower);
    }

    public static void register() {
        GameRegistry.registerItem(blurod, blurod.getUnlocalizedName());
        GameRegistry.registerItem(TerralizationCreative, TerralizationCreative.getUnlocalizedName());
        GameRegistry.registerItem(bludust, bludust.getUnlocalizedName());
        GameRegistry.registerItem(bluplate, bluplate.getUnlocalizedName());
        OreDictionary.registerOre("oreBlurod", new ItemStack(blurod, 1, 0));
        OreDictionary.registerOre("dustBludust", new ItemStack(bludust, 1, 0));
        OreDictionary.registerOre("plateBluplate", new ItemStack(bluplate, 1, 0));
    }
}
