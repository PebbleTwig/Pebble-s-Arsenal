package com.pebbletwig.pebblesarsenal.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

//A base proxy class
@Mod.EventBusSubscriber
public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
    }
/*
    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "modtut.cfg"));
        Config.readConfig();


    }


    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
*/
}
