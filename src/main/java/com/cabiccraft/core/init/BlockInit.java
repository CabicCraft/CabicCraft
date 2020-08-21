package com.cabiccraft.core.init;

import com.cabiccraft.core.CabicCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS , CabicCraft.MOD_ID);
    /** Copper Blocks **/
    //Block
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",
            () -> (new Block(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.METAL)
                    .hardnessAndResistance(4f, 6f).harvestTool(ToolType.PICKAXE))));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",
            () -> (new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE))));
    /** Silver Blocks **/
    //Block
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
            () -> (new Block(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA).sound(SoundType.METAL)
                    .hardnessAndResistance(4f, 6f).harvestTool(ToolType.PICKAXE))));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",
            () -> (new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)
                    .hardnessAndResistance(3f, 3f).harvestTool(ToolType.PICKAXE))));
}
