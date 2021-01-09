package com.thorfusion.thorfusion;

import com.thorfusion.thorfusion.gen.BluradienEndGen;
import com.thorfusion.thorfusion.gen.BluradienNetherGen;
import cpw.mods.fml.common.registry.GameRegistry;
import com.thorfusion.thorfusion.gen.BluradienGen;

public class ThorfusionOreGen {
	public static void register() {
		if(ThorfusionConfig.Blueradiengeneration) {
			GameRegistry.registerWorldGenerator(new BluradienGen(), 0);
		}
		if(ThorfusionConfig.Blueradiengenerationnether) {
			GameRegistry.registerWorldGenerator(new BluradienNetherGen(), 0);
		}
		if(ThorfusionConfig.Blueradiengenerationend) {
			GameRegistry.registerWorldGenerator(new BluradienEndGen(), 0);
		}
	}
}
