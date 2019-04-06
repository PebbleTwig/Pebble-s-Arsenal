package com.pebbletwig.pebblesarsenal.item;

import net.minecraftforge.oredict.OreDictionary;
//This class builds off of ItemBase by adding Forge Ore Dictionary support
public class ItemOre extends ItemBase {
    //This is the OreDict name of the item
    private String oreName;
    //Constructor for the OreDict Item
    public ItemOre(String name, String oreName) {
        super(name);

        this.oreName=oreName;
    }
    //Method to allow the item to be registered in the OreDict
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

}
