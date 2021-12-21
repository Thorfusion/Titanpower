package com.thorfusion.titanpower;


import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import com.jadarstudios.developercapes.DevCapes;


@Mod(modid = Titanpower.MODID, name = Titanpower.NAME, version = Titanpower.VERSION)

public class Titanpower{
    public static final String NAME = "Titanpower";
    public static final String MODID = "thorfusion";
    public static final String VERSION = "1.6.3";

    public static boolean isMekanismLoaded;

    //Adds creative tab
    public static CreativeTabs tabTitanpower = new CreativeTabs("tabTitanpower") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(TitanpowerItems.TerralizationCreative).getItem();
        }
    };

    @Mod.Instance
    public static Titanpower instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        isMekanismLoaded = Loader.isModLoaded("Mekanism");
        TitanpowerConfig.init();
        TitanpowerBlocks.init();
        TitanpowerOreBlocks.init();
        TitanpowerOreBlocks.register();
        TitanpowerTools.init();
        TitanpowerItems.init();
        TitanpowerItems.register();
        TitanpowerRecipes.init();
        TitanpowerArmour.init();
        TitanpowerArmour.register();
        if(!isMekanismLoaded) {
            TitanpowerVanillaRecipes.init();
        }
        if(isMekanismLoaded) {
            TitanpowerMekanismRecipes.init();
            System.out.println("Lets bring this together mekanism");
        }
        if(TitanpowerConfig.Titanpoweroregeneration) {
            try {
                GameRegistry.registerWorldGenerator(new TitanpowerOreGen(), 0);
            }
            catch (Exception e)
            {
                System.out.print("World Generation Error\n"+e);
            }
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(TitanpowerConfig.EnableCapes) {
            //proxy, tilentity
            if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
                try {
                    DevCapes.getInstance().registerConfig("https://raw.githubusercontent.com/maggi373/files/main/capes/cape.json");
                } catch (Exception e)
                {
                    System.out.print("Failed to load capes\n"+e);
                }
            }
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(isMekanismLoaded) {
            TitanpowerMekanismRecipes.postinit();
        }

    }
}
