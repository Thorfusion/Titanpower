package com.thorfusion.titanpower;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Titandia  extends Block {

	public Titandia(Material material) {
		super(material);
		this.setBlockName("titandia").setBlockTextureName("titanpower:titandia").setLightLevel(1F).setStepSound(soundTypeSand).setResistance(4000F).setHardness(0.1F).setHarvestLevel("shovel", 3);
	
	}

}
