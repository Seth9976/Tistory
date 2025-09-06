package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bg\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BJ \u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0004H\u0016R\u001A\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "scrollAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "calculateScrollDistance", "offset", "size", "containerSize", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BringIntoViewSpec {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "", "offset", "size", "containerSize", "defaultCalculateScrollDistance$foundation_release", "(FFF)F", "defaultCalculateScrollDistance", "Landroidx/compose/animation/core/AnimationSpec;", "b", "Landroidx/compose/animation/core/AnimationSpec;", "getDefaultScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "DefaultScrollAnimationSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "c", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getDefaultBringIntoViewSpec$foundation_release", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final SpringSpec b;
        public static final BringIntoViewSpec.Companion.DefaultBringIntoViewSpec.1 c;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            Companion.c = new BringIntoViewSpec.Companion.DefaultBringIntoViewSpec.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public final float defaultCalculateScrollDistance$foundation_release(float f, float f1, float f2) {
            float f3 = f1 + f;
            if((f < 0.0f || f3 > f2) && (f >= 0.0f || f3 <= f2)) {
                float f4 = f3 - f2;
                return Math.abs(f) < Math.abs(f4) ? f : f4;
            }
            return 0.0f;
        }

        @NotNull
        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation_release() {
            return Companion.c;
        }

        @NotNull
        public final AnimationSpec getDefaultScrollAnimationSpec() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        BringIntoViewSpec.Companion = Companion.a;
    }

    default float calculateScrollDistance(float f, float f1, float f2) {
        return BringIntoViewSpec.Companion.defaultCalculateScrollDistance$foundation_release(f, f1, f2);
    }

    @NotNull
    default AnimationSpec getScrollAnimationSpec() {
        return BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec();
    }
}

