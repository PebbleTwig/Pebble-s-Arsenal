package com.pebbletwig.pebblesarsenal.client;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import com.pebbletwig.pebblesarsenal.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PebbleTab extends CreativeTabs{
    //Constructor for the Mod's Creative Tab
    public PebbleTab() {
        super(PebblesArsenal.modId);
    }
    //Give the icon for the tab the amazing Pebble Ingot
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotPebble);
    }
}
