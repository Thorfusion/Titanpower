package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TitanpowerRecipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(TitanpowerBlocks.titandia), new Object[] {"ooo", "oao", "ooo", 'o', Blocks.obsidian, 'a', Blocks.anvil}
    }
}