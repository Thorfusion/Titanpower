package com.thorfusion.thorfusion.tool;

import com.thorfusion.thorfusion.Thorfusion;
import com.thorfusion.thorfusion.ThorfusionConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class blushovel extends ItemSpade {
    private static final String name = "blu_shovel";

    public blushovel() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, ThorfusionConfig.BluShovelDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Thorfusion.tabTitanpower);
        setTextureName(Thorfusion.MODID + ":" + name);
        setUnlocalizedName(name);
    }
}