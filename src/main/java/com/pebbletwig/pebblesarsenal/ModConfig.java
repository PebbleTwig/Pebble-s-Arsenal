package com.pebbletwig.pebblesarsenal;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid=PebblesArsenal.modId)
@Config.LangKey("pebblesarsenal.config.title")
public class ModConfig {

        @Config.Comment("Set this to true to disable anything related to anything Thermal may provide ex. Copper & Tin. Note, this will disable this mod's materials and base swords, leaving knives and greatswords. Lastly, it will prevent the items from being registered, so they will disappear if you enable this after creating any swords.")
        @Config.RequiresMcRestart
        public static boolean disableThermal = false;



        @Mod.EventBusSubscriber(modid = PebblesArsenal.modId)
        private static class EventHandler {
            @SubscribeEvent
            public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
                if (event.getModID().equals(PebblesArsenal.modId)) {
                    ConfigManager.sync(PebblesArsenal.modId, Config.Type.INSTANCE);
                }
            }
        }

        public static boolean getDisableThermal() {
            return disableThermal;
        }

}
