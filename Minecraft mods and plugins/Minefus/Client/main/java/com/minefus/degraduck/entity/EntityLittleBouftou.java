package com.minefus.degraduck.entity;

import com.minefus.degraduck.common.Minefus;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityLittleBouftou extends EntityMob
{
    public int mobSizeGen;

    public EntityLittleBouftou(World world)
    {
        super(world);
        mobSizeGen = ((int)Math.round(Math.random() * 5));
        setCustomNameTag(I18n.format("entity.little_bouftou.name"));
        setSize(0.7F, 0.7F);
    }

    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(22);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.24D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
    }

    protected Entity findPlayerToAttack()
    {
        EntityPlayer entityplayer = worldObj.getClosestVulnerablePlayerToEntity(this, 1);
        return (entityplayer != null) && (canEntityBeSeen(entityplayer)) ? entityplayer : null;
    }

    public String getHurtSound()
    {
        return Minefus.MODID + ":Bouftou hurt";
    }

    public String getDeathSound()
    {
        return Minefus.MODID + ":Bouftou death";
    }

    public String getLivingSound()
    {
        return Minefus.MODID + ":Bouftou living";
    }

    public boolean attackEntityFrom(DamageSource damage, float f)
    {
        if(isEntityInvulnerable())
            return false;
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.24D);
        return super.attackEntityFrom(damage, f);
    }
}