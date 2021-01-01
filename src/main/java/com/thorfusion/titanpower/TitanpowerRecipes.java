package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TitanpowerRecipes {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(TitanpowerBlocks.titandia), new Object[]{"ooo", "oao", "ooo", 'o', Blocks.obsidian, 'a', Blocks.anvil});
        GameRegistry.addRecipe(new ItemStack(TitanpowerTools.PickaxeTerralization), new Object[]{"ttt", " d ", " d ", 't', TitanpowerBlocks.titandia, 'd', TitanpowerItems.blurod});
        GameRegistry.addRecipe(new ItemStack(TitanpowerTools.BluAxe), new Object[]{"tdt", "tdt", " d ", 't', TitanpowerBlocks.titandia, 'd', TitanpowerItems.blurod});
        GameRegistry.addRecipe(new ItemStack(TitanpowerTools.BluShovel), new Object[]{" t ", " d ", " d ", 't', TitanpowerBlocks.titandia, 'd', TitanpowerItems.blurod});
    }
}
