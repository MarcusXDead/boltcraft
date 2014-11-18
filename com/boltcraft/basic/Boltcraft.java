package com.boltcraft.basic;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Boltcraft.MODID, name="Boltcraft", version = Boltcraft.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Boltcraft
{
	// proxy for armor
	@SidedProxy(serverSide="boltcraft.CommonProxy", clientSide="boltcraft.ClientProxy")
	public static CommonProxy proxy;
	@EventHandler public void load(FMLInitializationEvent e) { }
	//
	
	
    public static final String MODID = "Boltcraft";
    public static final String VERSION = "0.3";
    
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    
    //EnumArmorMaterial name = EnumHelper.addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    EnumArmorMaterial boltArmour = EnumHelper.addArmorMaterial("Shadow", 29, new int[]{3, 7, 5, 3}, 30);
    
    public static Item boltironchest;
    public static Item boltironlegs;
    public static Item boltironboots;
    public static Item boltironhelmet;
    
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
    public static Block BoltStructureBlockGen;
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//armor
    	
    	boltironhelmet = new BoltArmor(8469, EnumArmorMaterial.IRON, 4, 0).setUnlocalizedName("a.iron_helmet");
    	boltironchest = new BoltArmor(8470, EnumArmorMaterial.IRON, 4, 1).setUnlocalizedName("a.iron_chestplate");
    	boltironlegs = new BoltArmor(8471, EnumArmorMaterial.IRON, 4, 2).setUnlocalizedName("a.iron_leggings");
    	boltironboots = new BoltArmor(8472, EnumArmorMaterial.IRON, 4, 3).setUnlocalizedName("a.iron_boots");
    	LanguageRegistry.addName(boltironhelmet, "3D Helmet");
    	LanguageRegistry.addName(boltironchest, "3D Chest");
    	LanguageRegistry.addName(boltironlegs, "3D Legs");
    	LanguageRegistry.addName(boltironboots, "3D Boots");
    	
    	
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
    
    


