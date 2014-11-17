package com.boltcraft.basic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BoltArmor extends ItemArmor {
	
	public BoltArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) { super(par1, par2EnumArmorMaterial, par3, par4); }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) { String itemName = getUnlocalizedName().substring(getUnlocalizedName().lastIndexOf(".") + 1); 
	this.itemIcon = par1IconRegister.registerIcon(itemName);}
	
	@Override public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem().equals(Boltcraft.boltironchest) || stack.getItem().equals( mod_ArmorTutorial.boots) || stack.getItem(mod_ArmorTutorial.helmet) { 
			return "boltArmourIronLayer1.png"; } 
		if (stack.getItem().equals( Boltcraft.boltironlegs)) { 
			return "boltArmourIronLayer2.png"; } 
		return null;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) { return null; }
	
	
	

}
