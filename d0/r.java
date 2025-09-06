package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class r extends Node implements DrawModifierNode {
    public LazyLayoutItemAnimator n;

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        List list0 = this.n.i;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = (LazyLayoutItemAnimation)list0.get(v1);
            GraphicsLayer graphicsLayer0 = lazyLayoutItemAnimation0.getLayer();
            if(graphicsLayer0 != null) {
                float f = ((float)IntOffset.getX-impl(lazyLayoutItemAnimation0.getFinalOffset-nOcc-ac())) - ((float)IntOffset.getX-impl(graphicsLayer0.getTopLeft-nOcc-ac()));
                float f1 = ((float)IntOffset.getY-impl(lazyLayoutItemAnimation0.getFinalOffset-nOcc-ac())) - ((float)IntOffset.getY-impl(graphicsLayer0.getTopLeft-nOcc-ac()));
                contentDrawScope0.getDrawContext().getTransform().translate(f, f1);
                try {
                    GraphicsLayerKt.drawLayer(contentDrawScope0, graphicsLayer0);
                }
                finally {
                    contentDrawScope0.getDrawContext().getTransform().translate(-f, -f1);
                }
            }
        }
        contentDrawScope0.drawContent();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof r ? Intrinsics.areEqual(this.n, ((r)object0).n) : false;
    }

    @Override
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        this.n.j = this;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        this.n.reset();
    }

    @Override
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.n + ')';
    }
}

