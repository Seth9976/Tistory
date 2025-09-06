package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vf extends Lambda implements Function1 {
    public final int w;
    public final DrawerPredictiveBackState x;
    public final boolean y;

    public vf(DrawerPredictiveBackState drawerPredictiveBackState0, boolean z, int v) {
        this.w = v;
        this.x = drawerPredictiveBackState0;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((GraphicsLayerScope)object0).setScaleX(NavigationDrawerKt.access$calculatePredictiveBackScaleX(((GraphicsLayerScope)object0), this.x));
            ((GraphicsLayerScope)object0).setScaleY(NavigationDrawerKt.access$calculatePredictiveBackScaleY(((GraphicsLayerScope)object0), this.x));
            ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(TransformOriginKt.TransformOrigin((this.y ? 1.0f : 0.0f), 0.5f));
            return Unit.INSTANCE;
        }
        float f = NavigationDrawerKt.access$calculatePredictiveBackScaleX(((GraphicsLayerScope)object0), this.x);
        float f1 = 1.0f;
        ((GraphicsLayerScope)object0).setScaleX((Float.compare(f, 0.0f) == 0 ? 1.0f : NavigationDrawerKt.access$calculatePredictiveBackScaleY(((GraphicsLayerScope)object0), this.x) / f));
        if(this.y) {
            f1 = 0.0f;
        }
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(TransformOriginKt.TransformOrigin(f1, 0.0f));
        return Unit.INSTANCE;
    }
}

