package com.ThatGuyJomar.FantasyBiome.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SapphireBlock extends BlockBase{

	public SapphireBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL); //sound made when you are walking over the block
		setHardness(5.0F); //sets how fast you can break the block
		setResistance(15.0F); //sets how resistant the block is to explosions
		setHarvestLevel("pickaxe", 2); //first param, type of tool; second param, level of pickaxe (0 Wood, 1 Stone/Gold, 2 Iron, 3 Diamond)
		//setLightLevel(0); //how much light the block emits
		//setLightOpacity(0); //how easy it is for light to pass through the block
		//setBlockUnbreakable() //sets block to unbreakable (only bedrock) 
	}
	
}
