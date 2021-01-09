package com.thorfusion.titanpower.tool;

import com.thorfusion.titanpower.Titanpower;
import com.thorfusion.titanpower.TitanpowerConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class bluaxe extends ItemAxe {
    private static final String name = "blu_axe";

    public bluaxe() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, TitanpowerConfig.BluAxeDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Titanpower.tabTitanpower);
        setTextureName(Titanpower.MODID + ":" + name);
        setUnlocalizedName(name);
    }
}