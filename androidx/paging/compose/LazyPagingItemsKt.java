package androidx.paging.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.paging.LoadState.Loading;
import androidx.paging.LoadState.NotLoading;
import androidx.paging.LoadStates;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t4.d;
import t4.f;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A9\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/paging/compose/LazyPagingItems;", "collectAsLazyPagingItems", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/paging/compose/LazyPagingItems;", "paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,230:1\n1097#2,6:231\n1097#2,6:237\n1097#2,6:243\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItemsKt\n*L\n206#1:231,6\n208#1:237,6\n218#1:243,6\n*E\n"})
public final class LazyPagingItemsKt {
    public static final LoadStates a;

    static {
        NotLoading loadState$NotLoading0 = new NotLoading(false);
        LazyPagingItemsKt.a = new LoadStates(Loading.INSTANCE, loadState$NotLoading0, loadState$NotLoading0);
    }

    @Composable
    @NotNull
    public static final LazyPagingItems collectAsLazyPagingItems(@NotNull Flow flow0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        composer0.startReplaceableGroup(0x172138FE);
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x172138FE, v, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        composer0.startReplaceableGroup(1046463091);
        boolean z = composer0.changed(flow0);
        LazyPagingItems lazyPagingItems0 = composer0.rememberedValue();
        if(z || lazyPagingItems0 == Composer.Companion.getEmpty()) {
            lazyPagingItems0 = new LazyPagingItems(flow0);
            composer0.updateRememberedValue(lazyPagingItems0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0x3E5FC2C1);
        boolean z1 = composer0.changedInstance(coroutineContext0);
        boolean z2 = composer0.changedInstance(lazyPagingItems0);
        d d0 = composer0.rememberedValue();
        if(z1 || z2 || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(coroutineContext0, lazyPagingItems0, null);
            composer0.updateRememberedValue(d0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems0, d0, composer0, 0);
        composer0.startReplaceableGroup(0x3E5FC3CE);
        boolean z3 = composer0.changedInstance(coroutineContext0);
        boolean z4 = composer0.changedInstance(lazyPagingItems0);
        f f0 = composer0.rememberedValue();
        if(z3 || z4 || f0 == Composer.Companion.getEmpty()) {
            f0 = new f(coroutineContext0, lazyPagingItems0, null);
            composer0.updateRememberedValue(f0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(lazyPagingItems0, f0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return lazyPagingItems0;
    }
}

