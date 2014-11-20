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


public class ClientProxy extends CommonProxy { 
	
public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void registerRenderers(){
		
		ModelboltArmorSample boltIronArmor = new ModelboltArmorSample(1F);
		ModelboltArmorSample boltIronLegs = new ModelboltArmorSample(0.5F);
		
		armorModels.put(Boltcraft.boltIron_Helmet, boltIronArmor);
		armorModels.put(Boltcraft.boltIron_Chest, boltIronArmor);
		armorModels.put(Boltcraft.boltIron_Legs, boltIronLegs);
		armorModels.put(Boltcraft.boltIron_Boots, boltIronArmor);
	}
}