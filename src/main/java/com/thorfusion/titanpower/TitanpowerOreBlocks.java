package com.thorfusion.titanpower;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class TitanpowerOreBlocks
{
	public static Block bluradien;
	public static void init()
	{
		bluradien = new TitanpowerOreBlocks.Bluradien();
	}

	public static void register()
	{

	}

	public class Bluradien	extends Block {
		private static final String name = "bluradien";
		public Bluradien(){
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setBlockName(name)
		setBlockTextureName(Titanpower.MODID:name)
		setStepSound(Block.soundTypeGlass)
		setLightLevel(0.1F)
		setResistance(100F)
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Titanpower.tabTitanpower);
	}

	@Override
	public Item getItemDropped(int metadata,Random rand, int fortune) {
		
		return TitanpowerItems.blurod;
	}
}





