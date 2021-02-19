package net.examplemodlib.fabric;

import net.examplemodlib.ExampleModLib;
import net.fabricmc.api.ModInitializer;

public class ExampleModLibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleModLib.init();
    }
}
