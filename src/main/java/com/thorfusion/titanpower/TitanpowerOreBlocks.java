package com.thorfusion.titanpower;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Bluradien extends Block {

	public Bluradien(Material material) {
		super(material);
		this.setBlockName("bluore").setBlockTextureName("titanpower:bluore").setStepSound(Block.soundTypeGlass)
		.setLightLevel(0.1F).setResistance(100F).setHarvestLevel("pickaxe", 3);
	}
	@Override
	public Item getItemDropped(int metadata,Random rand, int fortune) {
		
		return Titanpower.bluradienstick;
	}
}
