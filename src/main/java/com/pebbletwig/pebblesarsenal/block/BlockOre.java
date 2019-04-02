package com.pebbletwig.pebblesarsenal.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
//This class builds on BlockBase by implementing the Forge Ore Dictionary
public class BlockOre extends BlockBase{
    //Name for the Block
    private String oreName;
    //Constructor for the OreDict Block
    public BlockOre(String name, String oreName) {
        super(Material.ROCK, name);

        this.oreName = oreName;

        setHardness(3f);
        setResistance(5f);
    }
    //Method to register the Block into the OreDict
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

}
