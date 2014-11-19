package com.boltcraft.basic;

import com.boltcraft.basic.References;
import com.boltcraft.basic.Resource;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.mod_id, version = References.VERSION, name = References.name)

public class Boltcraft
{
	
 
	// proxy for armor
			@SidedProxy(clientSide=References.proxy_client, serverSide=References.proxy_common)
			public static CommonProxy proxy_common;
			public static ClientProxy proxy_client;
	
	@Instance(References.MODID)
	public static Boltcraft modInstance;
	
	@EventHandler public void load(FMLInitializationEvent e) { }
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    
    //EnumArmorMaterial name = EnumHelper.addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    public static ArmorMaterial
    
    boltIronArmor = EnumHelper.addArmorMaterial("boltIronArmor", 10,new int[]{3, 4, 5, 6}, 30);
    
    //armor
    
    public static Item boltIronChest;
    public static Item boltIronLegs;
    public static Item boltIronBoots;
    public static Item boltIronHelmet;
    
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
    public static Block bolttwister;
    public static Block bolttwisterActive;
 
    public static Block BoltStructureBlockGen;
    public static Block Smallcastle;

  
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//armor
    	
    	boltIronHelmet = new BoltArmorNew(boltIronArmor, 3000, 0).setUnlocalizedName("boltIronHelmet").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "boltArmourIronHelm");
    	GameRegistry.registerItem(boltIronHelmet, "boltironHelmet");
    	boltIronChest = new BoltArmorNew(boltIronArmor, 3001, 1).setUnlocalizedName("boltIronChest").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "boltArmourIronChest" );
    	GameRegistry.registerItem(boltIronChest, "boltironChest");
    	boltIronLegs = new BoltArmorNew(boltIronArmor, 3002, 2).setUnlocalizedName("boltIronLeggins").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "boltArmourIronLegs");
    	GameRegistry.registerItem(boltIronLegs, "boltironLegs");
    	boltIronBoots = new BoltArmorNew(boltIronArmor, 3003, 3).setUnlocalizedName("boltIronBoots").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "boltArmourIronBoots");
    	GameRegistry.registerItem(boltIronBoots, "boltironBoots");
    	
    	
    	
    	//items  
    	
        boltiron = new Item().setUnlocalizedName("ironBolt").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "IronBolt");
        GameRegistry.registerItem(boltiron, "ironBolt");
        boltgold = new Item().setUnlocalizedName("goldBolt").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "GoldBolt");
        GameRegistry.registerItem(boltgold, "goldBolt");
        boltdiamond = new Item().setUnlocalizedName("diamondBolt").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "DiamondBolt");
        GameRegistry.registerItem(boltdiamond, "diamondBolt");
        boltquartz = new Item().setUnlocalizedName("quartzBolt").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "QuartzBolt");
        GameRegistry.registerItem(boltquartz, "quartzBolt");
        ironnugget = new Item().setUnlocalizedName("ironNugget").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "IronNugget");
        GameRegistry.registerItem(ironnugget, "ironNugget");
        diamondshard = new Item().setUnlocalizedName("diamondShard").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "DiamondNugget");
        GameRegistry.registerItem(diamondshard, "diamondShard");
        quartzshard = new Item().setUnlocalizedName("quartzShard").setCreativeTab(bolttab).setTextureName(References.MODID + ":" + "QuartzShard");
        GameRegistry.registerItem(quartzshard, "quartzShard");
        
        //blocks
        
        boltblock = new BoltBlock().setBlockName("boltBlock").setCreativeTab(bolttab).setBlockTextureName("emerald_block");
        GameRegistry.registerBlock(boltblock, "blockBlock");
        BoltStructureBlockGen = new BoltStructureBlockGen().setBlockName("boltStructureBlockGen").setCreativeTab(bolttab).setBlockTextureName("diamond_block");
        GameRegistry.registerBlock(BoltStructureBlockGen, "boltStructureBlockGen");
        bolttwisterActive = new BoltTwister(true).setBlockName("BoltTwisterActive");
        GameRegistry.registerBlock(bolttwisterActive, "BolttwisterActive");
        bolttwister = new BoltTwister(true).setBlockName("BoltTwister");
        GameRegistry.registerBlock(bolttwister, "BoltTwister");
        
        //recipes
          
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltiron, 1), new Object[] {"#", '#', Boltcraft.ironnugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltgold, 1), new Object[] {"#", '#', Boltcraft.ironnugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltdiamond, 1), new Object[] {"#", '#', Boltcraft.diamondshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltquartz, 1), new Object[] {"#", '#', Boltcraft.quartzshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.ironnugget, 9), new Object[] {"#", '#', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.diamondshard, 3), new Object[] {"#", '#', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.quartzshard, 3), new Object[] {"#", '#', Items.quartz});
        
        //generations
        
        GameRegistry.registerWorldGenerator(new BoltGeneration(), 1);
        GameRegistry.registerWorldGenerator(new Smallcastle(), 1);
        
        //proxy
        
        ClientProxy.register_renderers();
        

    }
}
    
    


