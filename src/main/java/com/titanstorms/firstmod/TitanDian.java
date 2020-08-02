package com.titanstorms.firstmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TitanDian  extends Block {

	public TitanDian(Material material) {
		super(material);
		this.setBlockName("titandian").setBlockTextureName("ts:titandian").setLightLevel(1F).setStepSound(soundTypeSand).setResistance(4000F).setHarvestLevel("shovel", 3);;
	
	}

}
