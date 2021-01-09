package com.thorfusion.thorfusion;

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

@Mod(modid = Thorfusion.MODID, name = Thorfusion.NAME, version = Thorfusion.VERSION)

public class Thorfusion {
    public static final String NAME = "Titanpower";
    public static final String MODID = "thorfusion";
    public static final String VERSION = "1.5.1";

    //Adds creative tab
    public static CreativeTabs tabTitanpower = new CreativeTabs("tabTitanpower") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ThorfusionItems.TerralizationCreative).getItem();
        }
    };

    @Mod.Instance
    public static Thorfusion instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ThorfusionConfig.init();
        ThorfusionBlocks.init();
        ThorfusionOreBlocks.init();
        ThorfusionOreBlocks.register();
        ThorfusionTools.init();
        ThorfusionItems.init();
        ThorfusionItems.register();
        ThorfusionRecipes.init();
        if(ThorfusionConfig.Titanpoweroregeneration) {
            ThorfusionOreGen.register();
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if(ThorfusionConfig.EnableCapes) {
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
