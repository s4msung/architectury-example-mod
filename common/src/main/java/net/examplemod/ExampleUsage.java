package net.examplemod;

import net.examplemodlib.Example;
import net.examplemodlib.ExampleAbstract;
import net.examplemodlib.ExampleInterface;

public class ExampleUsage extends ExampleAbstract implements ExampleInterface {
    protected String id = "ExampleUsage";
    protected Example example = new Example();

    @Override
    public String getId() {
        return String.format("[%s] %s", id, example.getExample());
    }

    @Override
    public void doAbstract() {
    }

    @Override
    public boolean isSomething() {
        return true;
    }
}
