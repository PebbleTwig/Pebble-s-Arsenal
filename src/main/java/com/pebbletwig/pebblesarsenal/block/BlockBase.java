package com.pebbletwig.pebblesarsenal.block;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    //Name for the block
    protected String name;
    //Constructor for the Block
    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //Register the Item Model
    public void registerItemModel(Item itemBlock) {
        PebblesArsenal.proxy.registerItemRenderer(itemBlock, 0, name);
    }
    //Create the Item Block
    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}