package com.thorfusion.titanpower;

import java.util.Random;

import com.thorfusion.titanpower.ore.Bluradien;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class TitanpowerOreBlocks {
	public static Block bluradien;

	public static void init() {
		bluradien = new Bluradien();
	}

	public static void register() {

	}
}






