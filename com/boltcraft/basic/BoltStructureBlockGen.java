package com.boltcraft.basic;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BoltStructureBlockGen extends Block {

public BoltStructureBlockGen() {
		super(Material.wood);
		// TODO Auto-generated constructor stub
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

world.setBlock(x + 0, y + 0, z + 0, Blocks.planks);
world.setBlock(x + 1, y + 0, z + 0, Blocks.cobblestone);
world.setBlock(x + 2, y + 0, z + 0, Blocks.cobblestone);
world.setBlock(x + 3, y + 0, z + 0, Blocks.cobblestone);
world.setBlock(x + 0, y + 0, z + 1, Blocks.planks);
world.setBlock(x + 1, y + 0, z + 1, Blocks.cobblestone);
world.setBlock(x + 2, y + 0, z + 1, Blocks.cobblestone);
world.setBlock(x + 3, y + 0, z + 1, Blocks.cobblestone);
world.setBlock(x + 0, y + 0, z + 2, Blocks.planks);
world.setBlock(x + 1, y + 0, z + 2, Blocks.cobblestone);
world.setBlock(x + 2, y + 0, z + 2, Blocks.cobblestone);
world.setBlock(x + 3, y + 0, z + 2, Blocks.cobblestone);
world.setBlock(x + 0, y + 0, z + 3, Blocks.planks);
world.setBlock(x + 1, y + 0, z + 3, Blocks.planks);
world.setBlock(x + 2, y + 0, z + 3, Blocks.planks);
world.setBlock(x + 3, y + 0, z + 3, Blocks.planks);
world.setBlock(x + 0, y + 1, z + 0, Blocks.air);
world.setBlock(x + 1, y + 1, z + 0, Blocks.cobblestone);
world.setBlock(x + 2, y + 1, z + 0, Blocks.cobblestone);
world.setBlock(x + 3, y + 1, z + 0, Blocks.cobblestone);
world.setBlock(x + 0, y + 1, z + 1, Blocks.air);
world.setBlock(x + 1, y + 1, z + 1, Blocks.cobblestone);
world.setBlock(x + 2, y + 1, z + 1, Blocks.cobblestone);
world.setBlock(x + 3, y + 1, z + 1, Blocks.cobblestone);
world.setBlock(x + 0, y + 1, z + 2, Blocks.air);
world.setBlock(x + 1, y + 1, z + 2, Blocks.cobblestone);
world.setBlock(x + 2, y + 1, z + 2, Blocks.cobblestone);
world.setBlock(x + 3, y + 1, z + 2, Blocks.cobblestone);
world.setBlock(x + 0, y + 1, z + 3, Blocks.air);
world.setBlock(x + 1, y + 1, z + 3, Blocks.air);
world.setBlock(x + 2, y + 1, z + 3, Blocks.air);
world.setBlock(x + 3, y + 1, z + 3, Blocks.air);
world.setBlock(x + 0, y + 2, z + 0, Blocks.air);
world.setBlock(x + 1, y + 2, z + 0, Blocks.cobblestone);
world.setBlock(x + 2, y + 2, z + 0, Blocks.cobblestone);
world.setBlock(x + 3, y + 2, z + 0, Blocks.cobblestone);
world.setBlock(x + 0, y + 2, z + 1, Blocks.air);
world.setBlock(x + 1, y + 2, z + 1, Blocks.cobblestone);
world.setBlock(x + 2, y + 2, z + 1, Blocks.cobblestone);
world.setBlock(x + 3, y + 2, z + 1, Blocks.cobblestone);
world.setBlock(x + 0, y + 2, z + 2, Blocks.air);
world.setBlock(x + 1, y + 2, z + 2, Blocks.cobblestone);
world.setBlock(x + 2, y + 2, z + 2, Blocks.cobblestone);
world.setBlock(x + 3, y + 2, z + 2, Blocks.cobblestone);
world.setBlock(x + 0, y + 2, z + 3, Blocks.air);
world.setBlock(x + 1, y + 2, z + 3, Blocks.air);
world.setBlock(x + 2, y + 2, z + 3, Blocks.air);
world.setBlock(x + 3, y + 2, z + 3, Blocks.air);
}
//===========================================================================
}//END class
//===========================================================================


