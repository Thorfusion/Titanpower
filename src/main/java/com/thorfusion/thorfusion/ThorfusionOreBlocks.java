package com.thorfusion.thorfusion;


import com.thorfusion.thorfusion.ore.Bluradien;
import com.thorfusion.thorfusion.ore.Bluradiennether;
import com.thorfusion.thorfusion.ore.Bluradienend;
import net.minecraft.block.Block;

public class ThorfusionOreBlocks {
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






