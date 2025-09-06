package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import b0.w;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A!\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyStaggeredGridState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,595:1\n1223#2,6:596\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n74#1:596,6\n*E\n"})
public final class LazyStaggeredGridStateKt {
    @Composable
    @NotNull
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(int v, int v1, @Nullable Composer composer0, int v2, int v3) {
        int v4 = 0;
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x99AE3C4, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:73)");
        }
        Saver saver0 = LazyStaggeredGridState.Companion.getSaver();
        int v5 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v2 & 6) != 4 ? 0 : 1;
        if((v2 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v1) || (v2 & 0x30) == 0x20) {
            v4 = 1;
        }
        w w0 = composer0.rememberedValue();
        if((v5 | v4) != 0 || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(v, v1, 2);
            composer0.updateRememberedValue(w0);
        }
        LazyStaggeredGridState lazyStaggeredGridState0 = (LazyStaggeredGridState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, w0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridState0;
    }
}

