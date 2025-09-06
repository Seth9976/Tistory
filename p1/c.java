package p1;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;

public final class c implements GraphicsContext {
    public final ViewGroup a;
    public final Object b;
    public ViewLayerContainer c;
    public static boolean d;

    static {
        c.d = true;
    }

    public c(ViewGroup viewGroup0) {
        this.a = viewGroup0;
        this.b = new Object();
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer createGraphicsLayer() {
        ViewLayerContainer viewLayerContainer5;
        ViewLayerContainer viewLayerContainer2;
        GraphicsLayerV29 graphicsLayerV290;
        synchronized(this.b) {
            int v1 = Build.VERSION.SDK_INT;
            long v2 = v1 < 29 ? -1L : b.a(this.a);
            if(v1 >= 29) {
                graphicsLayerV290 = new GraphicsLayerV29(v2, null, null, 6, null);
            }
            else if(c.d) {
                try {
                    graphicsLayerV290 = new GraphicsLayerV23(this.a, v2, null, null, 12, null);
                }
                catch(Throwable unused_ex) {
                    c.d = false;
                    ViewGroup viewGroup0 = this.a;
                    ViewLayerContainer viewLayerContainer0 = this.c;
                    if(viewLayerContainer0 == null) {
                        ViewLayerContainer viewLayerContainer1 = new ViewLayerContainer(viewGroup0.getContext());
                        viewGroup0.addView(viewLayerContainer1);
                        this.c = viewLayerContainer1;
                        viewLayerContainer2 = viewLayerContainer1;
                    }
                    else {
                        viewLayerContainer2 = viewLayerContainer0;
                    }
                    graphicsLayerV290 = new GraphicsViewLayer(viewLayerContainer2, v2, null, null, 12, null);
                }
            }
            else {
                ViewGroup viewGroup1 = this.a;
                ViewLayerContainer viewLayerContainer3 = this.c;
                if(viewLayerContainer3 == null) {
                    ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(viewGroup1.getContext());
                    viewGroup1.addView(viewLayerContainer4);
                    this.c = viewLayerContainer4;
                    viewLayerContainer5 = viewLayerContainer4;
                }
                else {
                    viewLayerContainer5 = viewLayerContainer3;
                }
                graphicsLayerV290 = new GraphicsViewLayer(viewLayerContainer5, v2, null, null, 12, null);
            }
            return new GraphicsLayer(graphicsLayerV290, null);
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsContext
    public final void releaseGraphicsLayer(GraphicsLayer graphicsLayer0) {
        synchronized(this.b) {
            graphicsLayer0.release$ui_graphics_release();
        }
    }
}

