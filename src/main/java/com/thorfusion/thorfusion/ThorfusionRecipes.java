package com.thorfusion.thorfusion;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ThorfusionRecipes {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ThorfusionBlocks.titandia), new Object[]{"ooo", "oao", "ooo", 'o', Blocks.obsidian, 'a', Blocks.anvil});
        GameRegistry.addRecipe(new ItemStack(ThorfusionTools.PickaxeTerralization), new Object[]{"ttt", " d ", " d ", 't', ThorfusionBlocks.titandia, 'd', ThorfusionItems.blurod});
        GameRegistry.addRecipe(new ItemStack(ThorfusionTools.BluAxe), new Object[]{"tdt", "tdt", " d ", 't', ThorfusionBlocks.titandia, 'd', ThorfusionItems.blurod});
        GameRegistry.addRecipe(new ItemStack(ThorfusionTools.BluShovel), new Object[]{" t ", " d ", " d ", 't', ThorfusionBlocks.titandia, 'd', ThorfusionItems.blurod});
    }
}
