package com.thorfusion.titanpower;

import com.thorfusion.titanpower.block.Titandia;
import net.minecraft.block.Block;


public class TitanpowerBlocks {
	public static Block titandia;
	public static Block blutorch;

	public static void init() {
		titandia = new Titandia();
	}
	public static void init() {
		blutorch = new Blutorch();
	}
}