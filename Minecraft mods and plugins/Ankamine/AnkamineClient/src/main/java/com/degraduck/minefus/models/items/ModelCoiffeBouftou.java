package com.degraduck.minefus.models.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoiffeBouftou
  extends ModelBiped
{
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;
  ModelRenderer Shape5;
  ModelRenderer Shape6;
  ModelRenderer Shape7;
  ModelRenderer Shape8;
  ModelRenderer Shape9;
  ModelRenderer Shape10;
  ModelRenderer Shape11;
  ModelRenderer Shape12;
  ModelRenderer Shape13;
  ModelRenderer Shape14;
  ModelRenderer Shape15;
  ModelRenderer Shape16;
  ModelRenderer Shape17;
  
  public ModelCoiffeBouftou(float f)
  {
    super(f, 0.0F, 64, 64);
    textureWidth = 64;
    textureHeight = 64;
    
    Shape1 = new ModelRenderer(this, 20, 42);
    Shape1.addBox(-4.5F, -8.0F, -4.5F, 9, 3, 1);
    Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape1.setTextureSize(64, 64);
    Shape1.mirror = true;
    setRotation(Shape1, 0.0F, 0.0F, 0.0F);
    Shape2 = new ModelRenderer(this, 0, 32);
    Shape2.addBox(-4.0F, -9.0F, -4.0F, 8, 1, 8);
    Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape2.setTextureSize(64, 64);
    Shape2.mirror = true;
    setRotation(Shape2, 0.0F, 0.0F, 0.0F);
    Shape3 = new ModelRenderer(this, 0, 48);
    Shape3.addBox(-5.0F, -8.0F, -4.0F, 1, 5, 8);
    Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape3.setTextureSize(64, 64);
    Shape3.mirror = true;
    setRotation(Shape3, 0.0F, 0.0F, 0.0F);
    Shape4 = new ModelRenderer(this, 26, 32);
    Shape4.addBox(-5.0F, -3.0F, -2.5F, 1, 2, 4);
    Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape4.setTextureSize(64, 64);
    Shape4.mirror = true;
    setRotation(Shape4, 0.0F, 0.0F, 0.0F);
    Shape5 = new ModelRenderer(this, 35, 55);
    Shape5.addBox(-4.0F, -8.0F, 4.0F, 8, 5, 1);
    Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape5.setTextureSize(64, 64);
    Shape5.mirror = true;
    setRotation(Shape5, 0.0F, 0.0F, 0.0F);
    Shape6 = new ModelRenderer(this, 0, 48);
    Shape6.addBox(4.0F, -8.0F, -4.0F, 1, 5, 8);
    Shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape6.setTextureSize(64, 64);
    Shape6.mirror = true;
    setRotation(Shape6, 0.0F, 0.0F, 0.0F);
    Shape7 = new ModelRenderer(this, 26, 32);
    Shape7.addBox(4.0F, -3.0F, -2.5F, 1, 2, 4);
    Shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape7.setTextureSize(64, 64);
    Shape7.mirror = true;
    setRotation(Shape7, 0.0F, 0.0F, 0.0F);
    Shape8 = new ModelRenderer(this, 0, 41);
    Shape8.addBox(-3.0F, -9.5F, -3.0F, 6, 1, 6);
    Shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape8.setTextureSize(64, 64);
    Shape8.mirror = true;
    setRotation(Shape8, 0.0F, 0.0F, 0.0F);
    Shape9 = new ModelRenderer(this, 28, 47);
    Shape9.addBox(-4.0F, -7.5F, -5.0F, 8, 2, 1);
    Shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape9.setTextureSize(64, 64);
    Shape9.mirror = true;
    setRotation(Shape9, 0.0F, 0.0F, 0.0F);
    Shape10 = new ModelRenderer(this, 37, 37);
    Shape10.addBox(-3.0F, -7.5F, 4.5F, 6, 3, 1);
    Shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape10.setTextureSize(64, 64);
    Shape10.mirror = true;
    setRotation(Shape10, 0.0F, 0.0F, 0.0F);
    Shape11 = new ModelRenderer(this, 18, 50);
    Shape11.addBox(-5.5F, -7.5F, -3.5F, 1, 4, 7);
    Shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape11.setTextureSize(64, 64);
    Shape11.mirror = true;
    setRotation(Shape11, 0.0F, 0.0F, 0.0F);
    Shape12 = new ModelRenderer(this, 18, 50);
    Shape12.addBox(4.5F, -7.5F, -3.5F, 1, 4, 7);
    Shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape12.setTextureSize(64, 64);
    Shape12.mirror = true;
    setRotation(Shape12, 0.0F, 0.0F, 0.0F);
    Shape13 = new ModelRenderer(this, 14, 51);
    Shape13.addBox(-1.0F, -5.5F, -4.7F, 2, 2, 1);
    Shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape13.setTextureSize(64, 64);
    Shape13.mirror = true;
    setRotation(Shape13, 0.0F, 0.0F, 0.0F);
    Shape14 = new ModelRenderer(this, 47, 47);
    Shape14.addBox(-8.0F, -8.5F, -0.5F, 4, 2, 2);
    Shape14.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape14.setTextureSize(64, 64);
    Shape14.mirror = true;
    setRotation(Shape14, 0.0F, 0.0F, 0.0F);
    Shape15 = new ModelRenderer(this, 55, 52);
    Shape15.addBox(-8.5F, -9.3F, 0.0F, 1, 2, 1);
    Shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape15.setTextureSize(64, 64);
    Shape15.mirror = true;
    setRotation(Shape15, 0.0F, 0.0F, 0.0F);
    Shape16 = new ModelRenderer(this, 42, 42);
    Shape16.addBox(4.0F, -8.5F, -0.5F, 4, 2, 2);
    Shape16.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape16.setTextureSize(64, 64);
    Shape16.mirror = true;
    setRotation(Shape16, 0.0F, 0.0F, 0.0F);
    Shape17 = new ModelRenderer(this, 55, 42);
    Shape17.addBox(7.5F, -9.3F, 0.0F, 1, 2, 1);
    Shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
    Shape17.setTextureSize(64, 64);
    Shape17.mirror = true;
    setRotation(Shape17, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
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
    
    Shape1.rotateAngleY = (f3 / 57.295776F);
    Shape1.rotateAngleX = (f4 / 57.295776F);
    Shape2.rotateAngleY = (f3 / 57.295776F);
    Shape2.rotateAngleX = (f4 / 57.295776F);
    Shape3.rotateAngleY = (f3 / 57.295776F);
    Shape3.rotateAngleX = (f4 / 57.295776F);
    Shape4.rotateAngleY = (f3 / 57.295776F);
    Shape4.rotateAngleX = (f4 / 57.295776F);
    Shape5.rotateAngleY = (f3 / 57.295776F);
    Shape5.rotateAngleX = (f4 / 57.295776F);
    Shape6.rotateAngleY = (f3 / 57.295776F);
    Shape6.rotateAngleX = (f4 / 57.295776F);
    Shape7.rotateAngleY = (f3 / 57.295776F);
    Shape7.rotateAngleX = (f4 / 57.295776F);
    Shape8.rotateAngleY = (f3 / 57.295776F);
    Shape8.rotateAngleX = (f4 / 57.295776F);
    Shape9.rotateAngleY = (f3 / 57.295776F);
    Shape9.rotateAngleX = (f4 / 57.295776F);
    Shape10.rotateAngleY = (f3 / 57.295776F);
    Shape10.rotateAngleX = (f4 / 57.295776F);
    Shape11.rotateAngleY = (f3 / 57.295776F);
    Shape11.rotateAngleX = (f4 / 57.295776F);
    Shape12.rotateAngleY = (f3 / 57.295776F);
    Shape12.rotateAngleX = (f4 / 57.295776F);
    Shape13.rotateAngleY = (f3 / 57.295776F);
    Shape13.rotateAngleX = (f4 / 57.295776F);
    Shape14.rotateAngleY = (f3 / 57.295776F);
    Shape14.rotateAngleX = (f4 / 57.295776F);
    Shape15.rotateAngleY = (f3 / 57.295776F);
    Shape15.rotateAngleX = (f4 / 57.295776F);
    Shape16.rotateAngleY = (f3 / 57.295776F);
    Shape16.rotateAngleX = (f4 / 57.295776F);
    Shape17.rotateAngleY = (f3 / 57.295776F);
    Shape17.rotateAngleX = (f4 / 57.295776F);
  }
}
