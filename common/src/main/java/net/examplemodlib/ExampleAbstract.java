package net.examplemodlib;

import net.minecraft.client.gui.GuiComponent;

public abstract class ExampleAbstract extends GuiComponent {
    public abstract void doAbstract();

    public void doIt() {
        doAbstract();
    }
}

