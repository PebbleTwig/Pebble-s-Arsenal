package com.pebbletwig.pebblesarsenal.item;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import com.pebbletwig.pebblesarsenal.item.tool.ItemAxe;
import com.pebbletwig.pebblesarsenal.item.tool.ItemGreatSword;
import com.pebbletwig.pebblesarsenal.item.tool.ItemKnife;
import com.pebbletwig.pebblesarsenal.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    //Create Items
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
    public static ItemOre ingotPebbleAlloy = new ItemOre("ingot_pebble_alloy", "ingotPebbleAlloy");
    public static ItemSword copperSword = new ItemSword(PebblesArsenal.copperTM, "copper_sword");
    public static ItemAxe copperBattleaxe = new ItemAxe(PebblesArsenal.copperOneTM,"copper_battleaxe");
    public static ItemOre nuggetCopper = new ItemOre("nugget_copper", "nuggetCopper");
    public static ItemKnife copperKnife = new ItemKnife(PebblesArsenal.copperTwoTM,"copper_knife");
    public static ItemGreatSword copperGreatSword = new ItemGreatSword(PebblesArsenal.copperThreeTM, "copper_greatsword");
    public static ItemOre ingotPebble = new ItemOre("ingot_pebble", "ingotPebble");
    public static ItemOre nuggetPebble = new ItemOre("nugget_pebble", "nuggetPebble");


    //Register The Items
    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                nuggetCopper,
                nuggetPebble,
                ingotCopper,
                ingotPebble,
                ingotPebbleAlloy,
                copperKnife,
                copperSword,
                copperGreatSword,
                copperBattleaxe
        );
    }
    //Register the Item Models
    public static void registerModels() {
        nuggetCopper.registerItemModel();
        nuggetPebble.registerItemModel();
        ingotCopper.registerItemModel();
        ingotPebble.registerItemModel();
        ingotPebbleAlloy.registerItemModel();
        copperKnife.registerItemModel();
        copperSword.registerItemModel();
        copperGreatSword.registerItemModel();
        copperBattleaxe.registerItemModel();

    }
}