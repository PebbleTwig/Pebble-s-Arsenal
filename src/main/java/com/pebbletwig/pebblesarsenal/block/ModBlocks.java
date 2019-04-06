package com.pebbletwig.pebblesarsenal.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
//This is the class that creates & registers the Mod's Custom Blocks
public class ModBlocks {
    //Init. the Mod's Custome Blocks
    public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper");
    public static BlockOre blockCopper = new BlockOre("block_copper", "blockCopper");
    public static BlockOre orePebble = new BlockOre("ore_pebble", "orePebble");
    public static BlockOre blockPebble = new BlockOre("block_pebble", "blockPebble");
    public static BlockOre blockPebbleAlloy = new BlockOre("block_pebble_alloy", "blockPebbleAlloy");

    //Register the Blocks part 1
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                blockCopper,
                orePebble,
                blockPebble,
                blockPebbleAlloy
        );
    }
    //Register the Blocks part 2
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                orePebble.createItemBlock(),
                blockCopper.createItemBlock(),
                blockPebble.createItemBlock(),
                blockPebbleAlloy.createItemBlock()
        );
    }
    public static void registerItemBlocks2(IForgeRegistry<Item> registry) {
        registry.registerAll(
                orePebble.createItemBlock(),
                blockPebble.createItemBlock(),
                blockPebbleAlloy.createItemBlock()
        );
    }

    //Register the Item Models
    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        orePebble.registerItemModel(Item.getItemFromBlock(orePebble));
        blockCopper.registerItemModel(Item.getItemFromBlock(blockCopper));
        blockPebble.registerItemModel(Item.getItemFromBlock(blockPebble));
        blockPebbleAlloy.registerItemModel((Item.getItemFromBlock(blockPebbleAlloy)));
    }
    public static void registerModels2() {
        orePebble.registerItemModel(Item.getItemFromBlock(orePebble));
        blockPebble.registerItemModel(Item.getItemFromBlock(blockPebble));
        blockPebbleAlloy.registerItemModel((Item.getItemFromBlock(blockPebbleAlloy)));
    }

}
