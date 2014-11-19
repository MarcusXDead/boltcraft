package com.boltcraft.basic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;






public class BoltArmor extends ItemArmor {

	
	@Override
	@SideOnly(Side.CLIENT) public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {  ModelBiped armorModel = null; if(itemStack != null){ if(stack.getItem() instanceof BoltArmor){ } }  }
	int type = ((ItemArmor)()).armorType;
	if(type == 1 || type == 3){ armorModel = Boltcraft.proxy.getArmorModel(0); } 
	else { armorModel = Boltcraft.proxy.getArmorModel(1);}


if(armorModel != null){ 
	armorModel.bipedHead.showModel = armorSlot == 0;
	armorModel.bipedHeadwear.showModel = armorSlot == 0;
	armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
	armorModel.bipedRightArm.showModel = armorSlot == 1;
	armorModel.bipedLeftArm.showModel = armorSlot == 1;
	armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
	armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
	armorModel.isSneak = entityLiving.isSneaking();
	armorModel.isRiding = entityLiving.isRiding();
	armorModel.isChild = entityLiving.isChild();
	armorModel.heldItemRight = entityLiving.getCurrentItemOrArmor(0) != null ? 1 :0;}
	if(entityLiving instanceof EntityPlayer){
		armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2; } 
	return armorModel; 
	return null;
	
	
	
	
	public BoltArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(Boltcraft.bolttab);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == Boltcraft.BoltironHelmet || stack.getItem() == Boltcraft.BoltironChest || stack.getItem() == Boltcraft.BoltironBoots) {
			
			return (Boltcraft.MODID + ":" + "boltArmourIronLayer1");
					
		}
		if (stack.getItem().equals( Boltcraft.BoltironLegs)) {
			return (Boltcraft.MODID + ":" + "boltArmourIronLayer2");
		}
		
		else return null;
		
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
