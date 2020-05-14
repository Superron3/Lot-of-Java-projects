package com.minefus.degraduck.entity;

import com.minefus.degraduck.common.Minefus;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityChampchamp extends EntityMob
{
    public int mobSizeGen;

    public EntityChampchamp(World world)
    {
        super(world);
        mobSizeGen = ((int)Math.round(Math.random() * 5));
        setCustomNameTag(I18n.format("entity.champ_champ.name"));
        setSize(0.7F, 0.7F);
    }

    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(28);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.21D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
    }

    protected Entity findPlayerToAttack()
    {
        EntityPlayer entityplayer = worldObj.getClosestVulnerablePlayerToEntity(this, 1);
        return (entityplayer != null) && (canEntityBeSeen(entityplayer)) ? entityplayer : null;
    }

    public String getHurtSound()
    {
        return Minefus.MODID + ":Champ champ hurt";
    }

    public String getDeathSound()
    {
        return Minefus.MODID + ":Champ champ death";
    }

    public String getLivingSound()
    {
        return Minefus.MODID + ":Champ champ living";
    }

    public boolean attackEntityFrom(DamageSource damage, float f)
    {
        if(isEntityInvulnerable())
            return false;
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.21D);
        return super.attackEntityFrom(damage, f);
    }
}