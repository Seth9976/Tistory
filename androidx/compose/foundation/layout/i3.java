package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;

public final class i3 extends Node implements LayoutModifierNode {
    public float n;
    public float o;
    public boolean p;

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new h3(this, placeable0, measureScope0), 4, null);
    }
}

