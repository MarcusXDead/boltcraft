package com.boltcraft.basic;

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
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Boltcraft.MODID, name="Boltcraft", version = Boltcraft.VERSION)
@NetworkRegistry(clientSideRequired=true, serverSideRequired=false)

public class Boltcraft
{

	
	
    public static final String MODID = "Boltcraft";
    public static final String VERSION = "0.3";
 
	// proxy for armor
	@SidedProxy(serverSide="boltcraft.CommonProxy", clientSide="boltcraft.ClientProxy")
    public static CommonProxy proxy;
	@EventHandler public void load(FMLInitializationEvent e) { }
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    
    //EnumArmorMaterial name = EnumHelper.addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    public static ArmorMaterial
    
    BoltIronArmor = EnumHelper.addArmorMaterial("BoltIronArmor", 10,new int[]{3, 4, 5, 6}, 30);
    
    //armor
    
    public static Item BoltironChest;
    public static Item BoltironLegs;
    public static Item BoltironBoots;
    public static Item BoltironHelmet;
    
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
 


    
    public static void init() {
 
        bolttwister = new BoltTwister();
       
        
    }


    public static Block BoltStructureBlockGen;
    public static Block Smallcastle;

    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//armor
    	
    	BoltironHelmet = new BoltArmor(BoltIronArmor, 3000, 0).setUnlocalizedName("boltironHelmet").setCreativeTab(bolttab).setTextureName(MODID + ":" + "boltArmourIronHelm");
    	GameRegistry.registerItem(BoltironHelmet, "boltironHelmet");
    	BoltironChest = new BoltArmor(BoltIronArmor, 3001, 1).setUnlocalizedName("boltironChest").setCreativeTab(bolttab).setTextureName(MODID + ":" + "boltArmourIronChest" );
    	GameRegistry.registerItem(BoltironChest, "boltironChest");
    	BoltironLegs = new BoltArmor(BoltIronArmor, 3002, 2).setUnlocalizedName("boltironLeggins").setCreativeTab(bolttab).setTextureName(MODID + ":" + "boltArmourIronLegs");
    	GameRegistry.registerItem(BoltironLegs, "boltironLegs");
    	BoltironBoots = new BoltArmor(BoltIronArmor, 3003, 3).setUnlocalizedName("boltironBoots").setCreativeTab(bolttab).setTextureName(MODID + ":" + "boltArmourIronBoots");
    	GameRegistry.registerItem(BoltironBoots, "boltironBoots");
    	
    	
    	
    	//items  
    	
        boltiron = new Item().setUnlocalizedName("ironBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "IronBolt");
        GameRegistry.registerItem(boltiron, "ironBolt");
        boltgold = new Item().setUnlocalizedName("goldBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "GoldBolt");
        GameRegistry.registerItem(boltgold, "goldBolt");
        boltdiamond = new Item().setUnlocalizedName("diamondBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "DiamondBolt");
        GameRegistry.registerItem(boltdiamond, "diamondBolt");
        boltquartz = new Item().setUnlocalizedName("quartzBolt").setCreativeTab(bolttab).setTextureName(MODID + ":" + "QuartzBolt");
        GameRegistry.registerItem(boltquartz, "quartzBolt");
        ironnugget = new Item().setUnlocalizedName("ironNugget").setCreativeTab(bolttab).setTextureName(MODID + ":" + "IronNugget");
        GameRegistry.registerItem(ironnugget, "ironNugget");
        diamondshard = new Item().setUnlocalizedName("diamondShard").setCreativeTab(bolttab).setTextureName(MODID + ":" + "DiamondNugget");
        GameRegistry.registerItem(diamondshard, "diamondShard");
        quartzshard = new Item().setUnlocalizedName("quartzShard").setCreativeTab(bolttab).setTextureName(MODID + ":" + "QuartzShard");
        GameRegistry.registerItem(quartzshard, "quartzShard");
        
        //blocks
        
        boltblock = new BoltBlock().setBlockName("boltBlock").setCreativeTab(bolttab).setBlockTextureName("emerald_block");
        GameRegistry.registerBlock(boltblock, "blockBlock");
        BoltStructureBlockGen = new BoltStructureBlockGen().setBlockName("boltStructureBlockGen").setCreativeTab(bolttab).setBlockTextureName("diamond_block");
        GameRegistry.registerBlock(BoltStructureBlockGen, "boltStructureBlockGen");
        
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
        

    }
}
    
    


