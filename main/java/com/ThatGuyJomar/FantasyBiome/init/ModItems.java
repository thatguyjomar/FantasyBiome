package com.ThatGuyJomar.FantasyBiome.init;

import java.util.ArrayList;
import java.util.List;

import com.ThatGuyJomar.FantasyBiome.items.ItemBase;
import com.ThatGuyJomar.FantasyBiome.items.tools.ToolAxe;
import com.ThatGuyJomar.FantasyBiome.items.tools.ToolHoe;
import com.ThatGuyJomar.FantasyBiome.items.tools.ToolPickaxe;
import com.ThatGuyJomar.FantasyBiome.items.tools.ToolSpade;
import com.ThatGuyJomar.FantasyBiome.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	
	//Materials
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 2, 500, 9.0F, 3.5F, 11);
	
	//Tools
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
}
