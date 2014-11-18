package com.boltcraft.basic;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class BoltArmor extends ItemArmor {

	public BoltArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(Boltcraft.bolttab);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemHandler.BoltironHelmet || stack.getItem() == ItemHandler.BoltironChest || stack.getItem() == ItemHandler.BoltironBoots) {
			
			
		}
		
		
	}
	
	//@Override
	//@SideOnly(Side.CLIENT)
	//public void registerIcons(IIconRegister par1IconRegister) { String itemName = getUnlocalizedName().substring(getUnlocalizedName().lastIndexOf(".") + 1); 
	//this.itemIcon = par1IconRegister.registerIcon(itemName);}
	
	//@Override public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		//if (stack.getItem().equals(Boltcraft.boltironchest) || stack.getItem().equals( mod_ArmorTutorial.boots) || stack.getItem(mod_ArmorTutorial.helmet) { 
		//	return "boltArmourIronLayer1.png"; } 
		//if (stack.getItem().equals( Boltcraft.boltironlegs)) { 
		//	return "boltArmourIronLayer2.png"; } 
		//return null;
//	}
	
	
//	@Override
//	@SideOnly(Side.CLIENT)
//	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) { return null; }
	
	
	

}
