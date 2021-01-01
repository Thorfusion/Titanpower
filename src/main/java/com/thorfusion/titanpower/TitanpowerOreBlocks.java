package com.thorfusion.titanpower;

import java.util.Random;

import com.thorfusion.titanpower.ore.Bluradien;
import com.thorfusion.titanpower.ore.Bluradiennether;
import com.thorfusion.titanpower.ore.Bluradienend;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class TitanpowerOreBlocks {
	public static Block bluradien;
	public static Block bluradiennether;
	public static Block bluradienend;

	public static void init() {
		bluradien = new Bluradien();
		bluradiennether = new Bluradiennether();
		bluradienend = new Bluradienend();
	}

	public static void register() {

	}
}






