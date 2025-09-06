package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import b0.w;
import b0.x;
import c0.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A-\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "rememberLazyGridState", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "prefetchStrategy", "(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,566:1\n1223#2,6:567\n1223#2,6:573\n1223#2,6:579\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n73#1:567,6\n98#1:573,6\n100#1:579,6\n*E\n"})
public final class LazyGridStateKt {
    public static final LazyGridMeasureResult a;

    static {
        LazyGridStateKt.EmptyLazyGridLayoutInfo.1 lazyGridStateKt$EmptyLazyGridLayoutInfo$10 = new LazyGridStateKt.EmptyLazyGridLayoutInfo.1();
        Density density0 = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        LazyGridStateKt.a = new LazyGridMeasureResult(null, 0, false, 0.0f, lazyGridStateKt$EmptyLazyGridLayoutInfo$10, false, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), density0, 0, n.z, CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, false, Orientation.Vertical, 0, 0);
    }

    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public static final LazyGridState rememberLazyGridState(int v, int v1, @Nullable LazyGridPrefetchStrategy lazyGridPrefetchStrategy0, @Nullable Composer composer0, int v2, int v3) {
        LazyGridPrefetchStrategy lazyGridPrefetchStrategy2;
        int v4 = 0;
        int v5 = (v3 & 1) == 0 ? v : 0;
        int v6 = (v3 & 2) == 0 ? v1 : 0;
        if((v3 & 4) == 0) {
            lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy0;
        }
        else {
            LazyGridPrefetchStrategy lazyGridPrefetchStrategy1 = composer0.rememberedValue();
            if(lazyGridPrefetchStrategy1 == Composer.Companion.getEmpty()) {
                lazyGridPrefetchStrategy1 = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer0.updateRememberedValue(lazyGridPrefetchStrategy1);
            }
            lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFEC9B390, v2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:98)");
        }
        Object[] arr_object = {lazyGridPrefetchStrategy2};
        Saver saver0 = LazyGridState.Companion.saver$foundation_release(lazyGridPrefetchStrategy2);
        int v7 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v5)) && (v2 & 6) != 4 ? 0 : 1;
        int v8 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(v6)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        if((v2 & 0x380 ^ 0x180) > 0x100 && composer0.changedInstance(lazyGridPrefetchStrategy2) || (v2 & 0x180) == 0x100) {
            v4 = 1;
        }
        x x0 = composer0.rememberedValue();
        if((v7 | v8 | v4) != 0 || x0 == Composer.Companion.getEmpty()) {
            x0 = new x(v5, v6, 1, lazyGridPrefetchStrategy2);
            composer0.updateRememberedValue(x0);
        }
        LazyGridState lazyGridState0 = (LazyGridState)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, x0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState0;
    }

    @Composable
    @NotNull
    public static final LazyGridState rememberLazyGridState(int v, int v1, @Nullable Composer composer0, int v2, int v3) {
        int v4 = 0;
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1BD5B8C, v2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Saver saver0 = LazyGridState.Companion.getSaver();
        int v5 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v2 & 6) != 4 ? 0 : 1;
        if((v2 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v1) || (v2 & 0x30) == 0x20) {
            v4 = 1;
        }
        w w0 = composer0.rememberedValue();
        if((v5 | v4) != 0 || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(v, v1, 1);
            composer0.updateRememberedValue(w0);
        }
        LazyGridState lazyGridState0 = (LazyGridState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, w0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridState0;
    }
}

