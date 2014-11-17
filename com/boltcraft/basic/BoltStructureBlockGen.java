package com.boltcraft.basic;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

//===========================================================================
// TestBlock class
//===========================================================================
/**
 * A custom block for use as a custom ore.
 * 
 * @version vymdt.01.2014.08.18.0000
 * @author Ryan F. Mercer -Open source.
 */
public class BoltStructureBlockGen extends Block {

public BoltStructureBlockGen() {
		super(Material.wood);
		// TODO Auto-generated constructor stub
	}
/** Item for dropping. */
private Item drop;

//===========================================================================
/**
 * Returns quantity of items to drop when block destroyed.
 * 
 * @param random  [Unused] Random number generator.
 * @return Quantity of items to drop.
 */
@Override
public int quantityDropped(Random random) {
  
  //unused parameters: random.
  return super.quantityDropped(random); //returns: 1.
}
//===========================================================================
/**
 * Sets item to be dropped when block destroyed.
 * 
 * @param item  Dropped from block.
 */
public void setItemDropped(Item item) {
  
  drop = item;
}
//===========================================================================
/**
 * Returns item to be dropped when block destroyed.
 * 
 * @param metadata  [Unused] Extra nibble.
 * @param random    [Unused] Random number generator.
 * @param fortune   [Unused] Chance multiplier.
 * @return Item to drop when block destroyed.
 */
@Override
public Item getItemDropped(int metadata, Random random, int fortune) {
  
  return drop;
}
//===========================================================================
/**
 * Called just before block destroyed by player. Plays sound specific to
 * this block at block's location.
 * 
 * @param world     Current world.
 * @param x         X-axis coordinate of block.
 * @param y         Y-axis coordinate of block.
 * @param z         Z-axis coordinate of block.
 * @param metadata  [Unused] Extra nibble.
 */
@Override
public void onBlockDestroyedByPlayer(World world, int x, int y, int z
    , int metadata) {
  
  world.playSound
    ( x, y, z //block's coordinates.
    //file: resources\assets\<MODID>\sounds\coin.ogg
    , Boltcraft.MODID+":coin"
    , 0.5F //half volume.
    , 1.0F //normal pitch.
    , true //?
    );
}


//===========================================================================
/**
* Replaces placed block with spiral quartz staircase with glowstone column.
* 
* @param world  Current world.
* @param x      X-axis coordinate of block.
* @param y      Y-axis coordinate of block.
* @param z      Z-axis coordinate of block.
*/
public void onBlockAdded(World world, int x, int y, int z) {

super.onBlockAdded(world, x, y, z);
world.setBlockToAir(x, y, z); //removes initially placed block.

//spiral quartz staircase with glowstone column.
//metadata: minecraft.gamepedia.com/Data_values
world.setBlock(x,   y,   z,   Blocks.quartz_stairs, 0x3/*north*/, 2);
world.setBlock(x,   y,   z-1, Blocks.quartz_block);
world.setBlock(x-1, y,   z-1, Blocks.quartz_block);
world.setBlock(x-1, y,   z,   Blocks.glowstone);
//----
world.setBlock(x-1, y+1, z-1, Blocks.quartz_stairs, 0x1/*west*/, 2);
world.setBlock(x-2, y+1, z-1, Blocks.quartz_block);
world.setBlock(x-2, y+1, z,   Blocks.quartz_block);
world.setBlock(x-1, y+1, z,   Blocks.glowstone);
//----
world.setBlock(x-2, y+2, z,   Blocks.quartz_stairs, 0x2/*south*/, 2);
world.setBlock(x-2, y+2, z+1, Blocks.quartz_block);
world.setBlock(x-1, y+2, z+1, Blocks.quartz_block);
world.setBlock(x-1, y+2, z,   Blocks.glowstone);
//----
world.setBlock(x-1, y+3, z+1, Blocks.quartz_stairs, 0x0/*east*/, 2);
world.setBlock(x,   y+3, z+1, Blocks.quartz_block);
world.setBlock(x,   y+3, z,   Blocks.quartz_block);
world.setBlock(x-1, y+3, z,   Blocks.glowstone);
}
//===========================================================================
}//END class
//===========================================================================


