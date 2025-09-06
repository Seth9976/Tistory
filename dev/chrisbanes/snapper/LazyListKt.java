package dev.chrisbanes.snapper;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Aa\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u000328\b\u0002\u0010\u0004\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A\u0081\u0001\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0002\u001A\u00020\u000328\b\u0002\u0010\u0004\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u0097\u0001\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0002\u001A\u00020\u000328\b\u0002\u0010\u0004\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00172\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u001BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u00BF\u0001\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0002\u001A\u00020\u000328\b\u0002\u0010\u0004\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00150\u00142\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00172<\u0010\u001E\u001A8\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\f0\u001FH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\"\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#"}, d2 = {"rememberLazyListSnapperLayoutInfo", "Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapOffsetForItem", "Lkotlin/Function2;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "item", "", "endContentPadding", "Landroidx/compose/ui/unit/Dp;", "rememberLazyListSnapperLayoutInfo-6a0pyJM", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "rememberSnapperFlingBehavior", "Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "springAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "rememberSnapperFlingBehavior-TN_CM5M", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "maximumFlingDistance", "Lkotlin/Function1;", "rememberSnapperFlingBehavior-osbwsH8", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "snapIndex", "Lkotlin/Function3;", "startIndex", "targetIndex", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 0x30)
public final class LazyListKt {
    @Composable
    @ExperimentalSnapperApi
    @NotNull
    public static final LazyListSnapperLayoutInfo rememberLazyListSnapperLayoutInfo-6a0pyJM(@NotNull LazyListState lazyListState0, @Nullable Function2 function20, float f, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        composer0.startReplaceableGroup(-1050829263);
        if((v1 & 2) != 0) {
            function20 = SnapOffsets.INSTANCE.getCenter();
        }
        if((v1 & 4) != 0) {
            f = 0.0f;
        }
        composer0.startReplaceableGroup(0xFFC7BF68);
        boolean z = composer0.changed(lazyListState0);
        boolean z1 = composer0.changed(function20);
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo0 = composer0.rememberedValue();
        if(z || z1 || lazyListSnapperLayoutInfo0 == Composer.Companion.getEmpty()) {
            lazyListSnapperLayoutInfo0 = new LazyListSnapperLayoutInfo(lazyListState0, function20, 0, 4, null);
            composer0.updateRememberedValue(lazyListSnapperLayoutInfo0);
        }
        composer0.endReplaceableGroup();
        lazyListSnapperLayoutInfo0.setEndContentPadding$lib_release(((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(f));
        composer0.endReplaceableGroup();
        return lazyListSnapperLayoutInfo0;
    }

    @Composable
    @ExperimentalSnapperApi
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior-TN_CM5M(@NotNull LazyListState lazyListState0, @Nullable Function2 function20, float f, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        composer0.startReplaceableGroup(0xDA471CCD);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 8) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        SnapperFlingBehavior snapperFlingBehavior0 = LazyListKt.rememberSnapperFlingBehavior-osbwsH8(lazyListState0, ((v1 & 2) == 0 ? function20 : SnapOffsets.INSTANCE.getCenter()), ((v1 & 4) == 0 ? f : 0.0f), decayAnimationSpec1, ((v1 & 16) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec()), SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex(), composer0, v & 14 | 0x9000 | v & 0x70 | v & 0x380, 0);
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior-osbwsH8(@NotNull LazyListState lazyListState0, @Nullable Function2 function20, float f, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        composer0.startReplaceableGroup(0xDA472529);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 8) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        SnapperFlingBehavior snapperFlingBehavior0 = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(LazyListKt.rememberLazyListSnapperLayoutInfo-6a0pyJM(lazyListState0, ((v1 & 2) == 0 ? function20 : SnapOffsets.INSTANCE.getCenter()), ((v1 & 4) == 0 ? f : 0.0f), composer0, v & 0x3FE, 0), decayAnimationSpec1, ((v1 & 16) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec()), ((v1 & 0x20) == 0 ? function10 : SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance()), composer0, v >> 6 & 0x1C00 | 0x240, 0);
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior-osbwsH8(@NotNull LazyListState lazyListState0, @Nullable Function2 function20, float f, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Intrinsics.checkNotNullParameter(function30, "snapIndex");
        composer0.startReplaceableGroup(0xDA47163E);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 8) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        SnapperFlingBehavior snapperFlingBehavior0 = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(LazyListKt.rememberLazyListSnapperLayoutInfo-6a0pyJM(lazyListState0, ((v1 & 2) == 0 ? function20 : SnapOffsets.INSTANCE.getCenter()), ((v1 & 4) == 0 ? f : 0.0f), composer0, v & 0x3FE, 0), decayAnimationSpec1, ((v1 & 16) == 0 ? animationSpec0 : SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec()), function30, composer0, v >> 6 & 0x1C00 | 0x240, 0);
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }
}

