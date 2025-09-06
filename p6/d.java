package p6;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class d extends Lambda implements Function1 {
    public final MutableState A;
    public final int w;
    public final boolean x;
    public final SwipeRefreshState y;
    public final float z;

    public d(int v, boolean z, SwipeRefreshState swipeRefreshState0, float f, MutableState mutableState0) {
        this.w = v;
        this.x = z;
        this.y = swipeRefreshState0;
        this.z = f;
        this.A = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setTranslationY(SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4(this.A) - ((float)this.w));
        float f = !this.x || this.y.isRefreshing() ? 1.0f : c.coerceIn(EasingKt.getLinearOutSlowInEasing().transform(SwipeRefreshIndicatorKt.access$SwipeRefreshIndicator__UAkqwU$lambda$4(this.A) / c.coerceAtLeast(this.z, 1.0f)), 0.0f, 1.0f);
        ((GraphicsLayerScope)object0).setScaleX(f);
        ((GraphicsLayerScope)object0).setScaleY(f);
        return Unit.INSTANCE;
    }
}

