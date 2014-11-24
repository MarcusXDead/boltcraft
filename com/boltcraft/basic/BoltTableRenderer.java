package com.boltcraft.basic;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.boltcraft.basic.References;
import com.boltcraft.basic.ModelBoltTable1;
import com.boltcraft.basic.Boltcraft;


public class BoltTableRenderer extends TileEntitySpecialRenderer {
	
	
	private static final ResourceLocation BoltTableTexture = new ResourceLocation(References.mod_id + ":" + "textures/models/blocks/BoltTable1.png");

	private ModelBoltTable1 BoltTableModel1;
	
	public BoltTableRenderer(){
        super();
        this.BoltTableModel1 = new ModelBoltTable1();
    }
	

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
			GL11.glRotatef(180,  0F,  0F, 1F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(BoltTableTexture);
			
			GL11.glPushMatrix();
				this.BoltTableModel1.renderModel(0.0625F);
			GL11.glPopMatrix();
		
		GL11.glPopMatrix();
	}

}

