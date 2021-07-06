package com.thorfusion.titanpower.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCustomArmor extends ModelBiped
{
    ModelRenderer basehorn;
    ModelRenderer horn1;
    ModelRenderer rightshoulder;
    ModelRenderer leftshoulder;
  
  public ModelCustomArmor(float expand) {
	  
	  super(expand, 0, 64, 64);
 
      basehorn = new ModelRenderer(this, 38, 0);
      basehorn.addBox(-1F, -9F, -4.5F, 2, 2, 2, expand);
      basehorn.setRotationPoint(0F, 0F, 0F);
      basehorn.setTextureSize(64, 32);
      basehorn.mirror = true;
      setRotation(basehorn, 0F, 0F, 0F);
      
      horn1 = new ModelRenderer(this, 33, 0);
      horn1.addBox(-0.5F, -14.5F, 0.7666667F, 1, 5, 1, expand/3);
      horn1.setRotationPoint(0F, 0F, 0F);
      horn1.setTextureSize(64, 32);
      horn1.mirror = true;
      setRotation(horn1, 0.5576792F, 0F, 0F);
      
      rightshoulder = new ModelRenderer(this, 0, 33);
      rightshoulder.addBox(-3.5F, -3F, -2.5F, 5, 5, 5, expand/1.2F);
      rightshoulder.setRotationPoint(0F, 0F, 0F);
      rightshoulder.setTextureSize(64, 32);
      rightshoulder.mirror = true;
      setRotation(rightshoulder, 0F, 0F, 0F);
      
      leftshoulder = new ModelRenderer(this, 0, 33);
      leftshoulder.addBox(-1.5F, -3F, -2.5F, 5, 5, 5, expand/1.2F);
      leftshoulder.setRotationPoint(0F, 0F, 0F);
      leftshoulder.setTextureSize(64, 32);
      leftshoulder.mirror = true;
      setRotation(leftshoulder, 0F, 0F, 0F);
      
      basehorn.addChild(horn1);
      this.bipedHead.addChild(basehorn);
      
      this.bipedRightArm.addChild(rightshoulder);
      this.bipedLeftArm.addChild(leftshoulder);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
