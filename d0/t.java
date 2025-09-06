package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimatorKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class t {
    public LazyLayoutItemAnimation[] a;
    public Constraints b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final LazyLayoutItemAnimator h;

    public t(LazyLayoutItemAnimator lazyLayoutItemAnimator0) {
        this.h = lazyLayoutItemAnimator0;
        this.a = LazyLayoutItemAnimatorKt.a;
        this.e = 1;
    }

    public final void a(LazyLayoutMeasuredItem lazyLayoutMeasuredItem0, CoroutineScope coroutineScope0, GraphicsContext graphicsContext0, int v, int v1, int v2) {
        LazyLayoutItemAnimation[] arr_lazyLayoutItemAnimation = this.a;
        for(int v4 = 0; true; ++v4) {
            if(v4 >= arr_lazyLayoutItemAnimation.length) {
                this.f = v;
                this.g = v1;
                break;
            }
            LazyLayoutItemAnimation lazyLayoutItemAnimation0 = arr_lazyLayoutItemAnimation[v4];
            if(lazyLayoutItemAnimation0 != null && lazyLayoutItemAnimation0.isRunningMovingAwayAnimation()) {
                break;
            }
        }
        for(int v5 = lazyLayoutMeasuredItem0.getPlaceablesCount(); v5 < this.a.length; ++v5) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation1 = this.a[v5];
            if(lazyLayoutItemAnimation1 != null) {
                lazyLayoutItemAnimation1.release();
            }
        }
        if(this.a.length != lazyLayoutMeasuredItem0.getPlaceablesCount()) {
            Object[] arr_object = Arrays.copyOf(this.a, lazyLayoutMeasuredItem0.getPlaceablesCount());
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.a = (LazyLayoutItemAnimation[])arr_object;
        }
        this.b = Constraints.box-impl(lazyLayoutMeasuredItem0.getConstraints-msEJaDk());
        this.c = v2;
        this.d = lazyLayoutMeasuredItem0.getLane();
        this.e = lazyLayoutMeasuredItem0.getSpan();
        int v6 = lazyLayoutMeasuredItem0.getPlaceablesCount();
        for(int v3 = 0; v3 < v6; ++v3) {
            LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode0 = LazyLayoutItemAnimatorKt.access$getSpecs(lazyLayoutMeasuredItem0.getParentData(v3));
            if(lazyLayoutAnimationSpecsNode0 == null) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.a[v3];
                if(lazyLayoutItemAnimation2 != null) {
                    lazyLayoutItemAnimation2.release();
                }
                this.a[v3] = null;
            }
            else {
                LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.a[v3];
                if(lazyLayoutItemAnimation3 == null) {
                    lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope0, graphicsContext0, new s(this.h, 0));
                    this.a[v3] = lazyLayoutItemAnimation3;
                }
                lazyLayoutItemAnimation3.setFadeInSpec(lazyLayoutAnimationSpecsNode0.getFadeInSpec());
                lazyLayoutItemAnimation3.setPlacementSpec(lazyLayoutAnimationSpecsNode0.getPlacementSpec());
                lazyLayoutItemAnimation3.setFadeOutSpec(lazyLayoutAnimationSpecsNode0.getFadeOutSpec());
            }
        }
    }
}

