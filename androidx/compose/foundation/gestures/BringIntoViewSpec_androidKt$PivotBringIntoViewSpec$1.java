package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\'\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/gestures/BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "offset", "size", "containerSize", "calculateScrollDistance", "(FFF)F", "Landroidx/compose/animation/core/AnimationSpec;", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "scrollAnimationSpec", "parentFraction", "F", "getParentFraction", "()F", "childFraction", "getChildFraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BringIntoViewSpec_androidKt.PivotBringIntoViewSpec.1 implements BringIntoViewSpec {
    public final TweenSpec a;

    public BringIntoViewSpec_androidKt.PivotBringIntoViewSpec.1() {
        this.a = AnimationSpecKt.tween$default(0x7D, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2, null);
    }

    @Override  // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f, float f1, float f2) {
        float f3 = Math.abs(f1 + f - f);
        return f - (f3 > f2 || f2 - (0.3f * f2 - 0.0f * f3) >= f3 ? 0.3f * f2 - 0.0f * f3 : f2 - f3);
    }

    public final float getChildFraction() {
        return 0.0f;
    }

    public final float getParentFraction() {
        return 0.3f;
    }

    @Override  // androidx.compose.foundation.gestures.BringIntoViewSpec
    @NotNull
    public AnimationSpec getScrollAnimationSpec() {
        return this.a;
    }
}

