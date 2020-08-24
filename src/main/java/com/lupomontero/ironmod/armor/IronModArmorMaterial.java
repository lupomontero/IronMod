package com.lupomontero.ironmod.armor;

import com.lupomontero.ironmod.IronMod;
import com.lupomontero.ironmod.util.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum IronModArmorMaterial implements IArmorMaterial {

  MK1(
    IronMod.MOD_ID + ":mk1",
    33, // maxDamageFactor (diamond is 33, iron is 15...)
    new int[] { // damageReductionAmountArray
      2, // helmet
      5, // leggings
      6, // chestplate
      2  // boots
    },
    18, // enchantability (diamond is 10, gold is 22)
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, // // damageReductionAmountArray
    2.0f, // toughness (most items have 0, diamond has 2.0f)
    () -> {
      return Ingredient.fromItems(RegistryHandler.ARC_REACTOR.get());
    }
  ),
  MK2(
    IronMod.MOD_ID + ":mk2",
    33, // maxDamageFactor (diamond is 33, iron is 15...)
    new int[] { // damageReductionAmountArray
      2, // helmet
      5, // leggings
      6, // chestplate
      2  // boots
    },
    18, // enchantability (diamond is 10, gold is 22)
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, // // damageReductionAmountArray
    2.0f, // toughness (most items have 0, diamond has 2.0f)
    () -> {
      return Ingredient.fromItems(RegistryHandler.ARC_REACTOR.get());
    }
  ),
  MK3(
    IronMod.MOD_ID + ":mk3",
    33, // maxDamageFactor (diamond is 33, iron is 15...)
    new int[] { // damageReductionAmountArray
      2, // helmet
      5, // leggings
      6, // chestplate
      2  // boots
    },
    18, // enchantability (diamond is 10, gold is 22)
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, // // damageReductionAmountArray
    2.0f, // toughness (most items have 0, diamond has 2.0f)
    () -> {
      return Ingredient.fromItems(RegistryHandler.ARC_REACTOR.get());
    }
  ),
  MK4(
    IronMod.MOD_ID + ":mk4",
    33, // maxDamageFactor (diamond is 33, iron is 15...)
    new int[] { // damageReductionAmountArray
      2, // helmet
      5, // leggings
      6, // chestplate
      2  // boots
    },
    18, // enchantability (diamond is 10, gold is 22)
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, // // damageReductionAmountArray
    2.0f, // toughness (most items have 0, diamond has 2.0f)
    () -> {
      return Ingredient.fromItems(RegistryHandler.ARC_REACTOR.get());
    }
  );

  private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
  private final String name;
  private final int maxDamageFactor;
  private final int[] damageReductionAmountArray;
  private final int enchantability;
  private final SoundEvent soundEvent;
  private final float toughness;
  private final Supplier<Ingredient> repairMaterial;

  IronModArmorMaterial(
    String name,
    int maxDamageFactor,
    int[] damageReductionAmountArray,
    int enchantability,
    SoundEvent soundEvent,
    float toughness,
    Supplier<Ingredient> repairMaterial
  ) {
    this.name = name;
    this.maxDamageFactor = maxDamageFactor;
    this.damageReductionAmountArray = damageReductionAmountArray;
    this.enchantability = enchantability;
    this.soundEvent = soundEvent;
    this.toughness = toughness;
    this.repairMaterial = repairMaterial;
  }

  @Override
  public int getDamageReductionAmount(EquipmentSlotType slotIn) {
    return this.damageReductionAmountArray[slotIn.getIndex()];
  }

  @Override
  public int getDurability(EquipmentSlotType slotIn) {
    return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @OnlyIn(Dist.CLIENT)
  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return this.repairMaterial.get();
  }

  @Override
  public SoundEvent getSoundEvent() {
    return this.soundEvent;
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }
}