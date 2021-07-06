package com.thorfusion.titanpower.proxy;

import java.util.HashMap;
import java.util.Map;

import com.thorfusion.titanpower.TitanpowerArmour;
import com.thorfusion.titanpower.models.ModelCustomArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

public class ProxyClient extends ProxyCommon {
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
		ModelCustomArmor custom_armor = new ModelCustomArmor(1F);
		ModelCustomArmor custom_legs = new ModelCustomArmor(0.5F);
		
		armorModels.put(TitanpowerArmour.Bluhat, custom_armor);
		armorModels.put(TitanpowerArmour.Bluchest, custom_armor);
		armorModels.put(TitanpowerArmour.Bluleggings, custom_legs);
		armorModels.put(TitanpowerArmour.Bluboots, custom_armor);

	}

}
