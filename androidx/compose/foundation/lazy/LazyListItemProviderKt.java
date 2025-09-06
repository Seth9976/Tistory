package androidx.compose.foundation.lazy;

import aa.l;
import androidx.compose.material3.rg;
import androidx.compose.material3.td;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A4\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"rememberLazyListItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n1223#2,6:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:107,6\n*E\n"})
public final class LazyListItemProviderKt {
    @Composable
    @NotNull
    public static final Function0 rememberLazyListItemProviderLambda(@NotNull LazyListState lazyListState0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEB8300AC, v, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer0, v >> 3 & 14);
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(lazyListState0) || (v & 6) == 4;
        rg rg0 = composer0.rememberedValue();
        if(z || rg0 == Composer.Companion.getEmpty()) {
            LazyItemScopeImpl lazyItemScopeImpl0 = new LazyItemScopeImpl();
            State state1 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new l(state0, 7));
            rg0 = new rg(0, SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new td(state1, lazyListState0, 3, lazyItemScopeImpl0)), State.class, "value", "getValue()Ljava/lang/Object;", 2);
            composer0.updateRememberedValue(rg0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rg0;
    }
}

