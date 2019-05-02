package com.pebbletwig.pebblesarsenal.item;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import com.pebbletwig.pebblesarsenal.item.tool.ItemGreatSword;
import com.pebbletwig.pebblesarsenal.item.tool.ItemKnife;
import com.pebbletwig.pebblesarsenal.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;


public class ModItems {
    //Create Items, note here. I have decided to remove the battleaxe as I feel it is too overpowered.
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
    public static ItemOre ingotPebbleAlloy = new ItemOre("ingot_pebble_alloy", "ingotPebbleAlloy");
    public static ItemOre nuggetCopper = new ItemOre("nugget_copper", "nuggetCopper");
    public static ItemOre ingotPebble = new ItemOre("ingot_pebble", "ingotPebble");
    public static ItemOre nuggetPebble = new ItemOre("nugget_pebble", "nuggetPebble");
    public static ItemSword pebbleSword = new ItemSword(PebblesArsenal.pebbleTM,"pebble_sword");
    public static ItemKnife pebbleKnife = new ItemKnife(PebblesArsenal.pebbleTM2, "pebble_knife");
    public static ItemGreatSword pebbleGreatSword = new ItemGreatSword(PebblesArsenal.pebbleTM3, "pebble_greatsword");
    public static ItemOre nuggetPebbleAlloy = new ItemOre("nugget_pebble_alloy", "nuggetPebbleAlloy");
    public static ItemSword pebbleAlloySword = new ItemSword(PebblesArsenal.pebbleAlloyTM,"pebble_alloy_sword");
    public static ItemKnife pebbleAlloyKnife = new ItemKnife(PebblesArsenal.pebbleAlloyTM2, "pebble_alloy_knife");
    public static ItemGreatSword pebbleAlloyGreatSword = new ItemGreatSword(PebblesArsenal.pebbleAlloyTM3, "pebble_alloy_greatsword");
    public static ItemKnife copperKnife = new ItemKnife(PebblesArsenal.copperTM2,"copper_knife");
    public static ItemGreatSword copperGreatSword = new ItemGreatSword(PebblesArsenal.copperTM3, "copper_greatsword");
    public static ItemSword copperSword = new ItemSword(PebblesArsenal.copperTM, "copper_sword");
    public static ItemOre ingotTin = new ItemOre("ingot_tin","ingotTin");
    public static ItemOre nuggetTin = new ItemOre("nugget_tin", "nuggetTin");
    public static ItemSword tinSword = new ItemSword(PebblesArsenal.tinTM,"tin_sword");
    public static ItemKnife tinKnife = new ItemKnife(PebblesArsenal.tinTM2, "tin_knife");
    public static ItemGreatSword tinGreatSword = new ItemGreatSword(PebblesArsenal.tinTM3, "tin_greatsword");

    //Any items after this comment are base game materials
    public static ItemGreatSword woodGreatSword = new ItemGreatSword(Item.ToolMaterial.WOOD, "wood_greatsword");
    public static ItemKnife woodKnife = new ItemKnife(Item.ToolMaterial.WOOD, "wood_knife");
    public static ItemGreatSword stoneGreatSword = new ItemGreatSword(Item.ToolMaterial.STONE, "stone_greatsword");
    public static ItemKnife stoneKnife = new ItemKnife(Item.ToolMaterial.STONE, "stone_knife");
    public static ItemGreatSword ironGreatSword = new ItemGreatSword(Item.ToolMaterial.IRON, "iron_greatsword");
    public static ItemKnife ironKnife = new ItemKnife(Item.ToolMaterial.IRON, "iron_knife");
    public static ItemGreatSword goldGreatSword = new ItemGreatSword(Item.ToolMaterial.GOLD, "gold_greatsword");
    public static ItemKnife goldKnife = new ItemKnife(Item.ToolMaterial.GOLD, "gold_knife");
    public static ItemGreatSword diamondGreatSword = new ItemGreatSword(Item.ToolMaterial.DIAMOND, "diamond_greatsword");
    public static ItemKnife diamondKnife = new ItemKnife(Item.ToolMaterial.DIAMOND, "diamond_knife");


    //Register The Items
    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nuggetCopper,
                nuggetTin,
                nuggetPebble,
                nuggetPebbleAlloy,
                ingotCopper,
                ingotTin,
                ingotPebble,
                ingotPebbleAlloy,
                copperSword,
                copperKnife,
                copperGreatSword,
                tinSword,
                tinKnife,
                tinGreatSword,
                pebbleSword,
                pebbleKnife,
                pebbleGreatSword,
                pebbleAlloySword,
                pebbleAlloyKnife,
                pebbleAlloyGreatSword,
                woodKnife,
                stoneKnife,
                ironKnife,
                goldKnife,
                diamondKnife

        );
    }

    public static void register2(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nuggetPebble,
                nuggetPebbleAlloy,
                ingotPebble,
                ingotPebbleAlloy,
                copperKnife,
                copperGreatSword,
                pebbleSword,
                pebbleKnife,
                pebbleGreatSword,
                pebbleAlloySword,
                pebbleAlloyKnife,
                pebbleAlloyGreatSword,
                tinGreatSword,
                tinKnife,
                woodKnife,
                stoneKnife,
                ironKnife,
                goldKnife,
                diamondKnife

        );
    }

    //Register the Item Models
    public static void registerModels() {
        nuggetCopper.registerItemModel();
        nuggetPebble.registerItemModel();
        nuggetPebbleAlloy.registerItemModel();
        ingotCopper.registerItemModel();
        ingotPebble.registerItemModel();
        ingotPebbleAlloy.registerItemModel();
        copperKnife.registerItemModel();
        copperSword.registerItemModel();
        copperGreatSword.registerItemModel();
        pebbleSword.registerItemModel();
        pebbleKnife.registerItemModel();
        pebbleGreatSword.registerItemModel();
        pebbleAlloySword.registerItemModel();
        pebbleAlloyKnife.registerItemModel();
        pebbleAlloyGreatSword.registerItemModel();
        ingotTin.registerItemModel();
        nuggetTin.registerItemModel();
        tinSword.registerItemModel();
        tinKnife.registerItemModel();
        tinGreatSword.registerItemModel();
        woodKnife.registerItemModel();
        stoneKnife.registerItemModel();
        ironKnife.registerItemModel();
        goldKnife.registerItemModel();
        diamondKnife.registerItemModel();

    }

    public static void registerModels2() {
        nuggetPebble.registerItemModel();
        nuggetPebbleAlloy.registerItemModel();
        ingotPebble.registerItemModel();
        ingotPebbleAlloy.registerItemModel();
        copperKnife.registerItemModel();
        copperGreatSword.registerItemModel();
        pebbleSword.registerItemModel();
        pebbleKnife.registerItemModel();
        pebbleGreatSword.registerItemModel();
        pebbleAlloySword.registerItemModel();
        pebbleAlloyKnife.registerItemModel();
        pebbleAlloyGreatSword.registerItemModel();
        tinKnife.registerItemModel();
        tinGreatSword.registerItemModel();
        woodKnife.registerItemModel();
        stoneKnife.registerItemModel();
        ironKnife.registerItemModel();
        goldKnife.registerItemModel();
        diamondKnife.registerItemModel();
    }
}