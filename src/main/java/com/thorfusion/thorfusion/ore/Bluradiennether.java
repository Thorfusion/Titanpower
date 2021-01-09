package com.thorfusion.thorfusion.ore;

import com.thorfusion.thorfusion.Thorfusion;
import com.thorfusion.thorfusion.ThorfusionItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class Bluradiennether extends Block {
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return ThorfusionItems.blurod;
    }
    private static final String name = "bluradiennether";

    public Bluradiennether() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(Thorfusion.MODID + ":" + name);
        setStepSound(Block.soundTypeGlass);
        setResistance(100F);
        setHardness(2.5F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(Thorfusion.tabTitanpower);
    }
}
