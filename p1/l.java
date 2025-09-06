package p1;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

public final class l implements RememberObserver {
    public final GraphicsContext a;
    public final GraphicsLayer b;

    public l(GraphicsContext graphicsContext0) {
        this.a = graphicsContext0;
        this.b = graphicsContext0.createGraphicsLayer();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        this.a.releaseGraphicsLayer(this.b);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.a.releaseGraphicsLayer(this.b);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}

