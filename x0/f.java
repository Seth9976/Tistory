package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Shape A;
    public final PullToRefreshState w;
    public final boolean x;
    public final float y;
    public final float z;

    public f(PullToRefreshState pullToRefreshState0, boolean z, float f, float f1, Shape shape0) {
        this.w = pullToRefreshState0;
        this.x = z;
        this.y = f;
        this.z = f1;
        this.A = shape0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = 0.0f;
        boolean z = Float.compare(this.w.getDistanceFraction(), 0.0f) > 0 || this.x;
        ((GraphicsLayerScope)object0).setTranslationY(this.w.getDistanceFraction() * ((float)((GraphicsLayerScope)object0).roundToPx-0680j_4(this.y)) - Size.getHeight-impl(((GraphicsLayerScope)object0).getSize-NH-jbRc()));
        if(z) {
            f = ((GraphicsLayerScope)object0).toPx-0680j_4(this.z);
        }
        ((GraphicsLayerScope)object0).setShadowElevation(f);
        ((GraphicsLayerScope)object0).setShape(this.A);
        ((GraphicsLayerScope)object0).setClip(true);
        return Unit.INSTANCE;
    }
}

