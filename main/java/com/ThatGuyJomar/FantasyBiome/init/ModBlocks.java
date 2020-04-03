package com.ThatGuyJomar.FantasyBiome.init;

import java.util.ArrayList;
import java.util.List;

import com.ThatGuyJomar.FantasyBiome.blocks.BlockBase;
import com.ThatGuyJomar.FantasyBiome.blocks.SapphireBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON);
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON); 
}
