package com.boltcraft.basic;

import java.util.HashMap;
import java.util.Map;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
		ModelboltArmorSample custom_armor = new ModelboltArmorSample(1F);
		ModelboltArmorSample custom_legs = new ModelboltArmorSample(0.5F);
		
		armorModels.put(Boltcraft.BoltironHelmet, custom_armor);
		armorModels.put(Boltcraft.BoltironChest, custom_armor);
		armorModels.put(Boltcraft.BoltironLegs, custom_legs);
		armorModels.put(Boltcraft.BoltironBoots, custom_armor);

	}

}

//package tutorial;
	//import net.minecraft.client.model.ModelBiped;
	//public class ClientProxy extends CommonProxy {
	//private static final tutarm tutChest = new tutarm(1.0f);
	//private static final tutarm tutLegs = new tutarm(0.5f);
	//@Override public ModelBiped getArmorModel(int id){ switch (id) { case 0: return tutChest; case 1: return tutLegs; default: break; } 
	//return tutChest; 
	//default, if whenever you should have passed on a wrong id } }



