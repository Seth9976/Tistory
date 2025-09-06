package com.google.accompanist.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import dev.chrisbanes.snapper.LazyListKt;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o6.p;
import o6.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u00C7\u0002\u0018\u00002\u00020\u0001J]\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\r\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0085\u0001\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\r\u001A\u00020\f2<\u0010\u0018\u001A8\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0013\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0013\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJG\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\r\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CR,\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u0012\u0004\b!\u0010\"\u001A\u0004\b\u001F\u0010 RV\u0010)\u001A8\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0013\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0013\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\"\u001A\u0004\b&\u0010\'\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b\u0019\u00A8\u0006*"}, d2 = {"Lcom/google/accompanist/pager/PagerDefaults;", "", "Lcom/google/accompanist/pager/PagerState;", "state", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Lkotlin/Function1;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "maximumFlingDistance", "Landroidx/compose/ui/unit/Dp;", "endContentPadding", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior-FJfuzF0", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "flingBehavior-hGBTI10", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior--jt2gSs", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "a", "Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance", "()Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance$annotations", "()V", "singlePageFlingDistance", "b", "Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex", "()Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex$annotations", "singlePageSnapIndex", "pager_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n*L\n139#1:581\n180#1:582\n220#1:583\n*E\n"})
public final class PagerDefaults {
    public static final int $stable;
    @NotNull
    public static final PagerDefaults INSTANCE;
    public static final p a;
    public static final q b;

    static {
        PagerDefaults.INSTANCE = new PagerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        PagerDefaults.a = p.x;
        PagerDefaults.b = q.w;
    }

    @Composable
    @ExperimentalSnapperApi
    @Deprecated(message = "\naccompanist/pager is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior(state = state)", imports = {"androidx.compose.foundation.pager.PagerDefaults"}))
    @NotNull
    public final FlingBehavior flingBehavior--jt2gSs(@NotNull PagerState pagerState0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, float f, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(pagerState0, "state");
        composer0.startReplaceableGroup(0x7E1A6BF);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 2) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        AnimationSpec animationSpec1 = (v1 & 4) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7E1A6BF, v, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:215)");
        }
        FlingBehavior flingBehavior0 = this.flingBehavior-hGBTI10(pagerState0, decayAnimationSpec1, animationSpec1, ((v1 & 8) == 0 ? f : 0.0f), PagerDefaults.b, composer0, v & 14 | 0x240 | v & 0x1C00 | v << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return flingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @Deprecated(message = "\n            accompanist/pager is deprecated.\n            The androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\n            For more migration information, please visit https://google.github.io/accompanist/pager/#migration\n    ")
    @NotNull
    public final FlingBehavior flingBehavior-FJfuzF0(@NotNull PagerState pagerState0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, float f, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(pagerState0, "state");
        composer0.startReplaceableGroup(0x5039E54C);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 2) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        AnimationSpec animationSpec1 = (v1 & 4) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        Function1 function11 = (v1 & 8) == 0 ? function10 : PagerDefaults.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5039E54C, v, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:133)");
        }
        FlingBehavior flingBehavior0 = LazyListKt.rememberSnapperFlingBehavior-osbwsH8(pagerState0.getLazyListState$pager_release(), SnapOffsets.INSTANCE.getStart(), ((v1 & 16) == 0 ? f : 0.0f), decayAnimationSpec1, animationSpec1, function11, composer0, v >> 6 & 0x380 | 0x9000 | v << 6 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return flingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    @NotNull
    public final FlingBehavior flingBehavior-hGBTI10(@NotNull PagerState pagerState0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(pagerState0, "state");
        Intrinsics.checkNotNullParameter(function30, "snapIndex");
        composer0.startReplaceableGroup(0xD1BD5A90);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 2) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        AnimationSpec animationSpec1 = (v1 & 4) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD1BD5A90, v, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:175)");
        }
        FlingBehavior flingBehavior0 = LazyListKt.rememberSnapperFlingBehavior-osbwsH8(pagerState0.getLazyListState$pager_release(), SnapOffsets.INSTANCE.getStart(), ((v1 & 8) == 0 ? f : 0.0f), decayAnimationSpec1, animationSpec1, function30, composer0, v >> 3 & 0x380 | 0x9000 | v << 3 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return flingBehavior0;
    }

    @NotNull
    public final Function1 getSinglePageFlingDistance() {
        return PagerDefaults.a;
    }

    @ExperimentalSnapperApi
    @Deprecated(message = "MaximumFlingDistance has been deprecated in Snapper")
    public static void getSinglePageFlingDistance$annotations() {
    }

    @NotNull
    public final Function3 getSinglePageSnapIndex() {
        return PagerDefaults.b;
    }

    @ExperimentalSnapperApi
    public static void getSinglePageSnapIndex$annotations() {
    }
}

