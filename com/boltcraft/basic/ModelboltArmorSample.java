package com.boltcraft.basic;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelboltArmorSample extends ModelBiped
{
  //fields
   

    ModelRenderer plateback;
    ModelRenderer platefront;
    ModelRenderer plateright;
    ModelRenderer plateleft;
    ModelRenderer platerightlegfront;
    ModelRenderer plateleftlegfront;
    ModelRenderer plateheadtop;
    ModelRenderer plateheadleft;
    ModelRenderer plateheadright;
    ModelRenderer plateheadbacklow;
    ModelRenderer plateheadfronttop;
    ModelRenderer plateheadfrontleft;
    ModelRenderer plateheadfrontright;
    ModelRenderer plateheadfrontrighttop;
    ModelRenderer plateheadfrontlefttop;
    ModelRenderer boltplateback1;
    ModelRenderer boltplateback2;
    ModelRenderer boltplateback3;
    ModelRenderer boltplateback4;
    ModelRenderer boltplateback5;
    ModelRenderer boltplateback6;
    ModelRenderer boltplateback7;
    ModelRenderer boltplateback8;
    ModelRenderer boltplatefrontplate1;
    ModelRenderer boltplatefrontplate2;
    ModelRenderer boltplatefrontplate3;
    ModelRenderer boltplatefrontplate4;
    ModelRenderer boltplatefrontplate5;
    ModelRenderer boltleftlegfront;
    ModelRenderer boltrightlegfront;
    ModelRenderer boltarmrightfront;
    ModelRenderer boltarmrightback;
    ModelRenderer boltarmleftback;
    ModelRenderer boltarmleftfront;
    ModelRenderer boltarmleftbackup;
    ModelRenderer boltarmleftfrontup;
    ModelRenderer boltarmrightfrontup;
    ModelRenderer boltarmrightbackup;
    ModelRenderer boltarmrightupside;
    ModelRenderer boltarmleftupside;
  
  public ModelboltArmorSample(float expand)
  {

	  super(expand, 0, 64, 64);
    
     
      plateback = new ModelRenderer(this, 0, 32);
      plateback.addBox(-3F, 1F, 2F, 6, 10, 1, expand);
      plateback.setRotationPoint(0F, 0F, 0F);
      plateback.setTextureSize(64, 64);
      plateback.mirror = true;
      setRotation(plateback, 0F, 0F, 0F);
      platefront = new ModelRenderer(this, 14, 32);
      platefront.addBox(-3F, 1F, -3F, 6, 10, 1, expand);
      platefront.setRotationPoint(0F, 0F, 0F);
      platefront.setTextureSize(64, 64);
      platefront.mirror = true;
      setRotation(platefront, 0F, 0F, 0F);
      plateright = new ModelRenderer(this, 22, 43);
      plateright.addBox(-4F, -3F, -3F, 5, 5, 6, expand);
      plateright.setRotationPoint(-5F, 2F, 0F);
      plateright.setTextureSize(64, 64);
      plateright.mirror = true;
      setRotation(plateright, 0F, 0F, 0F);
      plateleft = new ModelRenderer(this, 0, 43);
      plateleft.addBox(-1F, -3F, -3F, 5, 5, 6, expand);
      plateleft.setRotationPoint(5F, 2F, 0F);
      plateleft.setTextureSize(64, 64);
      plateleft.mirror = true;
      setRotation(plateleft, 0F, 0F, 0F);
      platerightlegfront = new ModelRenderer(this, 28, 32);
      platerightlegfront.addBox(-2F, 3F, -3F, 4, 4, 1, expand);
      platerightlegfront.setRotationPoint(-2F, 12F, 0F);
      platerightlegfront.setTextureSize(64, 64);
      platerightlegfront.mirror = true;
      setRotation(platerightlegfront, 0F, 0F, 0F);
      plateleftlegfront = new ModelRenderer(this, 28, 37);
      plateleftlegfront.addBox(-2F, 3F, -3F, 4, 4, 1, expand);
      plateleftlegfront.setRotationPoint(2F, 12F, 0F);
      plateleftlegfront.setTextureSize(64, 64);
      plateleftlegfront.mirror = true;
      setRotation(plateleftlegfront, 0F, 0F, 0F);
      plateheadtop = new ModelRenderer(this, 0, 54);
      plateheadtop.addBox(-2F, -8.5F, -4F, 4, 1, 8, expand);
      plateheadtop.setRotationPoint(0F, 0F, 0F);
      plateheadtop.setTextureSize(64, 64);
      plateheadtop.mirror = true;
      setRotation(plateheadtop, 0F, 0F, 0F);
      plateheadleft = new ModelRenderer(this, 46, 32);
      plateheadleft.addBox(3.5F, -6F, -4F, 1, 3, 8, expand);
      plateheadleft.setRotationPoint(0F, 0F, 0F);
      plateheadleft.setTextureSize(64, 64);
      plateheadleft.mirror = true;
      setRotation(plateheadleft, 0F, 0F, 0F);
      plateheadright = new ModelRenderer(this, 46, 43);
      plateheadright.addBox(-4.5F, -6F, -4F, 1, 3, 8, expand);
      plateheadright.setRotationPoint(0F, 0F, 0F);
      plateheadright.setTextureSize(64, 64);
      plateheadright.mirror = true;
      setRotation(plateheadright, 0F, 0F, 0F);
      plateheadbacklow = new ModelRenderer(this, 24, 54);
      plateheadbacklow.addBox(-4F, -6F, 3.5F, 8, 3, 1, expand);
      plateheadbacklow.setRotationPoint(0F, 0F, 0F);
      plateheadbacklow.setTextureSize(64, 64);
      plateheadbacklow.mirror = true;
      setRotation(plateheadbacklow, 0F, 0F, 0F);
      plateheadbacklow = new ModelRenderer(this, 24, 58);
      plateheadbacklow.addBox(-2F, -8F, 3.5F, 4, 2, 1, expand);
      plateheadbacklow.setRotationPoint(0F, 0F, 0F);
      plateheadbacklow.setTextureSize(64, 64);
      plateheadbacklow.mirror = true;
      setRotation(plateheadbacklow, 0F, 0F, 0F);
      plateheadfronttop = new ModelRenderer(this, 24, 61);
      plateheadfronttop.addBox(-2F, -8F, -4.366667F, 4, 1, 1, expand);
      plateheadfronttop.setRotationPoint(0F, 0F, 0F);
      plateheadfronttop.setTextureSize(64, 64);
      plateheadfronttop.mirror = true;
      setRotation(plateheadfronttop, 0F, 0F, 0F);
      plateheadfrontleft = new ModelRenderer(this, 34, 58);
      plateheadfrontleft.addBox(3F, -6F, -4.5F, 1, 3, 1, expand);
      plateheadfrontleft.setRotationPoint(0F, 0F, 0F);
      plateheadfrontleft.setTextureSize(64, 64);
      plateheadfrontleft.mirror = true;
      setRotation(plateheadfrontleft, 0F, 0F, 0F);
      plateheadfrontright = new ModelRenderer(this, 38, 58);
      plateheadfrontright.addBox(-4F, -6F, -4.5F, 1, 3, 1, expand);
      plateheadfrontright.setRotationPoint(0F, 0F, 0F);
      plateheadfrontright.setTextureSize(64, 64);
      plateheadfrontright.mirror = true;
      setRotation(plateheadfrontright, 0F, 0F, 0F);
      plateheadfrontrighttop = new ModelRenderer(this, 34, 62);
      plateheadfrontrighttop.addBox(-3.5F, -7F, -4.5F, 2, 1, 1, expand);
      plateheadfrontrighttop.setRotationPoint(0F, 0F, 0F);
      plateheadfrontrighttop.setTextureSize(64, 64);
      plateheadfrontrighttop.mirror = true;
      setRotation(plateheadfrontrighttop, 0F, 0F, 0F);
      plateheadfrontlefttop = new ModelRenderer(this, 40, 62);
      plateheadfrontlefttop.addBox(1.5F, -7F, -4.5F, 2, 1, 1, expand);
      plateheadfrontlefttop.setRotationPoint(0F, 0F, 0F);
      plateheadfrontlefttop.setTextureSize(64, 64);
      plateheadfrontlefttop.mirror = true;
      setRotation(plateheadfrontlefttop, 0F, 0F, 0F);
      boltplateback1 = new ModelRenderer(this, 32, 0);
      boltplateback1.addBox(1.5F, 1.5F, 2.5F, 1, 1, 1, expand);
      boltplateback1.setRotationPoint(0F, 0F, 0F);
      boltplateback1.setTextureSize(64, 64);
      boltplateback1.mirror = true;
      setRotation(boltplateback1, 0F, 0F, 0F);
      boltplateback2 = new ModelRenderer(this, 32, 0);
      boltplateback2.addBox(-2.5F, 1.5F, 2.5F, 1, 1, 1, expand);
      boltplateback2.setRotationPoint(0F, 0F, 0F);
      boltplateback2.setTextureSize(64, 64);
      boltplateback2.mirror = true;
      setRotation(boltplateback2, 0F, 0F, 0F);
      boltplateback3 = new ModelRenderer(this, 32, 0);
      boltplateback3.addBox(1.466667F, 9.466666F, 2.5F, 1, 1, 1, expand);
      boltplateback3.setRotationPoint(0F, 0F, 0F);
      boltplateback3.setTextureSize(64, 64);
      boltplateback3.mirror = true;
      setRotation(boltplateback3, 0F, 0F, 0F);
      boltplateback4 = new ModelRenderer(this, 32, 0);
      boltplateback4.addBox(-2.5F, 9.5F, 2.5F, 1, 1, 1, expand);
      boltplateback4.setRotationPoint(0F, 0F, 0F);
      boltplateback4.setTextureSize(64, 64);
      boltplateback4.mirror = true;
      setRotation(boltplateback4, 0F, 0F, 0F);
      boltplateback5 = new ModelRenderer(this, 32, 0);
      boltplateback5.addBox(1F, 7F, 2.5F, 1, 1, 1, expand);
      boltplateback5.setRotationPoint(0F, 0F, 0F);
      boltplateback5.setTextureSize(64, 64);
      boltplateback5.mirror = true;
      setRotation(boltplateback5, 0F, 0F, 0F);
      boltplateback6 = new ModelRenderer(this, 32, 0);
      boltplateback6.addBox(1F, 4F, 2.5F, 1, 1, 1, expand);
      boltplateback6.setRotationPoint(0F, 0F, 0F);
      boltplateback6.setTextureSize(64, 64);
      boltplateback6.mirror = true;
      setRotation(boltplateback6, 0F, 0F, 0F);
      boltplateback7 = new ModelRenderer(this, 32, 0);
      boltplateback7.addBox(-2F, 7F, 2.5F, 1, 1, 1, expand);
      boltplateback7.setRotationPoint(0F, 0F, 0F);
      boltplateback7.setTextureSize(64, 64);
      boltplateback7.mirror = true;
      setRotation(boltplateback7, 0F, 0F, 0F);
      boltplateback8 = new ModelRenderer(this, 32, 0);
      boltplateback8.addBox(-2F, 4F, 2.5F, 1, 1, 1, expand);
      boltplateback8.setRotationPoint(0F, 0F, 0F);
      boltplateback8.setTextureSize(64, 64);
      boltplateback8.mirror = true;
      setRotation(boltplateback8, 0F, 0F, 0F);
      boltplatefrontplate1 = new ModelRenderer(this, 32, 2);
      boltplatefrontplate1.addBox(-1.5F, 1.5F, -3.5F, 3, 1, 1, expand);
      boltplatefrontplate1.setRotationPoint(0F, 0F, 0F);
      boltplatefrontplate1.setTextureSize(64, 64);
      boltplatefrontplate1.mirror = true;
      setRotation(boltplatefrontplate1, 0F, 0F, 0F);
      boltplatefrontplate2 = new ModelRenderer(this, 32, 4);
      boltplatefrontplate2.addBox(-2.5F, 3F, -3.5F, 5, 3, 1, expand);
      boltplatefrontplate2.setRotationPoint(0F, 0F, 0F);
      boltplatefrontplate2.setTextureSize(64, 64);
      boltplatefrontplate2.mirror = true;
      setRotation(boltplatefrontplate2, 0F, 0F, 0F);
      boltplatefrontplate3 = new ModelRenderer(this, 32, 2);
      boltplatefrontplate3.addBox(-1.5F, 6.5F, -3.5F, 3, 1, 1, expand);
      boltplatefrontplate3.setRotationPoint(0F, 0F, 0F);
      boltplatefrontplate3.setTextureSize(64, 64);
      boltplatefrontplate3.mirror = true;
      setRotation(boltplatefrontplate3, 0F, 0F, 0F);
      boltplatefrontplate4 = new ModelRenderer(this, 32, 10);
      boltplatefrontplate4.addBox(-2F, 8F, -3.5F, 4, 1, 1, expand);
      boltplatefrontplate4.setRotationPoint(0F, 0F, 0F);
      boltplatefrontplate4.setTextureSize(64, 64);
      boltplatefrontplate4.mirror = true;
      setRotation(boltplatefrontplate4, 0F, 0F, 0F);
      boltplatefrontplate5 = new ModelRenderer(this, 32, 8);
      boltplatefrontplate5.addBox(-2.5F, 9.5F, -3.5F, 5, 1, 1, expand);
      boltplatefrontplate5.setRotationPoint(0F, 0F, 0F);
      boltplatefrontplate5.setTextureSize(64, 64);
      boltplatefrontplate5.mirror = true;
      setRotation(boltplatefrontplate5, 0F, 0F, 0F);
      boltleftlegfront = new ModelRenderer(this, 38, 35);
      boltleftlegfront.addBox(-1.5F, 4F, -3.5F, 3, 2, 1, expand);
      boltleftlegfront.setRotationPoint(0F, 0F, 0F);
      boltleftlegfront.setTextureSize(64, 64);
      boltleftlegfront.mirror = true;
      setRotation(boltleftlegfront, 0F, 0F, 0F);
      boltrightlegfront = new ModelRenderer(this, 38, 32);
      boltrightlegfront.addBox(-1.5F, 4F, -3.5F, 3, 2, 1, expand);
      boltrightlegfront.setRotationPoint(0F, 0F, 0F);
      boltrightlegfront.setTextureSize(64, 64);
      boltrightlegfront.mirror = true;
      setRotation(boltrightlegfront, 0F, 0F, 0F);
      boltarmrightfront = new ModelRenderer(this, 32, 12);
      boltarmrightfront.addBox(-2.5F, -0.5F, -3.5F, 3, 2, 1, expand);
      boltarmrightfront.setRotationPoint(0F, 0F, 0F);
      boltarmrightfront.setTextureSize(64, 64);
      boltarmrightfront.mirror = true;
      setRotation(boltarmrightfront, 0F, 0F, 0F);
      boltarmrightback = new ModelRenderer(this, 32, 12);
      boltarmrightback.addBox(-2.5F, -0.5F, 2.5F, 3, 2, 1, expand);
      boltarmrightback.setRotationPoint(0F, 0F, 0F);
      boltarmrightback.setTextureSize(64, 64);
      boltarmrightback.mirror = true;
      setRotation(boltarmrightback, 0F, 0F, 0F);
      boltarmleftback = new ModelRenderer(this, 32, 12);
      boltarmleftback.addBox(-0.5F, -0.5F, 2.5F, 3, 2, 1, expand);
      boltarmleftback.setRotationPoint(0F, 0F, 0F);
      boltarmleftback.setTextureSize(64, 64);
      boltarmleftback.mirror = true;
      setRotation(boltarmleftback, 0F, 0F, 0F);
      boltarmleftfront = new ModelRenderer(this, 32, 12);
      boltarmleftfront.addBox(-0.5F, -0.5F, -3.5F, 3, 2, 1, expand);
      boltarmleftfront.setRotationPoint(0F, 0F, 0F);
      boltarmleftfront.setTextureSize(64, 64);
      boltarmleftfront.mirror = true;
      setRotation(boltarmleftfront, 0F, 0F, 0F);
      boltarmleftbackup = new ModelRenderer(this, 40, 12);
      boltarmleftbackup.addBox(1.5F, -2F, 2.5F, 2, 1, 1, expand);
      boltarmleftbackup.setRotationPoint(0F, 0F, 0F);
      boltarmleftbackup.setTextureSize(64, 64);
      boltarmleftbackup.mirror = true;
      setRotation(boltarmleftbackup, 0F, 0F, 0F);
      boltarmleftfrontup = new ModelRenderer(this, 40, 12);
      boltarmleftfrontup.addBox(1.5F, -2F, -3.5F, 2, 1, 1, expand);
      boltarmleftfrontup.setRotationPoint(0F, 0F, 0F);
      boltarmleftfrontup.setTextureSize(64, 64);
      boltarmleftfrontup.mirror = true;
      setRotation(boltarmleftfrontup, 0F, 0F, 0F);
      boltarmrightfrontup = new ModelRenderer(this, 40, 12);
      boltarmrightfrontup.addBox(-3.5F, -2F, -3.5F, 2, 1, 1, expand);
      boltarmrightfrontup.setRotationPoint(0F, 0F, 0F);
      boltarmrightfrontup.setTextureSize(64, 64);
      boltarmrightfrontup.mirror = true;
      setRotation(boltarmrightfrontup, 0F, 0F, 0F);
      boltarmrightbackup = new ModelRenderer(this, 40, 12);
      boltarmrightbackup.addBox(-3.5F, -2F, 2.5F, 2, 1, 1, expand);
      boltarmrightbackup.setRotationPoint(0F, 0F, 0F);
      boltarmrightbackup.setTextureSize(64, 64);
      boltarmrightbackup.mirror = true;
      setRotation(boltarmrightbackup, 0F, 0F, 0F);
      boltarmrightupside = new ModelRenderer(this, 46, 10);
      boltarmrightupside.addBox(-4.5F, -3.5F, -2F, 3, 2, 4, expand);
      boltarmrightupside.setRotationPoint(0F, 0F, 0F);
      boltarmrightupside.setTextureSize(64, 64);
      boltarmrightupside.mirror = true;
      setRotation(boltarmrightupside, 0F, 0F, 0F);
      boltarmleftupside = new ModelRenderer(this, 46, 10);
      boltarmleftupside.addBox(1.5F, -3.5F, -2F, 3, 2, 4, expand);
      boltarmleftupside.setRotationPoint(0F, 0F, 0F);
      boltarmleftupside.setTextureSize(64, 64);
      boltarmleftupside.mirror = true;
      setRotation(boltarmleftupside, 0F, 0F, 0F);
      
      //Fixing shapes!
      
  	//Body shapes
      plateback.addChild(boltplateback1);
      plateback.addChild(boltplateback2);
      plateback.addChild(boltplateback3);
      plateback.addChild(boltplateback4);
      plateback.addChild(boltplateback5);
      plateback.addChild(boltplateback6);
      plateback.addChild(boltplateback7);
      plateback.addChild(boltplateback8);
      platefront.addChild(boltplatefrontplate1);
      platefront.addChild(boltplatefrontplate2);
      platefront.addChild(boltplatefrontplate3);
      platefront.addChild(boltplatefrontplate4);
      platefront.addChild(boltplatefrontplate5);
      this.bipedBody.addChild(plateback);
      this.bipedBody.addChild(platefront);
        
      //Head shapes
      this.bipedHead.addChild(plateheadtop);
      this.bipedHead.addChild(plateheadleft);
      this.bipedHead.addChild(plateheadright);
      this.bipedHead.addChild(plateheadbacklow);
      this.bipedHead.addChild(plateheadfronttop);
      this.bipedHead.addChild(plateheadfrontleft);
      this.bipedHead.addChild(plateheadfrontright);
      this.bipedHead.addChild(plateheadfrontrighttop);
      this.bipedHead.addChild(plateheadfrontlefttop);
     
      //Left arm shapes
      plateleft.addChild(boltarmleftfront);
      plateleft.addChild(boltarmleftback);
      plateleft.addChild(boltarmleftfrontup);
      plateleft.addChild(boltarmleftbackup);
      plateleft.addChild(boltarmleftupside);
      this.bipedLeftArm.addChild(plateleft);
      
      //Right arm shapes
      plateright.addChild(boltarmrightfront);
      plateright.addChild(boltarmrightback);
      plateright.addChild(boltarmrightfrontup);
      plateright.addChild(boltarmrightbackup);
      plateright.addChild(boltarmrightupside);
      this.bipedRightArm.addChild(plateright);
      
      //Left leg shapes
      plateleftlegfront.addChild(boltleftlegfront);
      this.bipedLeftLeg.addChild(plateleftlegfront);
      
      //Right leg shapes
      platerightlegfront.addChild(boltrightlegfront);
      this.bipedRightLeg.addChild(platerightlegfront);
  	
      
      
      
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  
}

 
