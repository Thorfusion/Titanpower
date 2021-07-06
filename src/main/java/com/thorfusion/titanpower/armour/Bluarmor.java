package com.thorfusion.titanpower.armour;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Bluarmor extends ItemArmor {
    public Bluarmor(ArmorMaterial armorMaterial, int renderIndex, int armourType) {
        super(armorMaterial, renderIndex, armourType);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        if(this.armorType == 2){
            return "thorfusion:textures/models/armor/blu2.png";
        }
        return "thorfusion:textures/models/armor/blu1.png";
    }
}
