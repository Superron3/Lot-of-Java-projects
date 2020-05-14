package com.minefus.degraduck.render.mobs;

import org.lwjgl.opengl.GL11;

import com.minefus.degraduck.common.Minefus;
import com.minefus.degraduck.entity.EntitySickedTofu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderSickedTofu extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation(Minefus.MODID + ":textures/entity/Sicked tofu.png");

    public RenderSickedTofu(ModelBase model, float f)
    {
        super(model, f);
    }

    protected ResourceLocation getEntityTexture(EntitySickedTofu entity)
    {
        return texture;
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return getEntityTexture((EntitySickedTofu)entity);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        scaleMobTofuMalade((EntitySickedTofu)entity, f);
    }

    protected void scaleMobTofuMalade(EntitySickedTofu entity, float f)
    {
        switch(entity.mobSizeGen)
        {
            case 0:
                GL11.glScalef(0.7F, 0.7F, 0.7F);
                break;
            case 1:
                GL11.glScalef(0.725F, 0.725F, 0.725F);
                break;
            case 2:
                GL11.glScalef(0.75F, 0.75F, 0.75F);
                break;
            case 3:
                GL11.glScalef(0.775F, 0.775F, 0.775F);
                break;
            case 4:
                GL11.glScalef(0.8F, 0.8F, 0.8F);
                break;
            default:
                GL11.glScalef(0.75F, 0.75F, 0.75F);
        }
    }
}