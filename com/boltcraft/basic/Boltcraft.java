package com.boltcraft.basic;

import com.boltcraft.basic.References;
import com.boltcraft.basic.Resource;
import com.boltcraft.basic.TileEntityBoltcraftBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
	
	
	
	@EventHandler
 	public static void PreLoad(FMLPreInitializationEvent PreEvent){
 		
		TileEntityBoltcraftBasic.mainRegistry();
	
		
	}
	
	@EventHandler public void load(FMLInitializationEvent e) { }
    
    public static CreativeTabs bolttab = new CreativeTabs("Boltcraft"){
    	public Item getTabIconItem(){
    		return Items.arrow;
    	}
    };
    
    //EnumArmorMaterial name = EnumHelper.addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    public static ArmorMaterial
    
    boltIron_Material = EnumHelper.addArmorMaterial("boltIron_Material", 10,new int[]{3, 4, 5, 6}, 30);
    
    //armor
    
    public static Item boltIron_Chest;
    public static Item boltIron_Legs;
    public static Item boltIron_Boots;
    public static Item boltIron_Helmet;
    
    // items
    
    public static Item boltiron;
    public static Item boltgold;
    public static Item boltdiamond;
    public static Item boltquartz;
    public static Item ironnugget;
    public static Item diamondshard;
    public static Item quartzshard;
    
    //weapons
    
    public static ItemBow BoltBow = (ItemBow)Item.itemRegistry.getObject("BoltBow");
    
    
    
    // blocks
    
    public static Block boltblock;
    public static Block bolttwister;
    public static Block bolttwisterActive;
    public static Block BoltChest;
    public static Block BoltStructureBlockGen;
    
    
    
    public static Block BoltTable = new BoltTable(Material.rock).setBlockName("BoltTable").setBlockTextureName(References.mod_id +":"+"BoltTableBlock");

  
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//armor
    	
    	boltIron_Helmet = new BoltArmorNew(boltIron_Material, 2, 0).setUnlocalizedName("boltIron_Helmet").setCreativeTab(bolttab);
    	GameRegistry.registerItem(boltIron_Helmet, "boltiron_Helmet");
    	boltIron_Chest = new BoltArmorNew(boltIron_Material, 2, 1).setUnlocalizedName("boltIron_Chest").setCreativeTab(bolttab);
    	GameRegistry.registerItem(boltIron_Chest, "boltiron_Chest");
    	boltIron_Legs = new BoltArmorNew(boltIron_Material, 2, 2).setUnlocalizedName("boltIron_Legs").setCreativeTab(bolttab);
    	GameRegistry.registerItem(boltIron_Legs, "boltiron_Legs");
    	boltIron_Boots = new BoltArmorNew(boltIron_Material, 2, 3).setUnlocalizedName("boltIron_Boots").setCreativeTab(bolttab);
    	GameRegistry.registerItem(boltIron_Boots, "boltiron_Boots");
    	
    	
    	
    	//items  
    	
        boltiron = new Item().setUnlocalizedName("ironBolt").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "IronBolt");
        GameRegistry.registerItem(boltiron, "ironBolt");
        boltgold = new Item().setUnlocalizedName("goldBolt").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "GoldBolt");
        GameRegistry.registerItem(boltgold, "goldBolt");
        boltdiamond = new Item().setUnlocalizedName("diamondBolt").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "DiamondBolt");
        GameRegistry.registerItem(boltdiamond, "diamondBolt");
        boltquartz = new Item().setUnlocalizedName("quartzBolt").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "QuartzBolt");
        GameRegistry.registerItem(boltquartz, "quartzBolt");
        ironnugget = new Item().setUnlocalizedName("ironNugget").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "IronNugget");
        GameRegistry.registerItem(ironnugget, "ironNugget");
        diamondshard = new Item().setUnlocalizedName("diamondShard").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "DiamondNugget");
        GameRegistry.registerItem(diamondshard, "diamondShard");
        quartzshard = new Item().setUnlocalizedName("quartzShard").setCreativeTab(bolttab).setTextureName(References.mod_id + ":" + "QuartzShard");
        GameRegistry.registerItem(quartzshard, "quartzShard");
        
        
        //weapons
        BoltBow = (ItemBow) new ItemBow().setUnlocalizedName("BoltBow").setCreativeTab(bolttab).setTextureName("bow");
        GameRegistry.registerItem(BoltBow, "BoltBow");
        
        
        //blocks
        
        boltblock = new BoltBlock().setBlockName("boltBlock").setCreativeTab(bolttab).setBlockTextureName("emerald_block");
        GameRegistry.registerBlock(boltblock, "blockBlock");
        BoltStructureBlockGen = new BoltStructureBlockGen().setBlockName("boltStructureBlockGen").setCreativeTab(bolttab).setBlockTextureName("diamond_block");
        GameRegistry.registerBlock(BoltStructureBlockGen, "boltStructureBlockGen");
        bolttwisterActive = new BoltTwister(true).setBlockName("BoltTwisterActive");
        GameRegistry.registerBlock(bolttwisterActive, "BolttwisterActive").setCreativeTab(bolttab).setBlockTextureName("cobblestone");
        bolttwister = new BoltTwister(false).setBlockName("BoltTwister");
        GameRegistry.registerBlock(bolttwister, "BoltTwister");
        BoltChest = new BoltChest(0).setBlockName("BoltChest").setCreativeTab(bolttab);
        GameRegistry.registerBlock(BoltChest, BoltChest.getUnlocalizedName());
        BoltTable = new BoltTable(Material.rock).setBlockName("BoltTable").setBlockTextureName(References.mod_id + ":" + "BoltTableBlock");
        GameRegistry.registerBlock(BoltTable, "BoltTable");
        
        //recipes
          
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltiron, 1), new Object[] {"#", '#', Boltcraft.ironnugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltgold, 1), new Object[] {"#", '#', Items.gold_nugget});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltdiamond, 1), new Object[] {"#", '#', Boltcraft.diamondshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.boltquartz, 1), new Object[] {"#", '#', Boltcraft.quartzshard});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.ironnugget, 9), new Object[] {"#", '#', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.diamondshard, 3), new Object[] {"#", '#', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(Boltcraft.quartzshard, 3), new Object[] {"#", '#', Items.quartz});
        
        //generations
        
        BoltGeneration eventWorldGen = new BoltGeneration();
        GameRegistry.registerWorldGenerator(new BoltGeneration(), 1);
        
        //proxy
        
        ClientProxy.registerRenderers();
        

    }
}
    
    


