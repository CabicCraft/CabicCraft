package com.cabiccraft.core.itemgroup;

import com.cabiccraft.core.init.BlockInit;

import com.cabiccraft.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

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
}
