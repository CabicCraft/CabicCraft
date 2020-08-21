package com.cabiccraft.core.objects.items;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CoalNugget extends Item {
    public CoalNugget(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 200;
    }

    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = world.getBlockState(blockpos);
        boolean flag = false;
        if (CampfireBlock.func_241470_h_(blockstate)) {
            this.playUseSound(world, blockpos);
            world.setBlockState(blockpos, blockstate.with(CampfireBlock.LIT, Boolean.valueOf(true)));
            flag = true;
        } else {
            blockpos = blockpos.offset(context.getFace());
            if (AbstractFireBlock.func_241465_a_(world, blockpos, context.getPlacementHorizontalFacing())) {
                this.playUseSound(world, blockpos);
                world.setBlockState(blockpos, AbstractFireBlock.func_235326_a_(world, blockpos));
                flag = true;
            }
        }
        if (flag) {
            context.getItem().shrink(1);
            return ActionResultType.func_233537_a_(world.isRemote);
        } else {
            return ActionResultType.FAIL;
        }
    }
    private void playUseSound(World worldIn, BlockPos pos) {
        worldIn.playSound((PlayerEntity)null, pos, SoundEvents.ENTITY_PLAYER_HURT_ON_FIRE, SoundCategory.BLOCKS, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
    }
}
