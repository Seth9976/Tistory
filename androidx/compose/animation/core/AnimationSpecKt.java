package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.y;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001A9\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\b\u001A;\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00018\u0000H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A:\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u001D\u0010\u0014\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A:\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00002\u001D\u0010\u0014\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u00120\u0010\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001AD\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00002\b\b\u0001\u0010\u001C\u001A\u00020\t2\u001D\u0010\u0014\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u00120\u0010\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001D\u001AH\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001E\u001A\u00020\u00012\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010$\u001A\u00020#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'\u001A;\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001E\u001A\u00020\u00012\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b(\u0010)\u001A@\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\b\b\u0002\u0010\"\u001A\u00020!2\b\b\u0002\u0010$\u001A\u00020#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,\u001A3\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\f\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b-\u0010.\u001A%\u00100\u001A\b\u0012\u0004\u0012\u00028\u00000/\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b0\u00101\u001A1\u00106\u001A\b\u0012\u0004\u0012\u00028\u000002\"\u0004\b\u0000\u0010\u00002\f\u00103\u001A\b\u0012\u0004\u0012\u00028\u0000022\u0006\u00105\u001A\u000204H\u0001\u00A2\u0006\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068"}, d2 = {"T", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/TweenSpec;", "tween", "(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/SpringSpec;", "spring", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "init", "Landroidx/compose/animation/core/KeyframesSpec;", "keyframes", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "keyframesWithSpline", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "periodicBias", "(FLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "Landroidx/compose/animation/core/RepeatableSpec;", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "repeatable", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)Landroidx/compose/animation/core/RepeatableSpec;", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "Landroidx/compose/animation/core/SnapSpec;", "snap", "(I)Landroidx/compose/animation/core/SnapSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "startDelayNanos", "delayed", "(Landroidx/compose/animation/core/AnimationSpec;J)Landroidx/compose/animation/core/AnimationSpec;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnimationSpecKt {
    public static final AnimationVector access$convert(TwoWayConverter twoWayConverter0, Object object0) {
        return object0 == null ? null : ((AnimationVector)twoWayConverter0.getConvertToVector().invoke(object0));
    }

    @Stable
    @NotNull
    public static final AnimationSpec delayed(@NotNull AnimationSpec animationSpec0, long v) {
        return new y(animationSpec0, v);
    }

    // 去混淆评级： 低(20)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public static InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v, Object object0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        return AnimationSpecKt.infiniteRepeatable(durationBasedAnimationSpec0, repeatMode0);
    }

    @Stable
    @NotNull
    public static final InfiniteRepeatableSpec infiniteRepeatable-9IiC70o(@NotNull DurationBasedAnimationSpec durationBasedAnimationSpec0, @NotNull RepeatMode repeatMode0, long v) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public static InfiniteRepeatableSpec infiniteRepeatable-9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        return AnimationSpecKt.infiniteRepeatable-9IiC70o(durationBasedAnimationSpec0, repeatMode0, v);
    }

    @Stable
    @NotNull
    public static final KeyframesSpec keyframes(@NotNull Function1 function10) {
        KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0 = new KeyframesSpecConfig();
        function10.invoke(keyframesSpec$KeyframesSpecConfig0);
        return new KeyframesSpec(keyframesSpec$KeyframesSpecConfig0);
    }

    @ExperimentalAnimationSpecApi
    @NotNull
    public static final KeyframesWithSplineSpec keyframesWithSpline(@FloatRange(from = 0.0, to = 1.0) float f, @NotNull Function1 function10) {
        KeyframesWithSplineSpecConfig keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0 = new KeyframesWithSplineSpecConfig();
        function10.invoke(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0);
        return new KeyframesWithSplineSpec(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0, f);
    }

    @ExperimentalAnimationSpecApi
    @NotNull
    public static final KeyframesWithSplineSpec keyframesWithSpline(@NotNull Function1 function10) {
        KeyframesWithSplineSpecConfig keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0 = new KeyframesWithSplineSpecConfig();
        function10.invoke(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0);
        return new KeyframesWithSplineSpec(keyframesWithSplineSpec$KeyframesWithSplineSpecConfig0);
    }

    // 去混淆评级： 低(20)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final RepeatableSpec repeatable(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        return new RepeatableSpec(v, durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public static RepeatableSpec repeatable$default(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        return AnimationSpecKt.repeatable(v, durationBasedAnimationSpec0, repeatMode0);
    }

    @Stable
    @NotNull
    public static final RepeatableSpec repeatable-91I0pcU(int v, @NotNull DurationBasedAnimationSpec durationBasedAnimationSpec0, @NotNull RepeatMode repeatMode0, long v1) {
        return new RepeatableSpec(v, durationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public static RepeatableSpec repeatable-91I0pcU$default(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        return AnimationSpecKt.repeatable-91I0pcU(v, durationBasedAnimationSpec0, repeatMode0, v1);
    }

    @Stable
    @NotNull
    public static final SnapSpec snap(int v) {
        return new SnapSpec(v);
    }

    public static SnapSpec snap$default(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return AnimationSpecKt.snap(v);
    }

    @Stable
    @NotNull
    public static final SpringSpec spring(float f, float f1, @Nullable Object object0) {
        return new SpringSpec(f, f1, object0);
    }

    public static SpringSpec spring$default(float f, float f1, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        return AnimationSpecKt.spring(f, f1, object0);
    }

    @Stable
    @NotNull
    public static final TweenSpec tween(int v, int v1, @NotNull Easing easing0) {
        return new TweenSpec(v, v1, easing0);
    }

    public static TweenSpec tween$default(int v, int v1, Easing easing0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            easing0 = EasingKt.getFastOutSlowInEasing();
        }
        return AnimationSpecKt.tween(v, v1, easing0);
    }
}

