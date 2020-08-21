package com.cabiccraft.core.itemgroup;

import com.cabiccraft.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EquipmentItemGroup extends ItemGroup {

    public static final EquipmentItemGroup instance = new EquipmentItemGroup(ItemGroup.GROUPS.length, "cabiccraft_equipment");

    private EquipmentItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.SILVER_SWORD.get());
    }

    /** @Override
    public ResourceLocation getBackgroundImage() {
        return new net.minecraft.util.ResourceLocation("textures/gui/container/creative_inventory/tab_" + this.getBackgroundImageName());
    }

    @Override
    public String getBackgroundImageName() {
        return "equipmentitemgroup";
    } */
}
