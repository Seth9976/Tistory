package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.b4;
import z.d4;
import z.e4;
import z.f4;
import z.g4;
import z.h4;
import z.j0;
import z.z3;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AS\u0010\u0000\u001A\u00020\u00012K\u0010\u0002\u001AG\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0003\u001AZ\u0010\f\u001A\u00020\u00012K\u0010\u0002\u001AG\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0003H\u0007\u00A2\u0006\u0002\u0010\r\u001A/\u0010\u000E\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\b2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A*\u0010\u0014\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u00042\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@\u00A2\u0006\u0002\u0010\u0016\u001A*\u0010\u0017\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u00042\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@\u00A2\u0006\u0002\u0010\u0016\u001A\u001F\u0010\u0019\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\bH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u001A\u0010\u001C\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u0004H\u0086@\u00A2\u0006\u0002\u0010\u001D\u001A\u001C\u0010\u001E\u001A\u00020\u000B*\u00020\u00012\b\b\u0002\u0010\u001F\u001A\u00020 H\u0086@\u00A2\u0006\u0002\u0010!\u001A\u001A\u0010\"\u001A\u00020\u000B*\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u0004H\u0086@\u00A2\u0006\u0002\u0010\u001D\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#"}, d2 = {"TransformableState", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "animatePanBy", "offset", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateRotateBy", "degrees", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateZoomBy", "zoomFactor", "panBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTransformation", "terminationPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zoomBy", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,262:1\n1223#2,6:263\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:263,6\n*E\n"})
public final class TransformableStateKt {
    @NotNull
    public static final TransformableState TransformableState(@NotNull Function3 function30) {
        return new j0(function30);
    }

    @Nullable
    public static final Object animatePanBy-ubNVwUQ(@NotNull TransformableState transformableState0, long v, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        LongRef ref$LongRef0 = new LongRef();
        ref$LongRef0.element = 0L;
        Object object0 = TransformableState.transform$default(transformableState0, null, new z3(ref$LongRef0, v, animationSpec0, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animatePanBy-ubNVwUQ$default(TransformableState transformableState0, long v, AnimationSpec animationSpec0, Continuation continuation0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.animatePanBy-ubNVwUQ(transformableState0, v, animationSpec0, continuation0);
    }

    @Nullable
    public static final Object animateRotateBy(@NotNull TransformableState transformableState0, float f, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        Object object0 = TransformableState.transform$default(transformableState0, null, new b4(f, animationSpec0, null, new FloatRef()), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateRotateBy$default(TransformableState transformableState0, float f, AnimationSpec animationSpec0, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.animateRotateBy(transformableState0, f, animationSpec0, continuation0);
    }

    @Nullable
    public static final Object animateZoomBy(@NotNull TransformableState transformableState0, float f, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0");
        }
        FloatRef ref$FloatRef0 = new FloatRef();
        ref$FloatRef0.element = 1.0f;
        Object object0 = TransformableState.transform$default(transformableState0, null, new d4(f, animationSpec0, null, ref$FloatRef0), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateZoomBy$default(TransformableState transformableState0, float f, AnimationSpec animationSpec0, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return TransformableStateKt.animateZoomBy(transformableState0, f, animationSpec0, continuation0);
    }

    @Nullable
    public static final Object panBy-d-4ec7I(@NotNull TransformableState transformableState0, long v, @NotNull Continuation continuation0) {
        Object object0 = TransformableState.transform$default(transformableState0, null, new e4(v, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Composable
    @NotNull
    public static final TransformableState rememberTransformableState(@NotNull Function3 function30, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x64386C11, v, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(function30, composer0, v & 14);
        TransformableState transformableState0 = composer0.rememberedValue();
        if(transformableState0 == Composer.Companion.getEmpty()) {
            transformableState0 = TransformableStateKt.TransformableState(new e0(state0, 16));
            composer0.updateRememberedValue(transformableState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState0;
    }

    @Nullable
    public static final Object rotateBy(@NotNull TransformableState transformableState0, float f, @NotNull Continuation continuation0) {
        Object object0 = TransformableState.transform$default(transformableState0, null, new f4(f, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object stopTransformation(@NotNull TransformableState transformableState0, @NotNull MutatePriority mutatePriority0, @NotNull Continuation continuation0) {
        Object object0 = transformableState0.transform(mutatePriority0, new g4(2, null), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object stopTransformation$default(TransformableState transformableState0, MutatePriority mutatePriority0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return TransformableStateKt.stopTransformation(transformableState0, mutatePriority0, continuation0);
    }

    @Nullable
    public static final Object zoomBy(@NotNull TransformableState transformableState0, float f, @NotNull Continuation continuation0) {
        Object object0 = TransformableState.transform$default(transformableState0, null, new h4(f, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

