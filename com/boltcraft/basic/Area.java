package com.boltcraft.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class Area {

//TADO: Clean up code, not needed to repet smae thin over and over, add method that do all basic stuff.

private static int blockID;
private static boolean isAreaValid;

/**
* Test an area starting at x, y z.
* <br>
* setting a block to spawn on
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn){
blockID = 0;
Block airBlock = Blocks.air;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
Block testAreaBlocks = null;
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock){
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{
isAreaValid = false;
}
}

/**
* Test an area starting at x, y z.
* <br>
* setting a block to spawn on and a Material to spawn on
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn, Material material){
blockID = 0;
Block airBlock = Blocks.air;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
Block testAreaBlocks = null;
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock || material == blockBelowPlacedBlock.getMaterial()){
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{
isAreaValid = false;
}
}

/**
* Test an area starting at x, y z.
* <br>
* Setting 2 blocks allowed to spawn on
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
* @param blockAllowedtoSpawnOn1
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn, Block blockAllowedtoSpawnOn1){
blockID = 0;
Block airBlock = Blocks.air;
Block testAreaBlocks = null;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock || blockAllowedtoSpawnOn1 == blockBelowPlacedBlock){//test blcok below is same as blockAllowedtoSpawnOn : blockAllowedtoSpawnOn?
//get all blocks in test area, set via xSize, ySize and zSize.
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){//if all blocks in test area are not air.
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{//if all blocks in test area are air.
isAreaValid = false;
}
}

/**
* Test an area starting at x, y z.
* <br>
* Setting 2 blocks allowed to spawn on and a material
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
* @param blockAllowedtoSpawnOn1
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn, Block blockAllowedtoSpawnOn1, Material matrial){
blockID = 0;
Block airBlock = Blocks.air;
Block testAreaBlocks = null;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock || blockAllowedtoSpawnOn1 == blockBelowPlacedBlock || matrial == blockBelowPlacedBlock.getMaterial()){
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){//if all blocks in test area are not air.
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{//if all blocks in test area are air.
isAreaValid = false;
}
}

/**
* Test an area starting at x, y z.
* <br>
* Setting 3 blocks allowed to spawn on
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
* @param blockAllowedtoSpawnOn1
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn, Block blockAllowedtoSpawnOn1, Block blockAllowedtoSpawnOn2){
blockID = 0;
Block airBlock = Blocks.air;
Block testAreaBlocks = null;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock || blockAllowedtoSpawnOn1 == blockBelowPlacedBlock || blockAllowedtoSpawnOn2 == blockBelowPlacedBlock){
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){//if all blocks in test area are not air.
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{//if all blocks in test area are air.
isAreaValid = false;
}
}

/**
* Test an area starting at x, y z.
* <br>
* Setting 3 blocks allowed to spawn on and a material
* <br
* xSize, ySize and zSize are the points from x, y and z u want to test upto.
* @param world
* @param x
* @param y
* @param z
* @param xSize
* @param ySize
* @param zSize
* @param blockAllowedtoSpawnOn
* @param blockAllowedtoSpawnOn1
*/
public static void test(World world, int x, int y, int z, int xSize, int ySize, int zSize, Block blockAllowedtoSpawnOn, Block blockAllowedtoSpawnOn1, Block blockAllowedtoSpawnOn2, Material material){
blockID = 0;
Block airBlock = Blocks.air;
Block testAreaBlocks = null;
Block blockBelowPlacedBlock = world.getBlock(x, y - 1, z);
if(blockAllowedtoSpawnOn == blockBelowPlacedBlock || blockAllowedtoSpawnOn1 == blockBelowPlacedBlock || blockAllowedtoSpawnOn2 == blockBelowPlacedBlock || material == blockBelowPlacedBlock.getMaterial()){
for(int yp = 0; yp < ySize; ++yp){
for(int xp = 0; xp < xSize; ++xp){
for(int zp = 0; zp < zSize; ++zp){
blockID++;
testAreaBlocks = world.getBlock(x + xp, y + yp, z + zp);
}
}
}
if(testAreaBlocks != airBlock){//if all blocks in test area are not air.
isAreaValid = false;
}else{
isAreaValid = true;
}
}else{//if all blocks in test area are air.
isAreaValid = false;
}
}


/**
* Is the area a vaild location.
* <br>
* true if area contains blocks set in setSpawnBlocks.
* <br>
* Otherwise false.
* @return
*/
public static boolean isValid() {
return isAreaValid;
}

/**
* Diplsay number of blocks in area.
*/
public static void numOfBlockInTestArea(){
System.out.println("Number of block int test area : " + blockID);
}
}