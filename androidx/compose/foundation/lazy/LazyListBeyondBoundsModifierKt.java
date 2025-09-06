package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyListBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "beyondBoundsItemCount", "", "(Landroidx/compose/foundation/lazy/LazyListState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,54:1\n1223#2,6:55\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n28#1:55,6\n*E\n"})
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    @NotNull
    public static final LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState(@NotNull LazyListState lazyListState0, int v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90187C8A, v1, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        int v2 = 0;
        int v3 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(lazyListState0)) && (v1 & 6) != 4 ? 0 : 1;
        if((v1 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v1 & 0x30) == 0x20) {
            v2 = 1;
        }
        LazyListBeyondBoundsState lazyListBeyondBoundsState0 = composer0.rememberedValue();
        if((v3 | v2) != 0 || lazyListBeyondBoundsState0 == Composer.Companion.getEmpty()) {
            lazyListBeyondBoundsState0 = new LazyListBeyondBoundsState(lazyListState0, v);
            composer0.updateRememberedValue(lazyListBeyondBoundsState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListBeyondBoundsState0;
    }
}

