package com.boltcraft.basic;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class Sample extends WorldGenerator {
	public List<Integer> whitelist = getListOnArray(1);
public int xDim = 4;
public int yDim = 3;
public int zDim = 4;
public int solids = 80;
public int nonsolids = 60;
	public List<Integer> getListOnArray(int... ints) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i : ints) {
			intList.add(i);
		}
		return intList;
	}
	public boolean checkSpawn(World world, int x, int y, int z) {
		int solidBlocksInPlatform = 0, freeBlocksInSpace = 0;
		for (int i = 0; i < xDim; ++i)
			for (int k = 0; k < zDim; ++k) {
				if (world.getBlockId(x + i, y - 1, z + k) != 0 && whitelist.contains(world.getBlockId(x + i, y - 1, z + k)) && !Block.blocksList[world.getBlockId(x + i, y - 1, z + k)].blockMaterial.isReplaceable())
					solidBlocksInPlatform++;
				for (int j = 0; j < yDim; ++j) {
					if (world.isAirBlock(x + i, y + j, z + k) || Block.blocksList[world.getBlockId(x + i, y + j, z + k)].blockMaterial.isReplaceable())
						freeBlocksInSpace++;
				}
			}
		return Math.round((freeBlocksInSpace / (xDim * zDim * yDim)) * 100.0f) > solids && Math.round((solidBlocksInPlatform / xDim * zDim) * 100.0f) > nonsolids;
	}
public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
  if(checkSpawn(par1World, par3, par4, par5)) {
      new Sample1().generate(par1World, par2Random, par3, par4, par5);
  return true;
} else return false;
  }
}
