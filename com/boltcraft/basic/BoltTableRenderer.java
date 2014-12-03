package com.boltcraft.basic;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class BoltTableRenderer extends TileEntitySpecialRenderer {
	
	
	private static final ResourceLocation BoltTableTexture = new ResourceLocation(References.mod_id + ":" + "textures/models/blocks/BoltTable1.png");




	private static final Block item = Boltcraft.BoltTable;




	private ModelBoltTable1 BoltTableModel1;
	
	
	
	public BoltTableRenderer(){
        super();
        this.BoltTableModel1 = new ModelBoltTable1();
    }
	
	/*
	ItemStack stack = new ItemStack(item, 1, 0);
	EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D, stack);
	*/
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
			GL11.glRotatef(180,  0F,  0F, 1F); //180 0 0 1
			
			Minecraft.getMinecraft().renderEngine.bindTexture(BoltTableTexture);
			
			GL11.glPushMatrix();
				this.BoltTableModel1.renderModel(0.0625F);
			GL11.glPopMatrix();
		
		GL11.glPopMatrix();
		/*
		GL11.glPushMatrix();
		//Without the below line, the item will spazz out
		this.entItem.hoverStart = 0.0F;
		RenderItem.renderInFrame = true;
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.02F, (float)z + 0.3F);
		GL11.glRotatef(180, 0, 1, 1);
		RenderManager.instance.renderEntityWithPosYaw(this.entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
		RenderItem.renderInFrame = false;
		GL11.glPopMatrix();
		*/
	}

}

