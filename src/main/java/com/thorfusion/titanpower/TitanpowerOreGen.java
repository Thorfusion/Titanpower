package com.thorfusion.titanpower;

import cpw.mods.fml.common.registry.GameRegistry;
import com.thorfusion.titanpower.gen.BluradienGen;

public class TitanpowerOreGen {
	public static void register() {
		if(TitanpowerConfig.Blueradiengeneration) {
			GameRegistry.registerWorldGenerator(new BluradienGen(), 0);
		}
	}
}
