package com.thorfusion.titanpower;

import com.thorfusion.titanpower.proxy.ProxyClient;
import com.thorfusion.titanpower.proxy.ProxyCommon;
import com.thorfusion.titanpower.resources.References;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
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
    public static final String VERSION = "1.6.0";

    @SidedProxy(clientSide= References.proxy_client, serverSide=References.proxy_common)
    public static ProxyCommon proxy_common;
    public static ProxyClient proxy_client;

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
        if(!isMekanismLoaded) {
            TitanpowerVanillaRecipes.init();
        }
        if(isMekanismLoaded) {
            TitanpowerMekanismRecipes.init();
        }
        if(TitanpowerConfig.Titanpoweroregeneration) {
            try {
                TitanpowerOreGen.register();
            }
            catch (Exception e)
            {
                System.out.println("World Generation Error");
            }
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
        if(isMekanismLoaded) {
            TitanpowerMekanismRecipes.postinit();
        }

    }
}
