package com.degraduck.minefus.proxy;

import com.degraduck.minefus.common.Dofus;
import com.degraduck.minefus.common.MinefusKeyHandler;
import com.degraduck.minefus.entity.EntityMobArakne;
import com.degraduck.minefus.entity.EntityMobArakneAgressive;
import com.degraduck.minefus.entity.EntityMobArakneImmature;
import com.degraduck.minefus.entity.EntityMobArakneMalade;
import com.degraduck.minefus.entity.EntityMobBouftonBlanc;
import com.degraduck.minefus.entity.EntityMobBouftonNoir;
import com.degraduck.minefus.entity.EntityMobBouftou;
import com.degraduck.minefus.entity.EntityMobBouftouRoyale;
import com.degraduck.minefus.entity.EntityMobChampchamp;
import com.degraduck.minefus.entity.EntityMobChampchampVulnerable;
import com.degraduck.minefus.entity.EntityMobChefDeGuerre;
import com.degraduck.minefus.entity.EntityMobCraquebille;
import com.degraduck.minefus.entity.EntityMobCraqueboulle;
import com.degraduck.minefus.entity.EntityMobJeuneBouftonBlanc;
import com.degraduck.minefus.entity.EntityMobJeuneBouftonNoir;
import com.degraduck.minefus.entity.EntityMobLarveBleu;
import com.degraduck.minefus.entity.EntityMobLarveBleuImmature;
import com.degraduck.minefus.entity.EntityMobLarveOrange;
import com.degraduck.minefus.entity.EntityMobLarveOrangeImmature;
import com.degraduck.minefus.entity.EntityMobLarveVerte;
import com.degraduck.minefus.entity.EntityMobLarveVerteImmature;
import com.degraduck.minefus.entity.EntityMobMilimilou;
import com.degraduck.minefus.entity.EntityMobMoskito;
import com.degraduck.minefus.entity.EntityMobMoskitoPeureux;
import com.degraduck.minefus.entity.EntityMobPetitBouftou;
import com.degraduck.minefus.entity.EntityMobPetitChefDeGuerre;
import com.degraduck.minefus.entity.EntityMobPetitTofu;
import com.degraduck.minefus.entity.EntityMobPetitTournesolSauvage;
import com.degraduck.minefus.entity.EntityMobPiouBleu;
import com.degraduck.minefus.entity.EntityMobPiouJaune;
import com.degraduck.minefus.entity.EntityMobPiouRose;
import com.degraduck.minefus.entity.EntityMobPiouRouge;
import com.degraduck.minefus.entity.EntityMobPiouVert;
import com.degraduck.minefus.entity.EntityMobPiouViolet;
import com.degraduck.minefus.entity.EntityMobPioussinBleu;
import com.degraduck.minefus.entity.EntityMobPioussinJaune;
import com.degraduck.minefus.entity.EntityMobPioussinRose;
import com.degraduck.minefus.entity.EntityMobPioussinRouge;
import com.degraduck.minefus.entity.EntityMobPioussinVert;
import com.degraduck.minefus.entity.EntityMobPioussinViolet;
import com.degraduck.minefus.entity.EntityMobTofu;
import com.degraduck.minefus.entity.EntityMobTofuMalade;
import com.degraduck.minefus.entity.EntityMobTournesolSauvage;
import com.degraduck.minefus.models.mobs.ModelArakne;
import com.degraduck.minefus.models.mobs.ModelBouftonBlanc;
import com.degraduck.minefus.models.mobs.ModelBouftonNoir;
import com.degraduck.minefus.models.mobs.ModelBouftou;
import com.degraduck.minefus.models.mobs.ModelBouftouRoyal;
import com.degraduck.minefus.models.mobs.ModelChampchamp;
import com.degraduck.minefus.models.mobs.ModelChefDeGuerre;
import com.degraduck.minefus.models.mobs.ModelCraquebille;
import com.degraduck.minefus.models.mobs.ModelLarve;
import com.degraduck.minefus.models.mobs.ModelMilimilou;
import com.degraduck.minefus.models.mobs.ModelMoskito;
import com.degraduck.minefus.models.mobs.ModelPiouBleu;
import com.degraduck.minefus.models.mobs.ModelPiouJaune;
import com.degraduck.minefus.models.mobs.ModelPiouRose;
import com.degraduck.minefus.models.mobs.ModelPiouRouge;
import com.degraduck.minefus.models.mobs.ModelPiouVert;
import com.degraduck.minefus.models.mobs.ModelPiouViolet;
import com.degraduck.minefus.models.mobs.ModelTofu;
import com.degraduck.minefus.models.mobs.ModelTournesol;
import com.degraduck.minefus.render.items.RenderEpeeBouftouRoyal;
import com.degraduck.minefus.render.items.RenderMarteauBouftou;
import com.degraduck.minefus.render.items.RenderPelleMousse;
import com.degraduck.minefus.render.mobs.RenderMobArakne;
import com.degraduck.minefus.render.mobs.RenderMobArakneAgressive;
import com.degraduck.minefus.render.mobs.RenderMobArakneImmature;
import com.degraduck.minefus.render.mobs.RenderMobArakneMalade;
import com.degraduck.minefus.render.mobs.RenderMobBouftonBlanc;
import com.degraduck.minefus.render.mobs.RenderMobBouftonNoir;
import com.degraduck.minefus.render.mobs.RenderMobBouftou;
import com.degraduck.minefus.render.mobs.RenderMobBouftouRoyal;
import com.degraduck.minefus.render.mobs.RenderMobChampchamp;
import com.degraduck.minefus.render.mobs.RenderMobChampchampVulnerable;
import com.degraduck.minefus.render.mobs.RenderMobChefDeGuerre;
import com.degraduck.minefus.render.mobs.RenderMobCraquebille;
import com.degraduck.minefus.render.mobs.RenderMobCraqueboulle;
import com.degraduck.minefus.render.mobs.RenderMobJeuneBouftonBlanc;
import com.degraduck.minefus.render.mobs.RenderMobJeuneBouftonNoir;
import com.degraduck.minefus.render.mobs.RenderMobLarveBleu;
import com.degraduck.minefus.render.mobs.RenderMobLarveBleuImmature;
import com.degraduck.minefus.render.mobs.RenderMobLarveOrange;
import com.degraduck.minefus.render.mobs.RenderMobLarveOrangeImmature;
import com.degraduck.minefus.render.mobs.RenderMobLarveVerte;
import com.degraduck.minefus.render.mobs.RenderMobLarveVerteImmature;
import com.degraduck.minefus.render.mobs.RenderMobMilimilou;
import com.degraduck.minefus.render.mobs.RenderMobMoskito;
import com.degraduck.minefus.render.mobs.RenderMobMoskitoPeureux;
import com.degraduck.minefus.render.mobs.RenderMobPetitBouftou;
import com.degraduck.minefus.render.mobs.RenderMobPetitChefDeGuerre;
import com.degraduck.minefus.render.mobs.RenderMobPetitTofu;
import com.degraduck.minefus.render.mobs.RenderMobPetitTournesol;
import com.degraduck.minefus.render.mobs.RenderMobPiouBleu;
import com.degraduck.minefus.render.mobs.RenderMobPiouJaune;
import com.degraduck.minefus.render.mobs.RenderMobPiouRose;
import com.degraduck.minefus.render.mobs.RenderMobPiouRouge;
import com.degraduck.minefus.render.mobs.RenderMobPiouVert;
import com.degraduck.minefus.render.mobs.RenderMobPiouViolet;
import com.degraduck.minefus.render.mobs.RenderMobPioussinBleu;
import com.degraduck.minefus.render.mobs.RenderMobPioussinJaune;
import com.degraduck.minefus.render.mobs.RenderMobPioussinRose;
import com.degraduck.minefus.render.mobs.RenderMobPioussinRouge;
import com.degraduck.minefus.render.mobs.RenderMobPioussinVert;
import com.degraduck.minefus.render.mobs.RenderMobPioussinViolet;
import com.degraduck.minefus.render.mobs.RenderMobTofu;
import com.degraduck.minefus.render.mobs.RenderMobTofuMalade;
import com.degraduck.minefus.render.mobs.RenderMobTournesol;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void registerRender()
    {
        FMLCommonHandler.instance().bus().register(new MinefusKeyHandler());
        MinecraftForgeClient.registerItemRenderer(Dofus.StuffMarteauBouftou, new RenderMarteauBouftou());
        MinecraftForgeClient.registerItemRenderer(Dofus.StuffPelleMousse, new RenderPelleMousse());
        MinecraftForgeClient.registerItemRenderer(Dofus.StuffEpeeBouftouRoyal, new RenderEpeeBouftouRoyal());
        RenderingRegistry.registerEntityRenderingHandler(EntityMobArakne.class, new RenderMobArakne(new ModelArakne(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveVerte.class, new RenderMobLarveVerte(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobChampchamp.class, new RenderMobChampchamp(new ModelChampchamp(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobTofu.class, new RenderMobTofu(new ModelTofu(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobMoskito.class, new RenderMobMoskito(new ModelMoskito(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveOrange.class, new RenderMobLarveOrange(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveBleu.class, new RenderMobLarveBleu(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobBouftou.class, new RenderMobBouftou(new ModelBouftou(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobBouftonBlanc.class, new RenderMobBouftonBlanc(new ModelBouftonBlanc(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobBouftonNoir.class, new RenderMobBouftonNoir(new ModelBouftonNoir(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouVert.class, new RenderMobPiouVert(new ModelPiouVert(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouBleu.class, new RenderMobPiouBleu(new ModelPiouBleu(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouJaune.class, new RenderMobPiouJaune(new ModelPiouJaune(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouRose.class, new RenderMobPiouRose(new ModelPiouRose(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouRouge.class, new RenderMobPiouRouge(new ModelPiouRouge(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPiouViolet.class, new RenderMobPiouViolet(new ModelPiouViolet(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobCraquebille.class, new RenderMobCraquebille(new ModelCraquebille(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobTournesolSauvage.class, new RenderMobTournesol(new ModelTournesol(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobArakneMalade.class, new RenderMobArakneMalade(new ModelArakne(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobArakneImmature.class, new RenderMobArakneImmature(new ModelArakne(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobArakneAgressive.class, new RenderMobArakneAgressive(new ModelArakne(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveVerteImmature.class, new RenderMobLarveVerteImmature(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobChampchampVulnerable.class, new RenderMobChampchampVulnerable(new ModelChampchamp(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobTofuMalade.class, new RenderMobTofuMalade(new ModelTofu(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPetitTofu.class, new RenderMobPetitTofu(new ModelTofu(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobMoskitoPeureux.class, new RenderMobMoskitoPeureux(new ModelMoskito(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveOrangeImmature.class, new RenderMobLarveOrangeImmature(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobLarveBleuImmature.class, new RenderMobLarveBleuImmature(new ModelLarve(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPetitBouftou.class, new RenderMobPetitBouftou(new ModelBouftou(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobJeuneBouftonBlanc.class, new RenderMobJeuneBouftonBlanc(new ModelBouftonBlanc(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobJeuneBouftonNoir.class, new RenderMobJeuneBouftonNoir(new ModelBouftonNoir(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinVert.class, new RenderMobPioussinVert(new ModelPiouVert(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinBleu.class, new RenderMobPioussinBleu(new ModelPiouBleu(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinJaune.class, new RenderMobPioussinJaune(new ModelPiouJaune(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinRose.class, new RenderMobPioussinRose(new ModelPiouRose(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinRouge.class, new RenderMobPioussinRouge(new ModelPiouRouge(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPioussinViolet.class, new RenderMobPioussinViolet(new ModelPiouViolet(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobCraqueboulle.class, new RenderMobCraqueboulle(new ModelCraquebille(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobMilimilou.class, new RenderMobMilimilou(new ModelMilimilou(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobChefDeGuerre.class, new RenderMobChefDeGuerre(new ModelChefDeGuerre(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPetitTournesolSauvage.class, new RenderMobPetitTournesol(new ModelTournesol(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobBouftouRoyale.class, new RenderMobBouftouRoyal(new ModelBouftouRoyal(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMobPetitChefDeGuerre.class, new RenderMobPetitChefDeGuerre(new ModelChefDeGuerre(), 0.5F));
    }
}