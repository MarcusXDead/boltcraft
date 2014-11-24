package com.boltcraft.basic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoltTable1 extends ModelBase
{
  //fields
    ModelRenderer Tabletop;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer Topbolt1;
    ModelRenderer Topbolt2;
    ModelRenderer Topbolt3;
    ModelRenderer Topbolt4;
    ModelRenderer Topbolt5;
    ModelRenderer Topbolt6;
    ModelRenderer Topbolt7;
    ModelRenderer Topbolt8;
    ModelRenderer Topplate1;
    ModelRenderer ClawBase1;
    ModelRenderer ClawBase2;
    ModelRenderer ClawBase3;
    ModelRenderer ClawBase4;
  
  public ModelBoltTable1()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Tabletop = new ModelRenderer(this, 0, 0);
      Tabletop.addBox(0F, 0F, 0F, 16, 4, 16);
      Tabletop.setRotationPoint(-8F, 10F, -8F);
      Tabletop.setTextureSize(64, 64);
      Tabletop.mirror = true;
      setRotation(Tabletop, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 48, 20);
      leg1.addBox(0F, 0F, 0F, 4, 10, 4);
      leg1.setRotationPoint(-8F, 14F, -8F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 16, 20);
      leg2.addBox(0F, 0F, 0F, 4, 10, 4);
      leg2.setRotationPoint(4F, 14F, 4F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 20);
      leg3.addBox(0F, 0F, 0F, 4, 10, 4);
      leg3.setRotationPoint(-8F, 14F, 4F);
      leg3.setTextureSize(64, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 32, 20);
      leg4.addBox(0F, 0F, 0F, 4, 10, 4);
      leg4.setRotationPoint(4F, 14F, -8F);
      leg4.setTextureSize(64, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      Topbolt1 = new ModelRenderer(this, 0, 36);
      Topbolt1.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt1.setRotationPoint(-6.5F, 9.5F, -6.5F);
      Topbolt1.setTextureSize(64, 64);
      Topbolt1.mirror = true;
      setRotation(Topbolt1, 0F, 0F, 0F);
      Topbolt2 = new ModelRenderer(this, 0, 36);
      Topbolt2.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt2.setRotationPoint(-6.5F, 9.5F, -0.5F);
      Topbolt2.setTextureSize(64, 64);
      Topbolt2.mirror = true;
      setRotation(Topbolt2, 0F, 0F, 0F);
      Topbolt3 = new ModelRenderer(this, 0, 36);
      Topbolt3.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt3.setRotationPoint(-6.5F, 9.5F, 5.5F);
      Topbolt3.setTextureSize(64, 64);
      Topbolt3.mirror = true;
      setRotation(Topbolt3, 0F, 0F, 0F);
      Topbolt4 = new ModelRenderer(this, 0, 36);
      Topbolt4.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt4.setRotationPoint(-0.5F, 9.5F, -6.5F);
      Topbolt4.setTextureSize(64, 64);
      Topbolt4.mirror = true;
      setRotation(Topbolt4, 0F, 0F, 0F);
      Topbolt5 = new ModelRenderer(this, 0, 36);
      Topbolt5.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt5.setRotationPoint(-0.5F, 9.5F, 5.5F);
      Topbolt5.setTextureSize(64, 64);
      Topbolt5.mirror = true;
      setRotation(Topbolt5, 0F, 0F, 0F);
      Topbolt6 = new ModelRenderer(this, 0, 36);
      Topbolt6.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt6.setRotationPoint(5.5F, 9.5F, -0.5F);
      Topbolt6.setTextureSize(64, 64);
      Topbolt6.mirror = true;
      setRotation(Topbolt6, 0F, 0F, 0F);
      Topbolt7 = new ModelRenderer(this, 0, 36);
      Topbolt7.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt7.setRotationPoint(5.5F, 9.5F, 5.5F);
      Topbolt7.setTextureSize(64, 64);
      Topbolt7.mirror = true;
      setRotation(Topbolt7, 0F, 0F, 0F);
      Topbolt8 = new ModelRenderer(this, 0, 36);
      Topbolt8.addBox(0F, 0F, 0F, 1, 1, 1);
      Topbolt8.setRotationPoint(5.5F, 9.5F, -6.5F);
      Topbolt8.setTextureSize(64, 64);
      Topbolt8.mirror = true;
      setRotation(Topbolt8, 0F, 0F, 0F);
      Topplate1 = new ModelRenderer(this, 0, 38);
      Topplate1.addBox(0F, 0F, 0F, 3, 1, 3);
      Topplate1.setRotationPoint(-1.5F, 9.5F, -1.5F);
      Topplate1.setTextureSize(64, 64);
      Topplate1.mirror = true;
      setRotation(Topplate1, 0F, 0F, 0F);
      ClawBase1 = new ModelRenderer(this, 4, 35);
      ClawBase1.addBox(0F, 0F, 0F, 1, 2, 1);
      ClawBase1.setRotationPoint(2.5F, 8.5F, -0.5F);
      ClawBase1.setTextureSize(64, 64);
      ClawBase1.mirror = true;
      setRotation(ClawBase1, 0F, 0F, 0.5934119F);
      ClawBase2 = new ModelRenderer(this, 4, 35);
      ClawBase2.addBox(0F, 0F, 0F, 1, 2, 1);
      ClawBase2.setRotationPoint(0.5F, 8.5F, 2.5F);
      ClawBase2.setTextureSize(64, 64);
      ClawBase2.mirror = true;
      setRotation(ClawBase2, 0F, -1.570796F, 0.5934119F);
      ClawBase3 = new ModelRenderer(this, 4, 35);
      ClawBase3.addBox(0F, 0F, 0F, 1, 2, 1);
      ClawBase3.setRotationPoint(-0.5F, 08.5F, -2.5F);
      ClawBase3.setTextureSize(64, 64);
      ClawBase3.mirror = true;
      setRotation(ClawBase3, 0F, 1.570796F, 0.5934119F);
      ClawBase4 = new ModelRenderer(this, 4, 35);
      ClawBase4.addBox(0F, 0F, 0F, 1, 2, 1);
      ClawBase4.setRotationPoint(-2.5F, 8.5F, 0.5F);
      ClawBase4.setTextureSize(64, 64);
      ClawBase4.mirror = true;
      setRotation(ClawBase4, 0F, 3.141593F, 0.5934119F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Tabletop.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    Topbolt1.render(f5);
    Topbolt2.render(f5);
    Topbolt3.render(f5);
    Topbolt4.render(f5);
    Topbolt5.render(f5);
    Topbolt6.render(f5);
    Topbolt7.render(f5);
    Topbolt8.render(f5);
    Topplate1.render(f5);
    ClawBase1.render(f5);
    ClawBase2.render(f5);
    ClawBase3.render(f5);
    ClawBase4.render(f5);
  }
  
  public void renderModel(float f) {
	   Tabletop.render(f);
	   leg1.render(f);
	   leg2.render(f);
	   leg3.render(f);
	   leg4.render(f);
	   Topbolt1.render(f);
	   Topbolt2.render(f);
	   Topbolt3.render(f);
	   Topbolt4.render(f);
	   Topbolt5.render(f);
	   Topbolt6.render(f);
	   Topbolt7.render(f);
	   Topbolt8.render(f);
	   Topplate1.render(f);
	   ClawBase1.render(f);
	   ClawBase2.render(f);
	   ClawBase3.render(f);
	   ClawBase4.render(f);	  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
