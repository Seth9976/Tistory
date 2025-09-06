package com.kakao.tistory.presentation.widget;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\u001A#\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005X\u008A\u0084\u0002²\u0006\n\u0010\b\u001A\u00020\tX\u008A\u0084\u0002"}, d2 = {"LazyListLoadMoreHandler", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "loadMore", "Lkotlin/Function0;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease", "isAttachedLast", ""}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListLoadMoreHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLoadMoreHandler.kt\ncom/kakao/tistory/presentation/widget/LazyListLoadMoreHandlerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,25:1\n1223#2,6:26\n1223#2,6:32\n81#3:38\n81#3:39\n*S KotlinDebug\n*F\n+ 1 LazyListLoadMoreHandler.kt\ncom/kakao/tistory/presentation/widget/LazyListLoadMoreHandlerKt\n*L\n13#1:26,6\n20#1:32,6\n11#1:38\n13#1:39\n*E\n"})
public final class LazyListLoadMoreHandlerKt {
    @Composable
    public static final void LazyListLoadMoreHandler(@NotNull LazyListState lazyListState0, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Intrinsics.checkNotNullParameter(function00, "loadMore");
        Composer composer1 = composer0.startRestartGroup(0x67E3A259);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x67E3A259, v1, -1, "com.kakao.tistory.presentation.widget.LazyListLoadMoreHandler (LazyListLoadMoreHandler.kt:9)");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer1, v1 >> 3 & 14);
            composer1.startReplaceGroup(-2130270519);
            y y0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || y0 == Composer.Companion.getEmpty()) {
                y0 = new y(lazyListState0);
                composer1.updateRememberedValue(y0);
            }
            composer1.endReplaceGroup();
            State state1 = SnapshotStateKt.derivedStateOf(y0);
            Boolean boolean0 = (Boolean)state1.getValue();
            boolean0.getClass();
            composer1.startReplaceGroup(0x8106C4C7);
            boolean z = composer1.changed(state1);
            boolean z1 = composer1.changed(state0);
            w w0 = composer1.rememberedValue();
            if(z || z1 || w0 == Composer.Companion.getEmpty()) {
                w0 = new w(state1, state0, null);
                composer1.updateRememberedValue(w0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, w0, composer1, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(lazyListState0, function00, v));
        }
    }

    public static final Function0 access$LazyListLoadMoreHandler$lambda$0(State state0) {
        return (Function0)state0.getValue();
    }

    public static final boolean access$LazyListLoadMoreHandler$lambda$2(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }
}

