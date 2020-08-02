package com.titanstorms.firstmod;


import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
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
            this.setUnlocalizedName("PickaxeTerra").setTextureName("ts:itemtable");
      }

      //this code underneath crashes the terralization server
      /*
      public boolean hitEntity(ItemStack par1ItemStack,
                               EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
      {
            int tall = rand.nextInt(75);
            par1ItemStack.damageItem(0, par3EntityLiving);
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.heal.id, 20000, 1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20000,
                                             1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
                                             20000, 1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,
                                             20000, 1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.nightVision.id, 20000,
                                             1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.resistance.id, 20000,
                                             1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.invisibility.id, 20000,
                                             1));
            par3EntityLiving.addPotionEffect(new PotionEffect(Potion.jump.id, 20000, 1));
            par3EntityLiving.getEntityAttribute(
                  SharedMonsterAttributes.maxHealth).setBaseValue(200);
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.blindness.id, 2000,
                                             1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.hunger.id, 2000, 1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.harm.id, 2000, 1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.weakness.id, 2000, 1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2000,
                                             1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.wither.id, 2000, 1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, 2000, 1));
            par2EntityLiving.setFire(100);
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2000,
                                             1));
            par2EntityLiving.addPotionEffect(new PotionEffect(Potion.confusion.id, 2000,
                                             1));
            */
            /*
            //m� ikke c�re med i server verisjon
            if(Minecraft.getMinecraft().thePlayer.getDisplayName()=="maggi373") {
                  MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("The pickaxe is at its rightfull owner"));
            }
            else {
            if(tall==25) {
            MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("Hey "+Minecraft.getMinecraft().thePlayer.getDisplayName()+", maggi373 called. He wants his pickaxe back!"));
            }
            if(tall==50) {
                  MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("When diamonds and machines isn't enough"));
                  }
            if(tall==75) {
                  MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("Watch out " + Minecraft.getMinecraft().thePlayer.getDisplayName() + " got maggi373's pickaxe"));
                  }

            }
            */
            return true;
      }
}
