package com.lupomontero.ironmod.util;

import com.lupomontero.ironmod.IronMod;
import com.lupomontero.ironmod.armor.IronModArmorMaterial;
import com.lupomontero.ironmod.blocks.LuckyBlock;
import com.lupomontero.ironmod.items.ArcReactor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
  public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, IronMod.MOD_ID);
  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, IronMod.MOD_ID);

  public static void init() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

  // Items
  public static final RegistryObject<Item> ARC_REACTOR = ITEMS.register("arc_reactor", ArcReactor::new);

  // Armor
  public static final RegistryObject<ArmorItem> IRONMAN_HELMET = ITEMS.register(
    "ironman_helmet",
    () -> new ArmorItem(
      IronModArmorMaterial.MK1,
      EquipmentSlotType.HEAD,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_CHESTPLATE = ITEMS.register(
    "ironman_chestplate",
    () -> new ArmorItem(
      IronModArmorMaterial.MK1,
      EquipmentSlotType.CHEST,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_LEGGINGS = ITEMS.register(
    "ironman_leggings",
    () -> new ArmorItem(
      IronModArmorMaterial.MK1,
      EquipmentSlotType.LEGS,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_BOOTS = ITEMS.register(
    "ironman_boots",
    () -> new ArmorItem(
      IronModArmorMaterial.MK1,
      EquipmentSlotType.FEET,
      new Item.Properties().group(IronMod.TAB)
    )
  );

  // MK2
  public static final RegistryObject<ArmorItem> IRONMAN_HELMET_MK2 = ITEMS.register(
    "ironman_helmet_mk2",
    () -> new ArmorItem(
      IronModArmorMaterial.MK2,
      EquipmentSlotType.HEAD,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_CHESTPLATE_MK2 = ITEMS.register(
    "ironman_chestplate_mk2",
    () -> new ArmorItem(
      IronModArmorMaterial.MK2,
      EquipmentSlotType.CHEST,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_LEGGINGS_MK2 = ITEMS.register(
    "ironman_leggings_mk2",
    () -> new ArmorItem(
      IronModArmorMaterial.MK2,
      EquipmentSlotType.LEGS,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_BOOTS_MK2 = ITEMS.register(
    "ironman_boots_mk2",
    () -> new ArmorItem(
      IronModArmorMaterial.MK2,
      EquipmentSlotType.FEET,
      new Item.Properties().group(IronMod.TAB)
    )
  );

  // MK3
  public static final RegistryObject<ArmorItem> IRONMAN_HELMET_MK3 = ITEMS.register(
    "ironman_helmet_mk3",
    () -> new ArmorItem(
      IronModArmorMaterial.MK3,
      EquipmentSlotType.HEAD,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_CHESTPLATE_MK3 = ITEMS.register(
    "ironman_chestplate_mk3",
    () -> new ArmorItem(
      IronModArmorMaterial.MK3,
      EquipmentSlotType.CHEST,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_LEGGINGS_MK3 = ITEMS.register(
    "ironman_leggings_mk3",
    () -> new ArmorItem(
      IronModArmorMaterial.MK3,
      EquipmentSlotType.LEGS,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_BOOTS_MK3 = ITEMS.register(
    "ironman_boots_mk3",
    () -> new ArmorItem(
      IronModArmorMaterial.MK3,
      EquipmentSlotType.FEET,
      new Item.Properties().group(IronMod.TAB)
    )
  );

  // MK4
  public static final RegistryObject<ArmorItem> IRONMAN_HELMET_MK4 = ITEMS.register(
    "ironman_helmet_mk4",
    () -> new ArmorItem(
      IronModArmorMaterial.MK4,
      EquipmentSlotType.HEAD,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_CHESTPLATE_MK4 = ITEMS.register(
    "ironman_chestplate_mk4",
    () -> new ArmorItem(
      IronModArmorMaterial.MK4,
      EquipmentSlotType.CHEST,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_LEGGINGS_MK4 = ITEMS.register(
    "ironman_leggings_mk4",
    () -> new ArmorItem(
      IronModArmorMaterial.MK4,
      EquipmentSlotType.LEGS,
      new Item.Properties().group(IronMod.TAB)
    )
  );
  public static final RegistryObject<ArmorItem> IRONMAN_BOOTS_MK4 = ITEMS.register(
    "ironman_boots_mk4",
    () -> new ArmorItem(
      IronModArmorMaterial.MK4,
      EquipmentSlotType.FEET,
      new Item.Properties().group(IronMod.TAB)
    )
  );

  // Blocks
  public static final RegistryObject<Block> LUCKY_BLOCK = BLOCKS.register(
    "lucky_block",
    LuckyBlock::new
  );

  // Block items
  public static final RegistryObject<Item> LUCKY_BLOCK_ITEM = ITEMS.register(
    "lucky_block",
    () -> new BlockItem(LUCKY_BLOCK.get(), new Item.Properties().group(IronMod.TAB))
  );
}