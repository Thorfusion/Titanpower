package com.thorfusion.titanpower;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class TitanpowerTools
{
      public static Item PickaxeTerralization;

      public static void init()
      {
            PickaxeTerralization = new Terralization();
      }

      public class Terralization  extends ItemPickaxe

      {
            private static final String name = "Terralization";
            public Terralization() {
                  super(ToolMaterial.EMERALD);
                  GameRegistry.registerItem(this, name);
                  setCreativeTab(Titanpower.tabTitanpower);
                  setTextureName(Titanpower.MODID + ":" + name);
                  EnumHelper.addToolMaterial(name, 99999999, 99999, 146039.0F, 130.0F, 99);
            }
      }
}




