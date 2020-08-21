package com.cabiccraft.core.itemgroup;

import com.cabiccraft.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BlockItemGroup extends ItemGroup {

    public static final BlockItemGroup instance = new BlockItemGroup(ItemGroup.GROUPS.length, "cabiccraft_blocks");

    private BlockItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.COPPER_BLOCK.get());
    }

    /** @Override
    public ResourceLocation getBackgroundImage() {
        return new net.minecraft.util.ResourceLocation("textures/gui/container/creative_inventory/tab_" + this.getBackgroundImageName());
    }

    @Override
    public String getBackgroundImageName() {
        return "blockitemgroup";
    } */
}
