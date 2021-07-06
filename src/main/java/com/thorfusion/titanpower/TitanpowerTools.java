package com.thorfusion.titanpower;

import com.thorfusion.titanpower.tool.Terralization;
import com.thorfusion.titanpower.tool.bluaxe;
import com.thorfusion.titanpower.tool.blushovel;
import net.minecraft.item.Item;

public class TitanpowerTools {
      public static Item PickaxeTerralization;
      public static Item BluAxe;
      public static Item BluShovel;

      public static void init() {
            PickaxeTerralization = new Terralization();
            BluAxe = new bluaxe();
            BluShovel = new blushovel();
      }
}




