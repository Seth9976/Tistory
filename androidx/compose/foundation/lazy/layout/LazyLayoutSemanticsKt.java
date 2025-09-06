package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0000\u001A\u0018\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0000\u001A?\u0010\b\u001A\u00020\t*\u00020\t2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"estimatedLazyMaxScrollOffset", "", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "canScrollForward", "", "estimatedLazyScrollOffset", "lazyLayoutSemantics", "Landroidx/compose/ui/Modifier;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "reverseScrolling", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutSemanticsKt {
    // 去混淆评级： 低(20)
    public static final float estimatedLazyMaxScrollOffset(int v, int v1, boolean z) {
        return z ? ((float)(v * 500 + v1)) + 100.0f : ((float)(v * 500 + v1));
    }

    public static final float estimatedLazyScrollOffset(int v, int v1) [...] // Inlined contents

    @Composable
    @NotNull
    public static final Modifier lazyLayoutSemantics(@NotNull Modifier modifier0, @NotNull Function0 function00, @NotNull LazyLayoutSemanticState lazyLayoutSemanticState0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3FC8FE51, v, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        Modifier modifier1 = modifier0.then(new LazyLayoutSemanticsModifier(function00, lazyLayoutSemanticState0, orientation0, z, z1));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifier1;
    }
}

