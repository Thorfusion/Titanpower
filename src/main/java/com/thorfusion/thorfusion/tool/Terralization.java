package com.thorfusion.thorfusion.tool;

import com.thorfusion.thorfusion.Thorfusion;
import com.thorfusion.thorfusion.ThorfusionConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class Terralization extends ItemPickaxe {
    private static final String name = "Terralization";

    public Terralization() {
        super(EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, ThorfusionConfig.TerralizationDamage, 99));
        GameRegistry.registerItem(this, name);
        setCreativeTab(Thorfusion.tabTitanpower);
        setTextureName(Thorfusion.MODID + ":" + name);
        setUnlocalizedName("Terralization");
    }
}