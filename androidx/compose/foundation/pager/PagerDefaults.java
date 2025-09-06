package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import f0.a;
import f0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001JK\u0010\r\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0003\u0010\u000B\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001A\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "snapPositionalThreshold", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "BeyondViewportPageCount", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,511:1\n77#2:512\n77#2:513\n1223#3,6:514\n1223#3,6:520\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n307#1:512\n308#1:513\n309#1:514,6\n352#1:520,6\n*E\n"})
public final class PagerDefaults {
    public static final int $stable;
    public static final int BeyondViewportPageCount;
    @NotNull
    public static final PagerDefaults INSTANCE;

    static {
        PagerDefaults.INSTANCE = new PagerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final TargetedFlingBehavior flingBehavior(@NotNull PagerState pagerState0, @Nullable PagerSnapDistance pagerSnapDistance0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @FloatRange(from = 0.0, to = 1.0) float f, @Nullable Composer composer0, int v, int v1) {
        int v2 = 1;
        if((v1 & 2) != 0) {
            pagerSnapDistance0 = PagerSnapDistance.Companion.atMost(1);
        }
        if((v1 & 4) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if((v1 & 8) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, 1.0f, 1, null);
        }
        if((v1 & 16) != 0) {
            f = 0.5f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5CF8305D, v, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if(0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You\'ve specified " + f).toString());
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(pagerState0) || (v & 6) == 4;
        boolean z1 = composer0.changed(decayAnimationSpec0);
        boolean z2 = composer0.changed(animationSpec0);
        if(((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(pagerSnapDistance0)) && (v & 0x30) != 0x20) {
            v2 = 0;
        }
        boolean z3 = composer0.changed(density0);
        boolean z4 = composer0.changed(layoutDirection0);
        TargetedFlingBehavior targetedFlingBehavior0 = composer0.rememberedValue();
        if((z | z1 | z2 | v2 | z3 | z4) != 0 || targetedFlingBehavior0 == Composer.Companion.getEmpty()) {
            targetedFlingBehavior0 = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState0, pagerSnapDistance0, new m(pagerState0, layoutDirection0, f)), decayAnimationSpec0, animationSpec0);
            composer0.updateRememberedValue(targetedFlingBehavior0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;
    }

    @Composable
    @NotNull
    public final NestedScrollConnection pageNestedScrollConnection(@NotNull PagerState pagerState0, @NotNull Orientation orientation0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x344EDB10, v, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        int v1 = 0;
        int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(pagerState0)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(orientation0) || (v & 0x30) == 0x20) {
            v1 = 1;
        }
        a a0 = composer0.rememberedValue();
        if((v2 | v1) != 0 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(pagerState0, orientation0);
            composer0.updateRememberedValue(a0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a0;
    }
}

