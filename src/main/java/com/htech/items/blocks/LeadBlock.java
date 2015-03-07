package com.htech.items.blocks;

import com.htech.lib.RefStrings;
import com.htech.main.HTBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LeadBlock extends Block {
	
	private final String name = "leadblock";
	public LeadBlock(){
		super(Material.iron);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(RefStrings.MODID + "_" + name);
		setCreativeTab(HTBase.tabHtech);
	}
	
	public String getName(){
		return name;
	}
}