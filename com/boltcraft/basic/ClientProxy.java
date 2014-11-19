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
		
		ModelboltArmorSample boltIronArmor = new ModelboltArmorSample(1F);
		ModelboltArmorSample boltIronLegs = new ModelboltArmorSample(0.5F);
		
		armorModels.put(Boltcraft.boltIronHelmet, boltIronArmor);
		armorModels.put(Boltcraft.boltIronChest, boltIronArmor);
		armorModels.put(Boltcraft.boltIronLegs, boltIronLegs);
		armorModels.put(Boltcraft.boltIronBoots, boltIronArmor);
	}
}
	
	
	

