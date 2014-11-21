package com.boltcraft.basic;

import com.boltcraft.basic.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityBoltcraftBasic {

	public static void mainRegistry(){
		registerTileEntity();
	}

	private static void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityBoltChest.class, References.mod_id);
	}
	
}