package com.thorfusion.thorfusion.tool;

import com.thorfusion.thorfusion.Thorfusion;
import com.thorfusion.thorfusion.ThorfusionConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class bluaxe extends ItemAxe {
    private static final String name = "blu_axe";

    public bluaxe() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, ThorfusionConfig.BluAxeDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Thorfusion.tabTitanpower);
        setTextureName(Thorfusion.MODID + ":" + name);
        setUnlocalizedName(name);
    }
}