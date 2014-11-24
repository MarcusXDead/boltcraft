package com.boltcraft.basic;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BoltTable extends BlockContainer  {

	public BoltTable(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.875F, 1F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 1);
		
		this.setCreativeTab(Boltcraft.bolttab);
	}
	
	public int getRenderType() {
		return -2700;
	}

	public boolean isOpaqueCube() {
		return false;
		
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBoltTable();
	}

}
