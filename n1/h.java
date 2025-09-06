package n1;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;

public final class h implements GraphicsContext {
    public MutableObjectList a;
    public GraphicsContext b;

    public final void a() {
        MutableObjectList mutableObjectList0 = this.a;
        if(mutableObjectList0 != null) {
            Object[] arr_object = mutableObjectList0.content;
            int v = mutableObjectList0._size;
            for(int v1 = 0; v1 < v; ++v1) {
                this.releaseGraphicsLayer(((GraphicsLayer)arr_object[v1]));
            }
            mutableObjectList0.clear();
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer createGraphicsLayer() {
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 == null) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayer0 = graphicsContext0.createGraphicsLayer();
        MutableObjectList mutableObjectList0 = this.a;
        if(mutableObjectList0 == null) {
            this.a = ObjectListKt.mutableObjectListOf(graphicsLayer0);
            return graphicsLayer0;
        }
        mutableObjectList0.add(graphicsLayer0);
        return graphicsLayer0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final void releaseGraphicsLayer(GraphicsLayer graphicsLayer0) {
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 != null) {
            graphicsContext0.releaseGraphicsLayer(graphicsLayer0);
        }
    }
}

