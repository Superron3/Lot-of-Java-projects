package com.degraduck.minefus.common;

import java.awt.Color;

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
import com.degraduck.minefus.items.ItemJetonCompensation;
import com.degraduck.minefus.items.ItemPetitCoffre;
import com.degraduck.minefus.pets.PetBilby;
import com.degraduck.minefus.pets.PetCroum;
import com.degraduck.minefus.proxy.CommonProxy;
import com.degraduck.minefus.stuffs.BonusPanoplie;
import com.degraduck.minefus.stuffs.ItemMimibiote;
import com.degraduck.minefus.stuffs.StuffAmuletteBouftou;
import com.degraduck.minefus.stuffs.StuffAmuletteBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffAnneauBouftou;
import com.degraduck.minefus.stuffs.StuffAnneauBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffBotteBouftou;
import com.degraduck.minefus.stuffs.StuffBotteBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffBotteMousse;
import com.degraduck.minefus.stuffs.StuffCapeBouftou;
import com.degraduck.minefus.stuffs.StuffCapeBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffCapeMousse;
import com.degraduck.minefus.stuffs.StuffCeintureBouftou;
import com.degraduck.minefus.stuffs.StuffCeintureBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffCeintureMousse;
import com.degraduck.minefus.stuffs.StuffCoiffeBouftou;
import com.degraduck.minefus.stuffs.StuffCoiffeBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffCoiffeMousse;
import com.degraduck.minefus.stuffs.StuffCoiffeQuete;
import com.degraduck.minefus.stuffs.StuffEpeeBouftouRoyal;
import com.degraduck.minefus.stuffs.StuffMarteauBouftou;
import com.degraduck.minefus.stuffs.StuffPelleMousse;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Dofus.MODID, name = Dofus.NAME, version = Dofus.VERSION)
public class Dofus
{
    @Mod.Instance(Dofus.MODID)
    public static Dofus instance;
    @SidedProxy(clientSide = "com.degraduck.minefus.proxy.ClientProxy", serverSide = "com.degraduck.minefus.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static Item itemMinefus, itemAmuletteBouftou, morceaudekamas, kamas, kamas9, kamas90, clefbouftou, clefincarnam, clefchamps, clefkwakwa, cleffantome, clefensable, cleflarve, clefblops, clefblopsmulti, clefroyalmouth, cleftofu, cleftofuroyal, pain_amakna, potionbonta, potionastrub, lainebouftou, grainedepiou, plumepioujaune, plumepiourouge, plumepioubleu, plumepiouvert, plumepiourose,
            plumepiouviolet, champignon, cuirbouftou, lainebouftouroyal, cuirbouftouroyal, cornebouftou, oeildebouftou, antennes_du_cafard_fadet, blague_glutine, cadeau_de_nowel_potentiellement_surpuissant, patron_du_glutin, patron_du_nowel_cauchemardesque, patron_du_pere_fwetar, ratelier_doogie_betty, patron_de_redolphe, nez_rouge_de_redolphe, hormone_de_tofu_givre,
            paquet_cadeau_du_minotoboule_de_nowel, flocon_de_feige, fond_de_culotte_de_glugubrr, StuffCoiffeBouftou, StuffCapeBouftou, StuffMarteauBouftou, StuffCeintureBouftou, StuffBotteBouftou, StuffAmuletteBouftou, StuffAnneauBouftou, StuffCoiffeMousse, StuffCapeMousse, StuffCeintureMousse, StuffBotteMousse, StuffPelleMousse, StuffCoiffeBouftouRoyal, StuffCapeBouftouRoyal,
            StuffCeintureBouftouRoyal, StuffBotteBouftouRoyal, StuffAmuletteBouftouRoyal, StuffAnneauBouftouRoyal, StuffEpeeBouftouRoyal, PetBilby, PetCroum, StuffCoiffeQuete, ItemMimibiote, ItemJetonCompensation, ItemPetitCoffre;
    public static ArmorMaterial StuffBouftou = EnumHelper.addArmorMaterial("PanoplieBouftou", 62500000, new int[] {0, 0, 0, 0}, 20), StuffMousse = EnumHelper.addArmorMaterial("PanoplieBMousse", 62500000, new int[] {5, 4, 3, 3}, 20), StuffBouftouRoyal = EnumHelper.addArmorMaterial("PanoplieBouftouRoyal", 62500000, new int[] {6, 5, 3, 3}, 20),
            PetDofus = EnumHelper.addArmorMaterial("PetDofus", 62500000, new int[] {6, 6, 6, 6}, 99);
    public static ToolMaterial MarteauDofus = EnumHelper.addToolMaterial("MarteauDofus", 1, 9999, 5.0F, 4.5F, 18), PelleDofus = EnumHelper.addToolMaterial("PelleDofus", 1, 9999, 5.0F, 4.0F, 18), EpeeDofus = EnumHelper.addToolMaterial("EpeeDofus", 1, 9999, 5.0F, 6.0F, 18);
    private static int modGuiIndex = 0;
    public static final int GUI_MINEFUS_INV = modGuiIndex++, GUI_MIMIBIOTE_INV = modGuiIndex++;
    public static final String MODID = "minefus", NAME = "Minefus", VERSION = "1.0.0";
    public static final PacketPipeline packetPipeline = new PacketPipeline();
    public static CreativeTabs tabDofusItems = new DofusItemsCreativeTabs("DofusItems");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        M_Block.init();
        M_BlockSlab.init();
        kamas = new Kamas().setUnlocalizedName("kamas").setTextureName("DofusItems:kamas").setCreativeTab(tabDofusItems);
        kamas9 = new Kamas9().setUnlocalizedName("kamas9").setTextureName("DofusItems:kamas9").setCreativeTab(tabDofusItems);
        kamas90 = new Kamas90().setUnlocalizedName("kamas90").setTextureName("DofusItems:kamas90").setCreativeTab(tabDofusItems);
        morceaudekamas = new Morceaudekamas().setUnlocalizedName("morceaudekamas").setTextureName("DofusItems:morceaudekamas").setCreativeTab(tabDofusItems);
        champignon = new Champignon().setUnlocalizedName("champignon").setTextureName("DofusItems:champignon").setCreativeTab(tabDofusItems);
        lainebouftou = new Lainebouftou().setUnlocalizedName("lainebouftou").setTextureName("DofusItems:lainebouftou").setCreativeTab(tabDofusItems);
        cuirbouftou = new Cuirbouftou().setUnlocalizedName("cuirbouftou").setTextureName("DofusItems:cuirbouftou").setCreativeTab(tabDofusItems);
        lainebouftouroyal = new Lainebouftouroyal().setUnlocalizedName("lainebouftouroyal").setTextureName("DofusItems:lainebouftouroyal").setCreativeTab(tabDofusItems);
        cuirbouftouroyal = new Cuirbouftouroyal().setUnlocalizedName("cuirbouftouroyal").setTextureName("DofusItems:cuirbouftouroyal").setCreativeTab(tabDofusItems);
        cornebouftou = new Cornebouftou().setUnlocalizedName("cornebouftou").setTextureName("DofusItems:cornebouftou").setCreativeTab(tabDofusItems);
        oeildebouftou = new Oeildebouftou().setUnlocalizedName("oeildebouftou").setTextureName("DofusItems:oeildebouftou").setCreativeTab(tabDofusItems);
        grainedepiou = new grainedepiou().setUnlocalizedName("grainedepiou").setTextureName("DofusItems:grainedepiou").setCreativeTab(tabDofusItems);
        plumepioujaune = new Plumepioujaune().setUnlocalizedName("plumepioujaune").setTextureName("DofusItems:plumepioujaune").setCreativeTab(tabDofusItems);
        plumepioubleu = new Plumepioubleu().setUnlocalizedName("plumepioubleu").setTextureName("DofusItems:plumepioubleu").setCreativeTab(tabDofusItems);
        plumepiouvert = new Plumepiouvert().setUnlocalizedName("plumepiouvert").setTextureName("DofusItems:plumepiouvert").setCreativeTab(tabDofusItems);
        plumepiourouge = new Plumepiourouge().setUnlocalizedName("plumepiourouge").setTextureName("DofusItems:plumepiourouge").setCreativeTab(tabDofusItems);
        plumepiourose = new Plumepiourose().setUnlocalizedName("plumepiourose").setTextureName("DofusItems:plumepiourose").setCreativeTab(tabDofusItems);
        plumepiouviolet = new Plumepiouviolet().setUnlocalizedName("plumepiouviolet").setTextureName("DofusItems:plumepiouviolet").setCreativeTab(tabDofusItems);
        antennes_du_cafard_fadet = new Antennes_du_cafard_fadet().setUnlocalizedName("antennes_du_cafard_fadet").setTextureName("DofusItems:antennes_du_cafard_fadet").setCreativeTab(tabDofusItems);
        blague_glutine = new Blague_glutine().setUnlocalizedName("blague_glutine").setTextureName("DofusItems:blague_glutine").setCreativeTab(tabDofusItems);
        cadeau_de_nowel_potentiellement_surpuissant = new Cadeau_de_nowel_potentiellement_surpuissant().setUnlocalizedName("cadeau_de_nowel_potentiellement_surpuissant").setTextureName("DofusItems:cadeau_de_nowel_potentiellement_surpuissant").setCreativeTab(tabDofusItems);
        patron_du_glutin = new Patron_du_glutin().setUnlocalizedName("patron_du_glutin").setTextureName("DofusItems:patron_du_glutin").setCreativeTab(tabDofusItems);
        patron_du_nowel_cauchemardesque = new Patron_du_nowel_cauchemardesque().setUnlocalizedName("patron_du_nowel_cauchemardesque").setTextureName("DofusItems:patron_du_nowel_cauchemardesque").setCreativeTab(tabDofusItems);
        patron_du_pere_fwetar = new Patron_du_pere_fwetar().setUnlocalizedName("patron_du_pere_fwetar").setTextureName("DofusItems:patron_du_pere_fwetar").setCreativeTab(tabDofusItems);
        ratelier_doogie_betty = new Ratelier_doogie_betty().setUnlocalizedName("ratelier_doogie_betty").setTextureName("DofusItems:ratelier_doogie_betty").setCreativeTab(tabDofusItems);
        patron_de_redolphe = new Patron_de_redolphe().setUnlocalizedName("patron_de_redolphe").setTextureName("DofusItems:patron_de_redolphe").setCreativeTab(tabDofusItems);
        nez_rouge_de_redolphe = new Nez_rouge_de_redolphe().setUnlocalizedName("nez_rouge_de_redolphe").setTextureName("DofusItems:nez_rouge_de_redolphe").setCreativeTab(tabDofusItems);
        hormone_de_tofu_givre = new Hormone_de_tofu_givre().setUnlocalizedName("hormone_de_tofu_givre").setTextureName("DofusItems:hormone_de_tofu_givre").setCreativeTab(tabDofusItems);
        paquet_cadeau_du_minotoboule_de_nowel = new Paquet_cadeau_du_minotoboule_de_nowel().setUnlocalizedName("paquet_cadeau_du_minotoboule_de_nowel").setTextureName("DofusItems:paquet_cadeau_du_minotoboule_de_nowel").setCreativeTab(tabDofusItems);
        flocon_de_feige = new Flocon_de_feige().setUnlocalizedName("flocon_de_feige").setTextureName("DofusItems:flocon_de_feige").setCreativeTab(tabDofusItems);
        fond_de_culotte_de_glugubrr = new Fond_de_culotte_de_glugubrr().setUnlocalizedName("fond_de_culotte_de_glugubrr").setTextureName("DofusItems:fond_de_culotte_de_glugubrr").setCreativeTab(tabDofusItems);
        clefbouftou = new Clefbouftou().setUnlocalizedName("clefbouftou").setTextureName("DofusItems:clefbouftou").setCreativeTab(tabDofusItems);
        clefincarnam = new Clefincarnam().setUnlocalizedName("clefincarnam").setTextureName("DofusItems:clefincarnam").setCreativeTab(tabDofusItems);
        clefchamps = new Clefchamps().setUnlocalizedName("clefchamps").setTextureName("DofusItems:clefchamps").setCreativeTab(tabDofusItems);
        clefkwakwa = new Clefkwakwa().setUnlocalizedName("clefkwakwa").setTextureName("DofusItems:clefkwakwa").setCreativeTab(tabDofusItems);
        cleffantome = new Cleffantome().setUnlocalizedName("cleffantome").setTextureName("DofusItems:cleffantome").setCreativeTab(tabDofusItems);
        clefensable = new Clefensable().setUnlocalizedName("clefensable").setTextureName("DofusItems:clefensable").setCreativeTab(tabDofusItems);
        cleflarve = new Cleflarve().setUnlocalizedName("cleflarve").setTextureName("DofusItems:cleflarve").setCreativeTab(tabDofusItems);
        clefblops = new Clefblops().setUnlocalizedName("clefblop").setTextureName("DofusItems:clefblops").setCreativeTab(tabDofusItems);
        clefblopsmulti = new Clefblopsmulti().setUnlocalizedName("clefblopsmulti").setTextureName("DofusItems:clefblopsmulti").setCreativeTab(tabDofusItems);
        clefroyalmouth = new Clefroyalmouth().setUnlocalizedName("clefroyalmouth").setTextureName("DofusItems:clefroyalmouth").setCreativeTab(tabDofusItems);
        cleftofu = new Cleftofu().setUnlocalizedName("cleftofu").setTextureName("DofusItems:cleftofu").setCreativeTab(tabDofusItems);
        cleftofuroyal = new Cleftofuroyal().setUnlocalizedName("cleftofuroyal").setTextureName("DofusItems:cleftofuroyal").setCreativeTab(tabDofusItems);
        pain_amakna = new Painamakna(4, 0.3F, false).setTextureName("DofusItems:pain_amakna").setUnlocalizedName("pain_amakna").setCreativeTab(tabDofusItems);
        potionastrub = new Potionastrub().setTextureName("DofusItems:potionastrub").setUnlocalizedName("potionastrub").setCreativeTab(tabDofusItems);
        potionbonta = new Potionbonta().setTextureName("DofusItems:potionbonta").setUnlocalizedName("potionbonta").setCreativeTab(tabDofusItems);
        GameRegistry.registerItem(kamas, "kamas");
        GameRegistry.registerItem(kamas9, "kamas9");
        GameRegistry.registerItem(kamas90, "kamas90");
        GameRegistry.registerItem(morceaudekamas, "morceaudekamas");
        GameRegistry.registerItem(champignon, "champignon");
        GameRegistry.registerItem(lainebouftou, "lainebouftou");
        GameRegistry.registerItem(cuirbouftou, "cuirbouftou");
        GameRegistry.registerItem(lainebouftouroyal, "lainebouftouroyal");
        GameRegistry.registerItem(cuirbouftouroyal, "cuirbouftouroyal");
        GameRegistry.registerItem(cornebouftou, "cornebouftou");
        GameRegistry.registerItem(oeildebouftou, "oeildebouftou");
        GameRegistry.registerItem(plumepioujaune, "plumepioujaune");
        GameRegistry.registerItem(plumepiouvert, "plumepiouvert");
        GameRegistry.registerItem(plumepioubleu, "plumepioubleu");
        GameRegistry.registerItem(plumepiourouge, "plumepiourouge");
        GameRegistry.registerItem(plumepiouviolet, "plumepiouviolet");
        GameRegistry.registerItem(plumepiourose, "plumepiourose");
        GameRegistry.registerItem(grainedepiou, "grainedepiou");
        GameRegistry.registerItem(cadeau_de_nowel_potentiellement_surpuissant, "cadeau_de_nowel_potentiellement_surpuissant");
        GameRegistry.registerItem(flocon_de_feige, "flocon_de_feige");
        GameRegistry.registerItem(fond_de_culotte_de_glugubrr, "fond_de_culotte_de_glugubrr");
        GameRegistry.registerItem(hormone_de_tofu_givre, "hormone_de_tofu_givre");
        GameRegistry.registerItem(nez_rouge_de_redolphe, "nez_rouge_de_redolphe");
        GameRegistry.registerItem(patron_de_redolphe, "patron_de_redolphe");
        GameRegistry.registerItem(ratelier_doogie_betty, "ratelier_doogie_betty");
        GameRegistry.registerItem(patron_du_nowel_cauchemardesque, "patron_du_nowel_cauchemardesque");
        GameRegistry.registerItem(patron_du_pere_fwetar, "patron_du_pere_fwetar");
        GameRegistry.registerItem(antennes_du_cafard_fadet, "antennes_du_cafard_fadet");
        GameRegistry.registerItem(blague_glutine, "blague_glutine");
        GameRegistry.registerItem(paquet_cadeau_du_minotoboule_de_nowel, "paquet_cadeau_du_minotoboule_de_nowel");
        GameRegistry.registerItem(patron_du_glutin, "patron_du_glutin");
        GameRegistry.registerItem(pain_amakna, "pain_amakna");
        GameRegistry.registerItem(potionbonta, "potionbonta");
        GameRegistry.registerItem(potionastrub, "potionastrub");
        GameRegistry.registerItem(clefbouftou, "clefbouftou");
        GameRegistry.registerItem(clefincarnam, "clefincarnam");
        GameRegistry.registerItem(clefkwakwa, "clefkwakwa");
        GameRegistry.registerItem(cleffantome, "cleffantome");
        GameRegistry.registerItem(clefchamps, "clefchamps");
        GameRegistry.registerItem(clefensable, "clefensable");
        GameRegistry.registerItem(cleflarve, "cleflarve");
        GameRegistry.registerItem(clefroyalmouth, "clefroyalmouth");
        GameRegistry.registerItem(clefblops, "clefblops");
        GameRegistry.registerItem(clefblopsmulti, "clefblopsmulti");
        GameRegistry.registerItem(cleftofu, "cleftofu");
        GameRegistry.registerItem(cleftofuroyal, "cleftofuroyal");
        ItemJetonCompensation = new ItemJetonCompensation().setUnlocalizedName("Jeton De Compensation").setTextureName("moddofus:item_jeton_compensation").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(ItemJetonCompensation, "Jeton De Compensation");
        ItemPetitCoffre = new ItemPetitCoffre().setUnlocalizedName("Petit Coffre").setTextureName("moddofus:icone_petit_coffre").setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(ItemPetitCoffre, "Petit Coffre");
        ItemMimibiote = new ItemMimibiote().setUnlocalizedName("Mimibiotes").setTextureName("moddofus:icone_mimibiote").setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(ItemMimibiote, "Mimibiotes");
        PetBilby = new PetBilby(PetDofus, 3).setUnlocalizedName("Bilby").setTextureName("moddofus:icone_pet_bilby");
        GameRegistry.registerItem(PetBilby, "Bilby");
        PetCroum = new PetCroum(PetDofus, 3).setUnlocalizedName("Croum").setTextureName("moddofus:icone_pet_croum");
        GameRegistry.registerItem(PetCroum, "Croum");
        StuffCoiffeQuete = new StuffCoiffeQuete(StuffBouftou, 0).setUnlocalizedName("Coiffe Quete").setTextureName("moddofus:icone_coiffe_quete");
        GameRegistry.registerItem(StuffCoiffeQuete, "Coiffe Quete");
        StuffCoiffeBouftou = new StuffCoiffeBouftou(StuffBouftou, 0).setUnlocalizedName("Coiffe Bouftou").setTextureName("moddofus:icone_coiffe_bouftou");
        GameRegistry.registerItem(StuffCoiffeBouftou, "Coiffe Bouftou");
        StuffCapeBouftou = new StuffCapeBouftou(StuffBouftou, 1).setUnlocalizedName("Cape Bouftou").setTextureName("moddofus:icone_cape_bouftou");
        GameRegistry.registerItem(StuffCapeBouftou, "Cape Bouftou");
        StuffCeintureBouftou = new StuffCeintureBouftou().setUnlocalizedName("Ceinture_Bouftou").setTextureName("moddofus:icone_ceinture_bouftou").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffCeintureBouftou, "Ceinture Bouftou");
        StuffBotteBouftou = new StuffBotteBouftou().setUnlocalizedName("Botte Bouftou").setTextureName("moddofus:icone_botte_bouftou").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffBotteBouftou, "Botte Bouftou");
        StuffAmuletteBouftou = new StuffAmuletteBouftou().setUnlocalizedName("Amulette Bouftou").setTextureName("moddofus:icone_amulette_bouftou").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffAmuletteBouftou, "Amulette Bouftou");
        StuffAnneauBouftou = new StuffAnneauBouftou().setUnlocalizedName("Anneau Bouftou").setTextureName("moddofus:icone_anneau_bouftou").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffAnneauBouftou, "Anneau Bouftou");
        StuffMarteauBouftou = new StuffMarteauBouftou(MarteauDofus).setUnlocalizedName("Marteau Bouftou");
        GameRegistry.registerItem(StuffMarteauBouftou, "Marteau Bouftou");
        StuffCoiffeMousse = new StuffCoiffeMousse(StuffMousse, 0).setUnlocalizedName("Coiffe_Mousse").setTextureName("moddofus:icone_coiffe_mousse");
        GameRegistry.registerItem(StuffCoiffeMousse, "Coiffe Mousse");
        StuffCapeMousse = new StuffCapeMousse(StuffMousse, 1).setUnlocalizedName("Cape_Mousse").setTextureName("moddofus:icone_cape_mousse");
        GameRegistry.registerItem(StuffCapeMousse, "Cape Mousse");
        StuffCeintureMousse = new StuffCeintureMousse().setUnlocalizedName("Ceinture Mousse").setTextureName("moddofus:icone_ceinture_mousse").setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(StuffCeintureMousse, "Ceinture Mousse");
        StuffBotteMousse = new StuffBotteMousse().setUnlocalizedName("Botte Mousse").setTextureName("moddofus:icone_botte_mousse").setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(StuffBotteMousse, "Botte Mousse");
        StuffPelleMousse = new StuffPelleMousse(PelleDofus).setUnlocalizedName("Pelle Mousse");
        GameRegistry.registerItem(StuffPelleMousse, "Pelle Mousse");
        StuffCoiffeBouftouRoyal = new StuffCoiffeBouftouRoyal(StuffBouftouRoyal, 0).setUnlocalizedName("Coiffe Bouftou Royal").setTextureName("moddofus:icone_coiffe_bouftou_royal");
        GameRegistry.registerItem(StuffCoiffeBouftouRoyal, "Coiffe Bouftou Royal");
        StuffCapeBouftouRoyal = new StuffCapeBouftouRoyal(StuffBouftouRoyal, 1).setUnlocalizedName("Cape Bouftou Royal").setTextureName("moddofus:icone_cape_bouftou_royal");
        GameRegistry.registerItem(StuffCapeBouftouRoyal, "Cape Bouftou Royal");
        StuffCeintureBouftouRoyal = new StuffCeintureBouftouRoyal().setUnlocalizedName("Ceinture Bouftou Royal").setTextureName("moddofus:icone_ceinture_bouftou_royal").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffCeintureBouftouRoyal, "Ceinture Bouftou Royal");
        StuffBotteBouftouRoyal = new StuffBotteBouftouRoyal().setUnlocalizedName("Botte Bouftou Royal").setTextureName("moddofus:icone_botte_bouftou_royal").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffBotteBouftouRoyal, "Botte Bouftou Royal");
        StuffAmuletteBouftouRoyal = new StuffAmuletteBouftouRoyal().setUnlocalizedName("Amulette Bouftou Royal").setTextureName("moddofus:icone_amulette_bouftou_royal").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffAmuletteBouftouRoyal, "Amulette Bouftou Royal");
        StuffAnneauBouftouRoyal = new StuffAnneauBouftouRoyal().setUnlocalizedName("Anneau_Bouftou_Royal").setTextureName("moddofus:icone_anneau_bouftou_royal").setCreativeTab(CreativeTabs.tabCombat).setMaxStackSize(1);
        GameRegistry.registerItem(StuffAnneauBouftouRoyal, "Anneau Bouftou Royal");
        StuffEpeeBouftouRoyal = new StuffEpeeBouftouRoyal(EpeeDofus).setUnlocalizedName("Epee Bouftou Royal");
        GameRegistry.registerItem(StuffEpeeBouftouRoyal, "Epee Bouftou Royal");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        packetPipeline.initialise();
        MinecraftForge.EVENT_BUS.register(new MinefusEventHandler());
        MinecraftForge.EVENT_BUS.register(new MimibioteEventHandler());
        FMLCommonHandler.instance().bus().register(new MinefusEventHandler());
        if(event.getSide().isClient())
        {
            MinecraftForge.EVENT_BUS.register(new MinefusKeyHandler());
            FMLCommonHandler.instance().bus().register(new MinefusKeyHandler());
        }
        FMLCommonHandler.instance().bus().register(new MimibioteEventHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
        MinecraftForge.EVENT_BUS.register(new BonusPanoplie());
        FMLCommonHandler.instance().bus().register(new BonusPanoplie());
        proxy.registerRender();
        EntityRegistry.registerGlobalEntityID(EntityMobArakne.class, "Arakne", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobArakne.class, "Arakne", 420, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobTofu.class, "Tofu", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobTofu.class, "Tofu", 421, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobChampchamp.class, "Champ Champ", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobChampchamp.class, "Champ Champ", 422, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveVerte.class, "Larve Verte", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveVerte.class, "Larve Verte", 423, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveOrange.class, "Larve Orange", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveOrange.class, "Larve Orange", 424, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveBleu.class, "Larve Bleu", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveBleu.class, "Larve Bleu", 425, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobMoskito.class, "Moskito", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobMoskito.class, "Moskito", 426, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobBouftou.class, "Bouftou", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobBouftou.class, "Bouftou", 427, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobBouftonBlanc.class, "Boufton Blanc", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobBouftonBlanc.class, "Boufton Blanc", 428, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobBouftonNoir.class, "Boufton Noir", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobBouftonNoir.class, "Boufton Noir", 429, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouVert.class, "Piou Vert", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouVert.class, "Piou Vert", 430, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouBleu.class, "Piou Bleu", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouBleu.class, "Piou Bleu", 431, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouJaune.class, "Piou Jaune", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouJaune.class, "Piou Jaune", 432, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouRouge.class, "Piou Rouge", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouRouge.class, "Piou Rouge", 433, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouViolet.class, "Piou Violet", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouViolet.class, "Piou Violet", 434, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPiouRose.class, "Piou Rose", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPiouRose.class, "Piou Rose", 435, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobTournesolSauvage.class, "Tournesol Sauvage", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobTournesolSauvage.class, "Tournesol Sauvage", 436, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobCraquebille.class, "Craquebille", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobCraquebille.class, "Craquebille", 437, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobCraqueboulle.class, "Craqueboulle", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobCraqueboulle.class, "Craqueboulle", 438, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobTofuMalade.class, "Tofu Malade", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobTofuMalade.class, "Tofu Malade", 439, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPetitTofu.class, "Petit Tofu", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPetitTofu.class, "Petit Tofu", 440, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobArakneAgressive.class, "Arakne Agressive", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobArakneAgressive.class, "Arakne Agressive", 441, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobArakneMalade.class, "Arakne Malade", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobArakneMalade.class, "Arakne Malade", 442, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobArakneImmature.class, "Arakne Immature", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobArakneImmature.class, "Arakne Immature", 443, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobChampchampVulnerable.class, "Champ Champ Vuln????rable", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobChampchampVulnerable.class, "Champ Champ Vuln????rable", 444, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveVerteImmature.class, "Larve Verte Immature", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveVerteImmature.class, "Larve Verte Immature", 445, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveOrangeImmature.class, "Larve Orange Immature", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveOrangeImmature.class, "Larve Orange Immature", 446, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobLarveBleuImmature.class, "Larve Bleu Immature", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobLarveBleuImmature.class, "Larve Bleu Immature", 447, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobMoskitoPeureux.class, "Moskito Peureux", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobMoskitoPeureux.class, "Moskito Peureux", 448, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPetitBouftou.class, "Petit Bouftou", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPetitBouftou.class, "Petit Bouftou", 449, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobJeuneBouftonBlanc.class, "Jeune Boufton Blanc", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobJeuneBouftonBlanc.class, "Jeune Boufton Blanc", 450, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobJeuneBouftonNoir.class, "Jeune Boufton Noir", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobJeuneBouftonNoir.class, "Jeune Boufton Noir", 451, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinVert.class, "Pioussin Vert", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinVert.class, "Pioussin Vert", 452, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinBleu.class, "Pioussin Bleu", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinBleu.class, "Pioussin Bleu", 453, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinJaune.class, "Pioussin Jaune", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinJaune.class, "Pioussin Jaune", 454, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinRouge.class, "Pioussin Rouge", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinRouge.class, "Pioussin Rouge", 455, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinViolet.class, "Pioussin Violet", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinViolet.class, "Pioussin Violet", 456, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPioussinRose.class, "Pioussin Rose", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPioussinRose.class, "Pioussin Rose", 457, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPetitTournesolSauvage.class, "Petit Tournesol Sauvage", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPetitTournesolSauvage.class, "Petit Tournesol Sauvage", 458, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobChefDeGuerre.class, "Chef De Guerre Bouftou", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobChefDeGuerre.class, "Chef De Guerre Bouftou", 459, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobMilimilou.class, "BOSS Milimilou", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobMilimilou.class, "BOSS Milimilou", 460, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobBouftouRoyale.class, "BOSS Bouftou Royal", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobBouftouRoyale.class, "BOSS Bouftou Royal", 461, instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityMobPetitChefDeGuerre.class, "Petit Chef De Guerre Bouftou", EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 218, 119).getRGB(), new Color(133, 156, 43).getRGB());
        EntityRegistry.registerModEntity(EntityMobPetitChefDeGuerre.class, "Petit Chef De Guerre Bouftou", 462, instance, 40, 1, true);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        packetPipeline.postInitialise();
    }
}
