package com.boltcraft.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import com.boltcraft.basic.References;
import com.boltcraft.basic.Boltcraft;
import com.boltcraft.basic.BoltArmorNew;
import com.boltcraft.basic.ModelboltArmorSample;

import net.minecraft.item.Item;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.boltcraft.basic.BoltChestItemRenderer;
import com.boltcraft.basic.BoltChestRenderer;
import com.boltcraft.basic.TileEntityBoltChest;

import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy { 
	
public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
		//added with 1.7.2 Tutorial, probably wrong
		
		public void registerTileEntitySpecialRenderer() {
			
		}
		//added with 1.7.2 Tutorial, probably wrong

	public static void registerRenderers(){
		
		//BoltTable
		
		TileEntitySpecialRenderer render = new BoltTableRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBoltTable.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Boltcraft.BoltTable), new BoltTableItemRenderer(render, new TileEntityBoltTable()));

	
		
		
		
		ModelboltArmorSample boltIronArmor = new ModelboltArmorSample(1F);
		ModelboltArmorSample boltIronLegs = new ModelboltArmorSample(0.5F);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBoltChest.class, new BoltChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Boltcraft.BoltChest), new BoltChestItemRenderer());
		
		
		armorModels.put(Boltcraft.boltIron_Helmet, boltIronArmor);
		armorModels.put(Boltcraft.boltIron_Chest, boltIronArmor);
		armorModels.put(Boltcraft.boltIron_Legs, boltIronLegs);
		armorModels.put(Boltcraft.boltIron_Boots, boltIronArmor);
	}
}

