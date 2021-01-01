package com.thorfusion.titanpower;

import com.thorfusion.titanpower.gen.BluradienEndGen;
import com.thorfusion.titanpower.gen.BluradienNetherGen;
import cpw.mods.fml.common.registry.GameRegistry;
import com.thorfusion.titanpower.gen.BluradienGen;

public class TitanpowerOreGen {
	public static void register() {
		if(TitanpowerConfig.Blueradiengeneration) {
			GameRegistry.registerWorldGenerator(new BluradienGen(), 0);
		}
		if(TitanpowerConfig.Blueradiengenerationnether) {
			GameRegistry.registerWorldGenerator(new BluradienNetherGen(), 0);
		}
		if(TitanpowerConfig.Blueradiengenerationend) {
			GameRegistry.registerWorldGenerator(new BluradienEndGen(), 0);
		}
	}
}
