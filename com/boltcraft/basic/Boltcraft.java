package com.boltcraft.basic;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Boltcraft.MODID, version = Boltcraft.VERSION)

public class Boltcraft
{
    public static final String MODID = "Boltcraft";
    public static final String VERSION = "0.2";
    
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    // items
    public static Item boltiron;
    public static Item boltgold;
    
    
    
    // blocks
    public static Block boltblock;
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//items    
        boltiron = new Item().setUnlocalizedName("ironBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "default");
        GameRegistry.registerItem(boltiron, "ironBolt");
        
        
        //blocks
        
        boltblock = new BoltBlock().setBlockName("boltBlock").setCreativeTab(bolttab).setBlockTextureName("dirt");
        GameRegistry.registerBlock(boltblock, "blockBlock");
    }
}


