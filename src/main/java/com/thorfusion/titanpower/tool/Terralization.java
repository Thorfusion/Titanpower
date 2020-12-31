package com.thorfusion.titanpower.tool;

import com.thorfusion.titanpower.Titanpower;
import com.thorfusion.titanpower.TitanpowerConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class Terralization extends ItemPickaxe {
    private static final String name = "Terralization";

    public Terralization() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, TitanpowerConfig.TerralizationDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Titanpower.tabTitanpower);
        setTextureName(Titanpower.MODID + ":" + name);
        setUnlocalizedName("Terralization");
    }
}