package androidx.activity;

import android.graphics.Rect;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

public final class e0 implements View.OnLayoutChangeListener {
    public final int a;
    public final Object b;

    public e0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        if(this.a != 0) {
            CarouselLayoutManager carouselLayoutManager0 = (CarouselLayoutManager)this.b;
            carouselLayoutManager0.getClass();
            if(v != v4 || v1 != v5 || v2 != v6 || v3 != v7) {
                view0.post(new h(carouselLayoutManager0, 10));
            }
            return;
        }
        if(v != v4 || v2 != v6 || v1 != v5 || v3 != v7) {
            Intrinsics.checkNotNullExpressionValue(view0, "v");
            Rect rect0 = PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view0);
            ((ProducerScope)this.b).trySend-JP2dKIU(rect0);
        }
    }
}

