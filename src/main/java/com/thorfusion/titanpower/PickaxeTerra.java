package com.thorfusion.titanpower;


import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class PickaxeTerra extends ItemPickaxe
{


      private Random rand = new Random();

      public PickaxeTerra(ToolMaterial material)
      {
            super(material);
            this.setUnlocalizedName("PickaxeTerra").setTextureName("titanpower:itemtable");
      }
}
