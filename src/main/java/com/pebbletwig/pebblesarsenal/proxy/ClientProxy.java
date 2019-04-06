package com.pebbletwig.pebblesarsenal.proxy;

import com.pebbletwig.pebblesarsenal.PebblesArsenal;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
//The implemented proxy class
public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(PebblesArsenal.modId + ":" + id, "inventory"));
    }
}
