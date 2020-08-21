package com.cabiccraft.core.objects.items;

import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

import javax.annotation.Nullable;

public class SilverShieldItem extends ShieldItem{
    public SilverShieldItem(Item.Properties builder) {
        super(builder);
        DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity) {
        return true;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 164000;
    }

}
