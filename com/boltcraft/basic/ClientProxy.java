package com.boltcraft.basic;

import net.minecraft.client.model.ModelBiped;
import java.util.HashMap;
import java.util.Map;
import com.boltcraft.basic.Boltcraft;
import com.boltcraft.basic.BoltArmor;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy { 
	
public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
		ModelCustomArmor custom_armor = new ModelCustomArmor(1F);
		ModelCustomArmor custom_legs = new ModelCustomArmor(0.5F);
		
		armorModels.put(TutorialMod.custom_helm, custom_armor);
		armorModels.put(TutorialMod.custom_chest, custom_armor);
		armorModels.put(TutorialMod.custom_legs, custom_legs);
		armorModels.put(Boltcraft.custom_boots, custom_armor);
	
	private static final ModelboltArmorSample BoltironChest = new ModelboltArmorSample(1.0f);
	private static final ModelboltArmorSample BoltironLegs = new ModelboltArmorSample(0.5f);
	@Override 
	public ModelBiped getArmorModel(int id){ switch (id) { case 0: return BoltironChest; case 1: return BoltironLegs; default: break; } 
	return BoltironChest; 
	//default, if whenever you should have passed on a wrong id } }
	}

//package tutorial;
	//import net.minecraft.client.model.ModelBiped;
	//public class ClientProxy extends CommonProxy {
	//private static final tutarm tutChest = new tutarm(1.0f);
	//private static final tutarm tutLegs = new tutarm(0.5f);
	//@Override public ModelBiped getArmorModel(int id){ switch (id) { case 0: return tutChest; case 1: return tutLegs; default: break; } 
	//return tutChest; 
	//default, if whenever you should have passed on a wrong id } }


}


	
	

