package com.boltcraft.basic;

import java.util.HashMap;
import java.util.Map;
import com.boltcraft.basic.Boltcraft;
import com.boltcraft.basic.BoltArmorNew;
import net.minecraft.item.Item;
import net.minecraft.client.model.ModelBiped;


public class ClientProxy extends CommonProxy { 
	
public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
		ModelboltArmorSample custom_armor = new ModelboltArmorSample(1F);
		ModelboltArmorSample custom_legs = new ModelboltArmorSample(0.5F);
		
		armorModels.put(Boltcraft.boltIronHelmet, custom_armor);
		armorModels.put(Boltcraft.boltIronChest, custom_armor);
		armorModels.put(Boltcraft.boltIronLegs, custom_legs);
		armorModels.put(Boltcraft.boltIronBoots, custom_armor);
	}
}
	
	
	

