package org.workcraft.plugins.examples.graph;

import org.workcraft.dom.ModelDescriptor;

public class GraphDescriptor implements ModelDescriptor {

    @Override
    public String getDisplayName() {
        return "Directed Graph (example)";
    }

    @Override
    public Graph createMathModel() {
        return new Graph();
    }

    @Override
    public VisualGraphDescriptor getVisualModelDescriptor() {
        return new VisualGraphDescriptor();
    }
}
