package net.examplemodlib.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.examplemodlib.ExampleModLib;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleModLib.MOD_ID)
public class ExampleModLibForge {
    public ExampleModLibForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleModLib.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleModLib.init();
    }
}
