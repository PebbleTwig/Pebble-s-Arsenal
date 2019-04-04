package com.pebbletwig.pebblesarsenal.item.tool;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;

public class ItemSword extends net.minecraft.item.ItemSword {
    //Name of Sword
    private String name;
    //Constructor for the Sword
    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name=name;
        setCreativeTab(PebblesArsenal.creativeTab);
    }
    //Register the Item Model
    public void registerItemModel() {
        PebblesArsenal.proxy.registerItemRenderer(this, 0, name);
    }

}