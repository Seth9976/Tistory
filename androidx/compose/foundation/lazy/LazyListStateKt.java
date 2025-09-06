package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import b0.w;
import b0.x;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A-\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListState;", "rememberLazyListState", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,673:1\n1223#2,6:674\n1223#2,6:680\n1223#2,6:686\n148#3:692\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n82#1:674,6\n107#1:680,6\n109#1:686,6\n642#1:692\n*E\n"})
public final class LazyListStateKt {
    public static final float a;
    public static final LazyListMeasureResult b;

    static {
        LazyListStateKt.a = 1.0f;
        LazyListStateKt.b = new LazyListMeasureResult(null, 0, false, 0.0f, new LazyListStateKt.EmptyLazyListMeasureResult.1(), 0.0f, false, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, false, Orientation.Vertical, 0, 0, null);
    }

    public static final float access$getDeltaThresholdForScrollAnimation$p() [...] // 潜在的解密器

    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public static final LazyListState rememberLazyListState(int v, int v1, @Nullable LazyListPrefetchStrategy lazyListPrefetchStrategy0, @Nullable Composer composer0, int v2, int v3) {
        LazyListPrefetchStrategy lazyListPrefetchStrategy2;
        int v4 = 0;
        int v5 = (v3 & 1) == 0 ? v : 0;
        int v6 = (v3 & 2) == 0 ? v1 : 0;
        if((v3 & 4) == 0) {
            lazyListPrefetchStrategy2 = lazyListPrefetchStrategy0;
        }
        else {
            LazyListPrefetchStrategy lazyListPrefetchStrategy1 = composer0.rememberedValue();
            if(lazyListPrefetchStrategy1 == Composer.Companion.getEmpty()) {
                lazyListPrefetchStrategy1 = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer0.updateRememberedValue(lazyListPrefetchStrategy1);
            }
            lazyListPrefetchStrategy2 = lazyListPrefetchStrategy1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1287535208, v2, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:107)");
        }
        Object[] arr_object = {lazyListPrefetchStrategy2};
        Saver saver0 = LazyListState.Companion.saver$foundation_release(lazyListPrefetchStrategy2);
        int v7 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v5)) && (v2 & 6) != 4 ? 0 : 1;
        int v8 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(v6)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        if((v2 & 0x380 ^ 0x180) > 0x100 && composer0.changedInstance(lazyListPrefetchStrategy2) || (v2 & 0x180) == 0x100) {
            v4 = 1;
        }
        x x0 = composer0.rememberedValue();
        if((v7 | v8 | v4) != 0 || x0 == Composer.Companion.getEmpty()) {
            x0 = new x(v5, v6, 0, lazyListPrefetchStrategy2);
            composer0.updateRememberedValue(x0);
        }
        LazyListState lazyListState0 = (LazyListState)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, x0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState0;
    }

    @Composable
    @NotNull
    public static final LazyListState rememberLazyListState(int v, int v1, @Nullable Composer composer0, int v2, int v3) {
        int v4 = 0;
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470655220, v2, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Saver saver0 = LazyListState.Companion.getSaver();
        int v5 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v2 & 6) != 4 ? 0 : 1;
        if((v2 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v1) || (v2 & 0x30) == 0x20) {
            v4 = 1;
        }
        w w0 = composer0.rememberedValue();
        if((v5 | v4) != 0 || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(v, v1, 0);
            composer0.updateRememberedValue(w0);
        }
        LazyListState lazyListState0 = (LazyListState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, w0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListState0;
    }
}

