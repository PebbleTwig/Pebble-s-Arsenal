package com.pebbletwig.pebblesarsenal.recipe;

import com.pebbletwig.pebblesarsenal.block.ModBlocks;
import com.pebbletwig.pebblesarsenal.item.ModItems;
//This class init.s Items & Blocks to the OreDict & registers smelting recipes as well
public class ModRecipes {

    public static void init() {
        //Ore Dictionary
        ModBlocks.oreCopper.initOreDict();
        ModBlocks.orePebble.initOreDict();
        ModItems.ingotCopper.initOreDict();
        ModBlocks.blockPebble.initOreDict();
        ModItems.nuggetCopper.initOreDict();
        ModItems.ingotPebble.initOreDict();
        ModBlocks.blockPebble.initOreDict();
        ModItems.nuggetPebble.initOreDict();
        ModItems.ingotPebbleAlloy.initOreDict();
        ModBlocks.blockCopper.initOreDict();
        ModItems.nuggetPebbleAlloy.initOreDict();
        ModBlocks.blockPebbleAlloy.initOreDict();
        ModBlocks.oreTin.initOreDict();
        ModBlocks.blockTin.initOreDict();
        ModItems.ingotTin.initOreDict();
        ModItems.nuggetTin.initOreDict();
        //Regular Smelting
        /*
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
        GameRegistry.addSmelting(ModBlocks.orePebble, new ItemStack(ModItems.ingotPebble), 0.7f);
        GameRegistry.addSmelting(ModItems.copperSword, new ItemStack(ModItems.nuggetCopper), 0.7f);
        GameRegistry.addSmelting(ModItems.copperGreatSword, new ItemStack(ModItems.nuggetCopper), 0.7f);
        GameRegistry.addSmelting(ModItems.copperKnife, new ItemStack(ModItems.nuggetCopper), 0.7f);
        //GameRegistry.addSmelting(ModItems.copperBattleaxe, new ItemStack(ModItems.nuggetCopper), 0.7f);
        */
    }
    public static void init2() {
        //Ore Dictionary
        ModBlocks.orePebble.initOreDict();
        ModBlocks.blockPebble.initOreDict();
        ModItems.ingotPebble.initOreDict();
        ModBlocks.blockPebble.initOreDict();
        ModItems.nuggetPebble.initOreDict();
        ModItems.ingotPebbleAlloy.initOreDict();
        ModItems.nuggetPebbleAlloy.initOreDict();
        ModBlocks.blockPebbleAlloy.initOreDict();
    }
}
