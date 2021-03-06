package com.thorfusion.titanpower;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import com.jadarstudios.developercapes.DevCapes;

@Mod(modid = Titanpower.MODID, name = Titanpower.NAME, version = Titanpower.VERSION)

public class Titanpower {
    public static final String NAME = "Titanpower";
    public static final String MODID = "thorfusion";
    public static final String VERSION = "1.5.1";

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
        TitanpowerConfig.init();
        TitanpowerBlocks.init();
        TitanpowerOreBlocks.init();
        TitanpowerOreBlocks.register();
        TitanpowerTools.init();
        TitanpowerItems.init();
        TitanpowerItems.register();
        TitanpowerRecipes.init();
        if(TitanpowerConfig.Titanpoweroregeneration) {
            TitanpowerOreGen.register();
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(TitanpowerConfig.EnableCapes) {
            //proxy, tilentity
            if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
                DevCapes.getInstance().registerConfig("https://technic-solder.eu-central-1.linodeobjects.com/cape.json");
            }
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
