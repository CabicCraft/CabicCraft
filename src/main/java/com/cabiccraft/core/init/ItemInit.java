package com.cabiccraft.core.init;

import com.cabiccraft.core.CabicCraft;
import com.cabiccraft.core.itemgroup.MainItemGroup;
import com.cabiccraft.core.tier.ModArmorMaterial;
import com.cabiccraft.core.tier.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , CabicCraft.MOD_ID);
    /** Item Registry List **/
    //Copper//
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().group(MainItemGroup.instance)));
    //Tools
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModItemTier.COPPER, 3, -2.4f, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModItemTier.COPPER, 1.5f, -3f, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModItemTier.COPPER, 1, -2.8f, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModItemTier.COPPER, 6.5f, -3.2f, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModItemTier.COPPER, -1, -2f, (
                    new Item.Properties().group(MainItemGroup.instance))));
    //Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, (
                    new Item.Properties().group(MainItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, (
                    new Item.Properties().group(MainItemGroup.instance))));

    /** BlockItem Registry List **/
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block",
            () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore",
            () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(MainItemGroup.instance)));
}
