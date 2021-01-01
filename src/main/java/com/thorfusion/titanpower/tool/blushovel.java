package com.thorfusion.titanpower.tool;

import com.thorfusion.titanpower.Titanpower;
import com.thorfusion.titanpower.TitanpowerConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class blushovel extends ItemSpade {
    private static final String name = "blu_shovel";

    public blushovel() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, TitanpowerConfig.BluShovelDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Titanpower.tabTitanpower);
        setTextureName(Titanpower.MODID + ":" + name);
        setUnlocalizedName(name);
    }
}