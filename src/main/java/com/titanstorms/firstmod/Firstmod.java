package com.titanstorms.firstmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="ts", name="Titanstorms", version="1.1")
public class Firstmod {

	protected static Item blueradienstick;
	protected static Item pickaxeterra;
	protected static Block titandian; 
	protected static Block blueradien; 
																					//HarvestLevel, maxuses,efficecy,damage, enchance
	private Item.ToolMaterial terralization = EnumHelper.addToolMaterial("terralization", 99999999, 99999, 146039.0F, 130.0F, 99);
	
	@EventHandler
	public void forst(FMLPreInitializationEvent event) {
//lager objekter
		blueradienstick= new BlueRadienstick(Material.dragonEgg);
		blueradien=new BlueRadien(Material.rock);
		pickaxeterra= new PickaxeTerra(terralization);
		
		
		titandian = new TitanDian(Material.dragonEgg);
		
		
		GameRegistry.registerItem(pickaxeterra,pickaxeterra.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blueradienstick,blueradienstick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(titandian, titandian.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blueradien, blueradien.getUnlocalizedName().substring(5));
		GameRegistry.addRecipe(new ItemStack(titandian), new Object[] {"ooo",
																	   "oao",
																	   "ooo" ,'o',Blocks.obsidian,'a',Blocks.anvil});
		GameRegistry.addRecipe(new ItemStack(pickaxeterra), new Object[] {"ttt",
																	      " d ",
																	      " d " ,'t',titandian,'d',blueradienstick});
		System.out.println(titandian.getUnlocalizedName().substring(5));
		System.out.println("Yo!");
		GameRegistry.registerWorldGenerator(new BlueradienGen(), 0);
		
		
	}
	@EventHandler
	public void klar(FMLInitializationEvent event) {
		//proxy, tilentity
		
	}
	@EventHandler
	public void etter(FMLPostInitializationEvent event) {
		
	}
	@EventHandler
	public void serverl(FMLServerStartingEvent event) {
		event.registerServerCommand(new Komando());
		event.registerServerCommand(new Getcoord());
	}
}