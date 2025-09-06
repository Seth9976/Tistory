package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000E\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseScrolling", "reverseDirection", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,979:1\n1223#2,6:980\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n573#1:980,6\n*E\n"})
public final class ScrollableDefaults {
    public static final int $stable;
    @NotNull
    public static final ScrollableDefaults INSTANCE;

    static {
        ScrollableDefaults.INSTANCE = new ScrollableDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @ExperimentalFoundationApi
    @Deprecated(message = "This has been replaced by composition locals LocalBringIntoViewSpec", replaceWith = @ReplaceWith(expression = "LocalBringIntoView.current", imports = {"androidx.compose.foundation.gestures.LocalBringIntoViewSpec"}))
    @NotNull
    public final BringIntoViewSpec bringIntoViewSpec() {
        return BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release();
    }

    @Composable
    @NotNull
    public final FlingBehavior flingBehavior(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4206C4AA, v, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        boolean z = composer0.changed(decayAnimationSpec0);
        DefaultFlingBehavior defaultFlingBehavior0 = composer0.rememberedValue();
        if(z || defaultFlingBehavior0 == Composer.Companion.getEmpty()) {
            defaultFlingBehavior0 = new DefaultFlingBehavior(decayAnimationSpec0, null, 2, null);
            composer0.updateRememberedValue(defaultFlingBehavior0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFlingBehavior0;
    }

    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public final OverscrollEffect overscrollEffect(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, v, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        OverscrollEffect overscrollEffect0 = AndroidOverscroll_androidKt.rememberOverscrollEffect(composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return overscrollEffect0;
    }

    public final boolean reverseDirection(@NotNull LayoutDirection layoutDirection0, @NotNull Orientation orientation0, boolean z) {
        return layoutDirection0 == LayoutDirection.Rtl && orientation0 != Orientation.Vertical ? z : !z;
    }
}

