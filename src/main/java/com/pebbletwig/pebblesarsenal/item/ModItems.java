package com.pebbletwig.pebblesarsenal.item;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import com.pebbletwig.pebblesarsenal.item.tool.ItemGreatSword;
import com.pebbletwig.pebblesarsenal.item.tool.ItemKnife;
import com.pebbletwig.pebblesarsenal.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

//import com.pebbletwig.pebblesarsenal.item.tool.ItemAxe;

public class ModItems {
    //Create Items, note here. I have decided to remove the battleaxe as I feel it is too overpowered.
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
    public static ItemOre ingotPebbleAlloy = new ItemOre("ingot_pebble_alloy", "ingotPebbleAlloy");
    public static ItemSword copperSword = new ItemSword(PebblesArsenal.copperTM, "copper_sword");
    //public static ItemAxe copperBattleaxe = new ItemAxe(PebblesArsenal.copperOneTM,"copper_battleaxe");
    public static ItemOre nuggetCopper = new ItemOre("nugget_copper", "nuggetCopper");
    public static ItemKnife copperKnife = new ItemKnife(PebblesArsenal.copperTM,"copper_knife");
    public static ItemGreatSword copperGreatSword = new ItemGreatSword(PebblesArsenal.copperTM, "copper_greatsword");
    public static ItemOre ingotPebble = new ItemOre("ingot_pebble", "ingotPebble");
    public static ItemOre nuggetPebble = new ItemOre("nugget_pebble", "nuggetPebble");
    public static ItemSword pebbleSword = new ItemSword(PebblesArsenal.pebbleTM,"pebble_sword");
    public static ItemKnife pebbleKnife = new ItemKnife(PebblesArsenal.pebbleTM, "pebble_knife");
    public static ItemGreatSword pebbleGreatSword = new ItemGreatSword(PebblesArsenal.pebbleTM, "pebble_greatsword");
    public static ItemOre nuggetPebbleAlloy = new ItemOre("nugget_pebble_alloy", "nuggetPebbleAlloy");
    public static ItemSword pebbleAlloySword = new ItemSword(PebblesArsenal.pebbleAlloyTM,"pebble_alloy_sword");
    public static ItemKnife pebbleAlloyKnife = new ItemKnife(PebblesArsenal.pebbleAlloyTM, "pebble_alloy_knife");
    public static ItemGreatSword pebbleAlloyGreatSword = new ItemGreatSword(PebblesArsenal.pebbleAlloyTM, "pebble_alloy_greatsword");

    //Register The Items
    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nuggetCopper,
                nuggetPebble,
                nuggetPebbleAlloy,
                ingotCopper,
                ingotPebble,
                ingotPebbleAlloy,
                copperSword,
                copperKnife,
                copperGreatSword,
                pebbleSword,
                pebbleKnife,
                pebbleGreatSword,
                pebbleAlloySword,
                pebbleAlloyKnife,
                pebbleAlloyGreatSword
                //copperBattleaxe
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
        //copperBattleaxe.registerItemModel();

    }
}