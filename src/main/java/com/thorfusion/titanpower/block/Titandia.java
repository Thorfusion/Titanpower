package com.thorfusion.titanpower.block;

import com.thorfusion.titanpower.Titanpower;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Titandia extends Block {
    private static final String name = "titandia";

    public Titandia() {
        super(Material.iron);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Titanpower.MODID + ":" + name);
        setCreativeTab(Titanpower.tabTitanpower);
        setBlockName(name);
        setLightLevel(1F);
        setStepSound(soundTypeSand);
        setResistance(4000F);
        setHardness(0.1F);
        setHarvestLevel("shovel", 3);
    }
}
