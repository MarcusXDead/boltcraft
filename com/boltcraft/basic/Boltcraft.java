package com.boltcraft.basic;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Boltcraft.MODID, version = Boltcraft.VERSION)

public class Boltcraft
{
    public static final String MODID = "Boltcraft";
    public static final String VERSION = "0.3";
    
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    // items
    public static Item boltiron;
    public static Item boltgold;
    public static Item boltdiamond;
    public static Item boltquartz;
    public static Item ironnugget;
    public static Item diamondshard;
    public static Item quartzshard;
    
    
    
    // blocks
    public static Block boltblock;
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//items    
        boltiron = new Item().setUnlocalizedName("ironBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "IronBolt");
        GameRegistry.registerItem(boltiron, "ironBolt");
        boltgold = new Item().setUnlocalizedName("goldBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "GoldBolt");
        GameRegistry.registerItem(boltgold, "goldBolt");
        boltdiamond = new Item().setUnlocalizedName("diamondBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "DiamondBolt");
        GameRegistry.registerItem(boltdiamond, "diamondBolt");
        boltquartz = new Item().setUnlocalizedName("quartzBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "default");
        GameRegistry.registerItem(boltquartz, "quartzBolt");
        ironnugget = new Item().setUnlocalizedName("ironNugget").setCreativeTab(bolttab).setTextureName(MODID + ":" + "IronNugget");
        GameRegistry.registerItem(ironnugget, "ironNugget");
        diamondshard = new Item().setUnlocalizedName("diamondShard").setCreativeTab(bolttab).setTextureName(MODID + ":" + "DiamondNugget");
        GameRegistry.registerItem(diamondshard, "diamondShard");
        quartzshard = new Item().setUnlocalizedName("quartzShard").setCreativeTab(bolttab).setTextureName(MODID + ":" + "QuartzShard");
        GameRegistry.registerItem(quartzshard, "quartzShard");
        //blocks
        
        boltblock = new BoltBlock().setBlockName("boltBlock").setCreativeTab(bolttab).setBlockTextureName("dirt");
        GameRegistry.registerBlock(boltblock, "blockBlock");
        
        //recipes
        
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltiron, 1), new Object[] {"#", '#', Boltcraft.ironnugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltgold, 1), new Object[] {"#", '#', Boltcraft.ironnugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltdiamond, 1), new Object[] {"#", '#', Boltcraft.diamondshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltquartz, 1), new Object[] {"#", '#', Boltcraft.quartzshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.ironnugget, 9), new Object[] {"#", '#', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.diamondshard, 3), new Object[] {"#", '#', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.quartzshard, 3), new Object[] {"#", '#', Items.quartz});
       
    }
}
    
    


