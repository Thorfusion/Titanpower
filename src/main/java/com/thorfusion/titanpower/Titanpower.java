package com.thorfusion.titanpower;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import com.jadarstudios.developercapes.DevCapes;

@Mod(modid = Titanpower.MODID, name = Titanpower.NAME, version = Titanpower.VERSION)

public class Titanpower
{
    public static final String NAME = "Titanpower";
    public static final String MODID = "titanpower";
    public static final String VERSION = "1.5.1";


    protected static Item bluradienstick;
    protected static Item pickaxeterra;

    protected static Block bluradien;
    //HarvestLevel, maxuses,efficecy,damage, enchance
    private Item.ToolMaterial terralization =
            EnumHelper.addToolMaterial("terralization", 99999999, 99999, 146039.0F, 130.0F,
                                       99);

	@Mod.Instance
    public static Titanpower instance;

	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Adds creative tab
        public static CreativeTabs tabTitanpower = new CreativeTabs("tabTitanpower")
        {
            @Override
            public Item getTabIconItem()
            {
                return new ItemStack(bluradienstick).getItem();
            }
        };
        TitanpowerBlocks.init();
        TitanpowerOreBlocks.init();
        TitanpowerTools.init();
        TitanpowerItems.init();
        TitanpowerOreGen.init();
        TitanpowerRecipes.init();
        try
        {
                  //lager objekter
                  bluradienstick = new Bluradienstick(Material.dragonEgg).setCreativeTab(
                        tabTitanpower);
                  bluradien = new Bluradien(Material.rock).setCreativeTab(tabTitanpower);
                  pickaxeterra = new PickaxeTerra(terralization).setCreativeTab(tabTitanpower);

                  GameRegistry.registerItem(pickaxeterra,
                                            pickaxeterra.getUnlocalizedName().substring(5));
                  GameRegistry.registerItem(bluradienstick,
                                            bluradienstick.getUnlocalizedName().substring(5));

                  GameRegistry.registerBlock(bluradien,
                                             bluradien.getUnlocalizedName().substring(5));

                  GameRegistry.addRecipe(new ItemStack(pickaxeterra), new Object[] {"ttt",
                                         " d ",
                                         " d ", 't', titandia, 'd', bluradienstick
                                                                                   });
                  System.out.println(titandia.getUnlocalizedName().substring(5));
                  System.out.println("Yo!");
                  GameRegistry.registerWorldGenerator(new BluradienGen(), 0);
        }
        catch (Exception e)
        {
            System.out.println("Somehing went wrong registering items");
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //proxy, tilentity
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
            DevCapes.getInstance().registerConfig("https://technic-solder.eu-central-1.linodeobjects.com/cape.json");
        }
    }

    @EventHandler
      public void postInit(FMLPostInitializationEvent event)
      {

      }

}
