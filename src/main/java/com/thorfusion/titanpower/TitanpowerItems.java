package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class TitanpowerItems {
	public static Item blurod;
	public static Item TerralizationCreative;

	public static void init() {
		blurod = new Item().setUnlocalizedName("blurod").setTextureName(Titanpower.MODID + ":blurod").setCreativeTab(Titanpower.tabTitanpower);
		TerralizationCreative = new Item().setUnlocalizedName("TerralizationCreative").setTextureName(Titanpower.MODID + ":TerralizationCreative").setCreativeTab(Titanpower.tabTitanpower);
	}

	public static void register() {
		GameRegistry.registerItem(blurod, blurod.getUnlocalizedName());
		GameRegistry.registerItem(TerralizationCreative, TerralizationCreative.getUnlocalizedName());
	}
}
