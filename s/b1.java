package s;

import androidx.compose.animation.LayerRenderer;
import androidx.compose.animation.RenderInTransitionOverlayNode;
import androidx.compose.animation.SharedElementInternalState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import r0.a;

public final class b1 implements LayerRenderer {
    public final GraphicsLayer a;
    public final RenderInTransitionOverlayNode b;

    public b1(RenderInTransitionOverlayNode renderInTransitionOverlayNode0, GraphicsLayer graphicsLayer0) {
        this.b = renderInTransitionOverlayNode0;
        this.a = graphicsLayer0;
    }

    @Override  // androidx.compose.animation.LayerRenderer
    public final void drawInOverlay(DrawScope drawScope0) {
        RenderInTransitionOverlayNode renderInTransitionOverlayNode0 = this.b;
        if(((Boolean)renderInTransitionOverlayNode0.getRenderInOverlay().invoke()).booleanValue()) {
            long v = renderInTransitionOverlayNode0.getSharedScope().getRoot$animation_release().localPositionOf-R5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode0), 0L);
            float f = Offset.getX-impl(v);
            float f1 = Offset.getY-impl(v);
            Path path0 = (Path)renderInTransitionOverlayNode0.getClipInOverlay().invoke(drawScope0.getLayoutDirection(), DelegatableNodeKt.requireDensity(renderInTransitionOverlayNode0));
            GraphicsLayer graphicsLayer0 = this.a;
            if(path0 != null) {
                DrawContext drawContext0 = drawScope0.getDrawContext();
                long v1 = drawContext0.getSize-NH-jbRc();
                drawContext0.getCanvas().save();
                try {
                    drawContext0.getTransform().clipPath-mtrdD-E(path0, 1);
                    drawScope0.getDrawContext().getTransform().translate(f, f1);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope0, graphicsLayer0);
                    }
                    catch(Throwable throwable0) {
                        drawScope0.getDrawContext().getTransform().translate(-f, -f1);
                        throw throwable0;
                    }
                    drawScope0.getDrawContext().getTransform().translate(-f, -f1);
                }
                finally {
                    a.y(drawContext0, v1);
                }
                return;
            }
            drawScope0.getDrawContext().getTransform().translate(f, f1);
            try {
                GraphicsLayerKt.drawLayer(drawScope0, graphicsLayer0);
            }
            finally {
                drawScope0.getDrawContext().getTransform().translate(-f, -f1);
            }
        }
    }

    @Override  // androidx.compose.animation.LayerRenderer
    public final SharedElementInternalState getParentState() {
        return this.b.getParentState();
    }

    @Override  // androidx.compose.animation.LayerRenderer
    public final float getZIndex() {
        return this.b.getZIndexInOverlay();
    }
}

