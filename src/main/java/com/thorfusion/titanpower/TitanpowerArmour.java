package com.thorfusion.titanpower;

import com.thorfusion.titanpower.armor.ArmorTM;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class TitanpowerArmour {
    public static Item Bluchest;
    public static Item Bluleggings;
    public static Item Bluboots;
    public static Item Bluhat;

    public static void init() {
        ItemArmor.ArmorMaterial Useless = EnumHelper.addArmorMaterial("useless", 0, new int[]{0, 0, 0, 0}, 0);

        Bluhat = new ArmorTM(Useless, 1, 0).setUnlocalizedName("Bluhat");
        Bluchest = new ArmorTM(Useless, 1, 1).setUnlocalizedName("Bluchest");
        Bluleggings = new ArmorTM(Useless, 1, 2).setUnlocalizedName("Bluleggings");
        Bluboots = new ArmorTM(Useless, 1, 3).setUnlocalizedName("Bluboots");


    }
        public static void register() {
            GameRegistry.registerItem(Bluhat, "Bluhat");
            GameRegistry.registerItem(Bluchest, "Bluchest");
            GameRegistry.registerItem(Bluleggings, "Bluleggings");
            GameRegistry.registerItem(Bluboots, "Bluboots");
    }
}
