package com.cabiccraft.core.itemgroup;

import com.cabiccraft.core.init.BlockInit;
import com.cabiccraft.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class MainItemGroup extends ItemGroup {

    public static final MainItemGroup instance = new MainItemGroup(ItemGroup.GROUPS.length, "cabiccraft");

    private MainItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.COPPER_INGOT.get());
    }

    /** @Override
    public ResourceLocation getBackgroundImage() {
        return new net.minecraft.util.ResourceLocation("textures/gui/container/creative_inventory/tab_" + this.getBackgroundImageName());
    }

    @Override
    public String getBackgroundImageName() {
        return "mainitemgroup";
    } */
}
