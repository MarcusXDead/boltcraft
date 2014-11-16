package com.boltcraft.basic;

import net.minecraft.tileentity.TileEntity;

public class TileEntityBolttwister extends TileEntity {
	
	 int tick = 0;
	 
	    public static final String publicName = "tileEntityBolttwister";
	    private String name = "tileEntityBolttwister";
	 
	    public String getName() {
	 
	        return name;
	    }
	 
	    @Override
	    public void updateEntity() {
	 
	        if(!worldObj.isRemote) {
	 
	            tick++;
	            if(tick == 100) {
	 
	                this.worldObj.setWorldTime(1000);
	                tick = 0;
	            }
	        }
	    }
	}
	


