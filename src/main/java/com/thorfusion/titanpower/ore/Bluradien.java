package com.thorfusion.titanpower.ore;

import com.thorfusion.titanpower.Titanpower;
import com.thorfusion.titanpower.TitanpowerItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

public class Bluradien extends Block {
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return TitanpowerItems.blurod;
    }
    private static final String name = "bluradien";

    public Bluradien() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        OreDictionary.registerOre("oreBluradien", new ItemStack(this, 1, 0));
        setBlockName(name);
        setBlockTextureName(Titanpower.MODID + ":" + name);
        setStepSound(Block.soundTypeGlass);
        setResistance(1000F);
        setHardness(4F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(Titanpower.tabTitanpower);
    }
}
