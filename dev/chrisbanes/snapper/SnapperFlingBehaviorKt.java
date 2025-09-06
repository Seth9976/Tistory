package dev.chrisbanes.snapper;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A6\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\b¢\u0006\u0002\u0010\t\u001AK\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000BH\u0007¢\u0006\u0002\u0010\f\u001As\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\b2<\u0010\r\u001A8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u000F¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000F¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000F0\u000EH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"rememberSnapperFlingBehavior", "Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "layoutInfo", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "springAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "maximumFlingDistance", "Lkotlin/Function1;", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "snapIndex", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "(Ldev/chrisbanes/snapper/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "lib_release"}, k = 2, mv = {1, 6, 0}, xi = 0x30)
public final class SnapperFlingBehaviorKt {
    @Composable
    @ExperimentalSnapperApi
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(@NotNull SnapperLayoutInfo snapperLayoutInfo0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo0, "layoutInfo");
        composer0.startReplaceableGroup(0xDA471E11);
        if((v1 & 2) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if((v1 & 4) != 0) {
            animationSpec0 = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        SnapperFlingBehavior snapperFlingBehavior0 = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex(), composer0, v & 14 | 0x240, 0);
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(@NotNull SnapperLayoutInfo snapperLayoutInfo0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo0, "layoutInfo");
        composer0.startReplaceableGroup(0xDA4723D3);
        int v2 = 0;
        if((v1 & 2) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if((v1 & 4) != 0) {
            animationSpec0 = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        if((v1 & 8) != 0) {
            function10 = SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance();
        }
        Object[] arr_object = {snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function10};
        composer0.startReplaceableGroup(-3685570);
        boolean z;
        for(z = false; v2 < 4; z |= composer0.changed(object0)) {
            Object object0 = arr_object[v2];
            ++v2;
        }
        SnapperFlingBehavior snapperFlingBehavior0 = composer0.rememberedValue();
        if(z || snapperFlingBehavior0 == Composer.Companion.getEmpty()) {
            snapperFlingBehavior0 = new SnapperFlingBehavior(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function10);
            composer0.updateRememberedValue(snapperFlingBehavior0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }

    @Composable
    @ExperimentalSnapperApi
    @NotNull
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(@NotNull SnapperLayoutInfo snapperLayoutInfo0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo0, "layoutInfo");
        Intrinsics.checkNotNullParameter(function30, "snapIndex");
        composer0.startReplaceableGroup(0xDA4719E3);
        int v2 = 0;
        if((v1 & 2) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if((v1 & 4) != 0) {
            animationSpec0 = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        Object[] arr_object = {snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function30};
        composer0.startReplaceableGroup(-3685570);
        boolean z;
        for(z = false; v2 < 4; z |= composer0.changed(object0)) {
            Object object0 = arr_object[v2];
            ++v2;
        }
        SnapperFlingBehavior snapperFlingBehavior0 = composer0.rememberedValue();
        if(z || snapperFlingBehavior0 == Composer.Companion.getEmpty()) {
            snapperFlingBehavior0 = new SnapperFlingBehavior(snapperLayoutInfo0, decayAnimationSpec0, animationSpec0, function30);
            composer0.updateRememberedValue(snapperFlingBehavior0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return snapperFlingBehavior0;
    }
}

