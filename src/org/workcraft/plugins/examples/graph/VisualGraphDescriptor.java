package org.workcraft.plugins.examples.graph;

import org.workcraft.dom.VisualModelDescriptor;
import org.workcraft.dom.math.MathModel;
import org.workcraft.exceptions.VisualModelInstantiationException;

public class VisualGraphDescriptor implements VisualModelDescriptor {

    @Override
    public VisualGraph create(MathModel mathModel) throws VisualModelInstantiationException {
        if (mathModel instanceof Graph) {
            return new VisualGraph((Graph) mathModel);
        }
        throw new VisualModelInstantiationException("Unsupported math model type.");
    }
}
