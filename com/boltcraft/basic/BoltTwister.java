package com.boltcraft.basic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BoltTwister extends Block implements ITileEntityProvider {
	
	public static String name = "bolttwister";
	private String privateName = "bolttwister";

	public BoltTwister() {
		super(Material.rock);
		setBlockName(name);
        setCreativeTab(Boltcraft.bolttab);
        GameRegistry.registerBlock(this, name);

	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBolttwister();
	}
	 @Override
	    public boolean hasTileEntity(int metadata) {
	 
	        return true;
	    }
	

}
