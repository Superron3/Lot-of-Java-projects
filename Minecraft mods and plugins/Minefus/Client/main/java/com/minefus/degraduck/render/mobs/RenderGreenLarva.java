package com.minefus.degraduck.render.mobs;

import org.lwjgl.opengl.GL11;

import com.minefus.degraduck.common.Minefus;
import com.minefus.degraduck.entity.EntityGreenLarva;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderGreenLarva extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation(Minefus.MODID + ":textures/entity/Green larva.png");

    public RenderGreenLarva(ModelBase model, float f)
    {
        super(model, f);
    }

    protected ResourceLocation getEntityTexture(EntityGreenLarva entity)
    {
        return texture;
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return getEntityTexture((EntityGreenLarva)entity);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        scaleMobLarveVerte((EntityGreenLarva)entity, f);
    }

    protected void scaleMobLarveVerte(EntityGreenLarva entity, float f)
    {
        switch(entity.mobSizeGen)
        {
            case 0:
                GL11.glScalef(0.8F, 0.8F, 0.8F);
                break;
            case 1:
                GL11.glScalef(0.825F, 0.825F, 0.825F);
                break;
            case 2:
                GL11.glScalef(0.85F, 0.85F, 0.85F);
                break;
            case 3:
                GL11.glScalef(0.875F, 0.875F, 0.875F);
                break;
            case 4:
                GL11.glScalef(0.9F, 0.9F, 0.9F);
                break;
            default:
                GL11.glScalef(0.85F, 0.85F, 0.85F);
        }
    }
}