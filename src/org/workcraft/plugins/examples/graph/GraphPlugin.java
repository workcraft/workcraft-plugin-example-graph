package org.workcraft.plugins.examples.graph;

import org.workcraft.Framework;
import org.workcraft.plugins.Plugin;
import org.workcraft.plugins.PluginManager;

@SuppressWarnings("unused")
public class GraphPlugin implements Plugin {

    @Override
    public String getDescription() {
        return "Directed Graph plugin (example)";
    }

    @Override
    public void init() {
        final Framework framework = Framework.getInstance();
        final PluginManager pm = framework.getPluginManager();
        pm.registerModelDescriptor(GraphDescriptor.class);
    }
}