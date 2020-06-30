package org.workcraft.plugins.examples.graph;

import org.workcraft.dom.generators.DefaultNodeGenerator;
import org.workcraft.dom.visual.AbstractVisualModel;
import org.workcraft.dom.visual.VisualGroup;
import org.workcraft.gui.tools.CommentGeneratorTool;
import org.workcraft.gui.tools.ConnectionTool;
import org.workcraft.gui.tools.NodeGeneratorTool;
import org.workcraft.gui.tools.SelectionTool;

public class VisualGraph extends AbstractVisualModel {

    public VisualGraph(Graph model) {
        this(model, null);
    }

    public VisualGraph(Graph model, VisualGroup root) {
        super(model, root);
    }

    @Override
    public void registerGraphEditorTools() {
        addGraphEditorTool(new SelectionTool());
        addGraphEditorTool(new CommentGeneratorTool());
        addGraphEditorTool(new ConnectionTool());
        addGraphEditorTool(new NodeGeneratorTool(new DefaultNodeGenerator(Vertex.class)));
    }

}
