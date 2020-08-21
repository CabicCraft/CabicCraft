package com.cabiccraft.core.init;

import com.cabiccraft.core.CabicCraft;
import com.cabiccraft.core.itemgroup.BlockItemGroup;
import com.cabiccraft.core.itemgroup.EquipmentItemGroup;
import com.cabiccraft.core.itemgroup.MainItemGroup;
import com.cabiccraft.core.objects.items.CoalNugget;
import com.cabiccraft.core.objects.items.SilverShieldItem;
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
    /*** Register Items ***/
    /*** Register Items ***/
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod",
            () -> new Item(new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).group(MainItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).group(MainItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).group(MainItemGroup.instance)));
    public static final RegistryObject<Item> REDSTONE_LEATHER = ITEMS.register("redstone_leather",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).group(MainItemGroup.instance)));
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget",
            () -> new CoalNugget(new Item.Properties().group(MainItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_ROD_BINDED = ITEMS.register("silver_rod_binded",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).group(MainItemGroup.instance)));
    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder",
            () -> new Item(new Item.Properties()));
    /*** Register Equipment Items ***/
    /*** Register Equipment Items ***/
    //COPPER//
    //Tools
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModItemTier.COPPER, 3, -2.4f, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModItemTier.COPPER, 1.5f, -3f, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModItemTier.COPPER, 1, -2.8f, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModItemTier.COPPER, 6.5f, -3.2f, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModItemTier.COPPERHOE, -1, -1.5f, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    //Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, (
                    new Item.Properties().group(EquipmentItemGroup.instance))));
    //SILVER//
    //Tools
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModItemTier.SILVER, 3, -2.4f, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModItemTier.SILVER, 1.5f, -3f, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModItemTier.SILVER, 1, -2.8f, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModItemTier.SILVER, 5.5f, -3.2f, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModItemTier.SILVERHOE, -1, -0.5f, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    //Armor
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET, (
                    new Item.Properties().rarity(Rarity.UNCOMMON).group(EquipmentItemGroup.instance))));
    //OTHER//
    public static final RegistryObject<Item> SILVER_SHIELD = ITEMS.register("silver_shield",
            () -> new SilverShieldItem(new Item.Properties().rarity(Rarity.UNCOMMON).maxStackSize(1).group(EquipmentItemGroup.instance)));
    /*** Register BlockItems ***/
    /*** Register BlockItems ***/
    public static final RegistryObject<Item> COPPER_BLOCK = ITEMS.register("copper_block",
            () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().group(BlockItemGroup.instance)));
    public static final RegistryObject<Item> COPPER_ORE = ITEMS.register("copper_ore",
            () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(BlockItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block",
            () -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().rarity(Rarity.UNCOMMON).group(BlockItemGroup.instance)));
    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore",
            () -> new BlockItem(BlockInit.SILVER_ORE.get(), new Item.Properties().rarity(Rarity.UNCOMMON).group(BlockItemGroup.instance)));

}
