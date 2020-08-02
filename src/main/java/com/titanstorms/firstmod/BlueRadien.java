package com.titanstorms.firstmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlueRadien extends Block {

	public BlueRadien(Material material) {
		super(material);
		this.setBlockName("blueradien").setBlockTextureName("ts:blueore").setStepSound(Block.soundTypeGlass)
		.setLightLevel(0.4F).setResistance(100F).setHarvestLevel("pickaxe", 3);;
	}
	@Override
	public Item getItemDropped(int metadata,Random rand, int fortune) {
		
		return Firstmod.blueradienstick;
	}
}
