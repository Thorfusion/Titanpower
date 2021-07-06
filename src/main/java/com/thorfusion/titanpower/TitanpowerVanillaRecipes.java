package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TitanpowerVanillaRecipes {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(TitanpowerArmour.bluchest), new Object[]{"oxo", "ooo", "ooo", 'o', TitanpowerItems.blurod});
    }
}
