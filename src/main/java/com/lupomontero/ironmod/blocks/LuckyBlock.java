package com.lupomontero.ironmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;

public class LuckyBlock extends Block {
  public LuckyBlock() {
    super(
      Block.Properties.create(Material.IRON)
        .hardnessAndResistance(1.0f, 1.0f)
        .sound(SoundType.METAL)
        .harvestLevel(0) // 0 => madera, 1 => piedra, 2 => hierro, 3 => diamante
        .harvestTool(ToolType.PICKAXE)
    );
  }
}