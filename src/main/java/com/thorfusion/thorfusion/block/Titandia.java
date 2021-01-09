package com.thorfusion.thorfusion.block;

import com.thorfusion.thorfusion.Thorfusion;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Titandia extends Block {
    private static final String name = "titandia";

    public Titandia() {
        super(Material.iron);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Thorfusion.MODID + ":" + name);
        setCreativeTab(Thorfusion.tabTitanpower);
        setBlockName(name);
        setLightLevel(1F);
        setStepSound(soundTypeSand);
        setResistance(40000F);
        setHardness(0.1F);
        setHarvestLevel("shovel", 3);
    }
}
