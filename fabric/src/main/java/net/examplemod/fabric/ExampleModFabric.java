package net.examplemod.fabric;

import net.examplemod.ExampleMod;
import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        ExampleMod.init();
    }
}
