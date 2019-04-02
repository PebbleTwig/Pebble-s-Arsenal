package com.pebbletwig.pebblesarsenal.item;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import net.minecraft.item.Item;
//Item Base class for Modded Items
public class ItemBase extends Item {
    //Name of Modded Item
    protected String name;
    //Constructor for Modded Item
    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //Register the Item Model of the Modded Item
    public void registerItemModel() {
        PebblesArsenal.proxy.registerItemRenderer(this, 0, name);
    }
}
