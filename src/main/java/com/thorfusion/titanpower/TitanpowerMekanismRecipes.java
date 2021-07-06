package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import mekanism.api.infuse.InfuseRegistry;
import mekanism.api.recipe.RecipeHelper;
import net.minecraft.item.ItemStack;



public class TitanpowerMekanismRecipes {
    public static void init() {
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(TitanpowerItems.blurod), new ItemStack(TitanpowerItems.bludust, 1));
        GameRegistry.addRecipe(new ItemStack(TitanpowerArmour.bluchest), new Object[]{"oxo", "ooo", "ooo", 'o', TitanpowerItems.bluplate});
    }
    public static void postinit() {
        RecipeHelper.addMetallurgicInfuserRecipe(InfuseRegistry.get("OBSIDIAN"), 10, new ItemStack(TitanpowerItems.bludust), new ItemStack(TitanpowerItems.bluplate, 1));
    }
}

