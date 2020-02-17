package org.workcraft.plugins.examples.graph;

import org.workcraft.dom.visual.AbstractVisualModel;
import org.workcraft.dom.visual.VisualGroup;
import org.workcraft.dom.generators.DefaultNodeGenerator;
import org.workcraft.gui.tools.*;

import java.util.ArrayList;
import java.util.List;

public class VisualGraph extends AbstractVisualModel {

    public VisualGraph(Graph model) {
        this(model, null);
    }

    public VisualGraph(Graph model, VisualGroup root) {
        super(model, root);
        setGraphEditorTools();
    }

    private void setGraphEditorTools() {
        List<GraphEditorTool> tools = new ArrayList<>();
        tools.add(new SelectionTool());
        tools.add(new CommentGeneratorTool());
        tools.add(new ConnectionTool());
        tools.add(new NodeGeneratorTool(new DefaultNodeGenerator(Vertex.class)));
        setGraphEditorTools(tools);
    }
}
