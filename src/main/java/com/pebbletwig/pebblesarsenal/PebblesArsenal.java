package com.pebbletwig.pebblesarsenal;


import com.pebbletwig.pebblesarsenal.block.ModBlocks;
import com.pebbletwig.pebblesarsenal.client.PebbleTab;
import com.pebbletwig.pebblesarsenal.item.ModItems;
import com.pebbletwig.pebblesarsenal.proxy.CommonProxy;
import com.pebbletwig.pebblesarsenal.recipe.ModRecipes;
import com.pebbletwig.pebblesarsenal.world.ModWorldGen;
//import jdk.internal.instrumentation.Logger;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = PebblesArsenal.modId, name = PebblesArsenal.name, version = PebblesArsenal.version)
public class PebblesArsenal {
    //Mod Info
    public static final String modId = "pebblesarsenal";
    public static final String name = "Pebble's Arsenal";
    public static final String version = "0.1.1";
    //Create a new Creative Tab
    public static final PebbleTab creativeTab = new PebbleTab();
    //Init. Tool Materials
    public static final Item.ToolMaterial copperTM = EnumHelper.addToolMaterial("COPPER", 2, 500, 1, 1, 14);
    public static final Item.ToolMaterial pebbleTM = EnumHelper.addToolMaterial("PEBBLE", 2, 600, 1, 1, 16);
    public static final Item.ToolMaterial pebbleAlloyTM = EnumHelper.addToolMaterial("PEBBLE_ALLOY", 2, 850,1, 2, 18);

    @Mod.Instance(modId)
    public static PebblesArsenal instance;
    //Not using this logger but commenting out in case I need it later
    //public static Logger logger;
    //Various Event Handlers
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is initializing!");
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        /*
        ConfigHandler.init();
        ConfigHandler.setFile("pebblesarsenal.cfg");
        ConfigHandler.writeConfig("Pebble's Arsenal", "thisModsBaseSwordsEnabled", true);
        */
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //System.out.println(name +" is done initializing!");
    }
    //Creating my proxy
    @SidedProxy(serverSide = "com.pebbletwig.pebblesarsenal.proxy.CommonProxy", clientSide = "com.pebbletwig.pebblesarsenal.proxy.ClientProxy")
    public static CommonProxy proxy;
    //Registration stuff
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            if(ModConfig.getDisableThermal()==false){
                ModItems.register(event.getRegistry());
                ModBlocks.registerItemBlocks(event.getRegistry());
            } else if(ModConfig.getDisableThermal()==true) {
                ModItems.register2(event.getRegistry());
                ModBlocks.registerItemBlocks2(event.getRegistry());
            }


        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
           if(ModConfig.getDisableThermal()==false){
               ModItems.registerModels();
               ModBlocks.registerModels();
           } else if (ModConfig.getDisableThermal()==true){
               ModItems.registerModels2();
               ModBlocks.registerModels2();
           }


        }
    }
}