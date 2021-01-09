package com.thorfusion.thorfusion;

import com.thorfusion.thorfusion.tool.Terralization;
import com.thorfusion.thorfusion.tool.bluaxe;
import com.thorfusion.thorfusion.tool.blushovel;
import net.minecraft.item.Item;

public class ThorfusionTools {
      public static Item PickaxeTerralization;
      public static Item BluAxe;
      public static Item BluShovel;

      public static void init() {
            if(ThorfusionConfig.EnableTerralization){
                  PickaxeTerralization = new Terralization();
            }
            if(ThorfusionConfig.EnableBluAxe){
                  BluAxe = new bluaxe();
            }
            if(ThorfusionConfig.EnableBluShovel){
                  BluShovel = new blushovel();
            }
      }
}




