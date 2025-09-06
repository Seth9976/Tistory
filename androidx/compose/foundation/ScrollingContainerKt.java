package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AQ\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0001¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"scrollingContainer", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseScrolling", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScrollingContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,61:1\n77#2:62\n*S KotlinDebug\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerKt\n*L\n49#1:62\n*E\n"})
public final class ScrollingContainerKt {
    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public static final Modifier scrollingContainer(@NotNull Modifier modifier0, @NotNull ScrollableState scrollableState0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable FlingBehavior flingBehavior0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable BringIntoViewSpec bringIntoViewSpec0, @Nullable Composer composer0, int v, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9BFE89A9, v, -1, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        OverscrollEffect overscrollEffect0 = ScrollableDefaults.INSTANCE.overscrollEffect(composer0, 6);
        Modifier modifier1 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier0, orientation0), overscrollEffect0);
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Modifier modifier2 = ScrollableKt.scrollable(modifier1, scrollableState0, orientation0, overscrollEffect0, z, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection0, orientation0, z1), flingBehavior0, mutableInteractionSource0, ((v1 & 0x40) == 0 ? bringIntoViewSpec0 : null));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifier2;
    }
}

