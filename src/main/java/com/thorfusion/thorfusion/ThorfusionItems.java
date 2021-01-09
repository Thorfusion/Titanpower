package com.thorfusion.thorfusion;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ThorfusionItems {
	public static Item blurod;
	public static Item TerralizationCreative;

	public static void init() {
		blurod = new Item().setUnlocalizedName("blurod").setTextureName(Thorfusion.MODID + ":blurod").setCreativeTab(Thorfusion.tabTitanpower);
		TerralizationCreative = new Item().setUnlocalizedName("TerralizationCreative").setTextureName(Thorfusion.MODID + ":TerralizationCreative").setCreativeTab(Thorfusion.tabTitanpower);
	}

	public static void register() {
		GameRegistry.registerItem(blurod, blurod.getUnlocalizedName());
		GameRegistry.registerItem(TerralizationCreative, TerralizationCreative.getUnlocalizedName());
	}
}
