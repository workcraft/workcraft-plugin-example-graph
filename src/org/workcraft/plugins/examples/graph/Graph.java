package org.workcraft.plugins.examples.graph;

import org.workcraft.dom.Container;
import org.workcraft.dom.math.AbstractMathModel;
import org.workcraft.serialisation.References;

public class Graph extends AbstractMathModel {

    public Graph() {
        this(null, null);
    }

    public Graph(Container root, References refs) {
        super(root, refs);
    }
}
