package com.kakao.kandinsky.filter;

import aa.g;
import aa.l;
import aa.w;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.filter.contract.FilterUiState;
import ea.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001AQ\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u000BH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000E\u001A\u00020\u000FX\u008A\u0084\u0002"}, d2 = {"FilterScreen", "", "filterViewModel", "Lcom/kakao/kandinsky/filter/FilterViewModel;", "onConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "onMultipleConfirm", "Lkotlin/Function2;", "", "goHomeState", "Lkotlin/Function0;", "(Lcom/kakao/kandinsky/filter/FilterViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "filter_release", "uiState", "Lcom/kakao/kandinsky/filter/contract/FilterUiState;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFilterScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterScreen.kt\ncom/kakao/kandinsky/filter/FilterScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,143:1\n1223#2,6:144\n1223#2,6:150\n81#3:156\n*S KotlinDebug\n*F\n+ 1 FilterScreen.kt\ncom/kakao/kandinsky/filter/FilterScreenKt\n*L\n35#1:144,6\n42#1:150,6\n33#1:156\n*E\n"})
public final class FilterScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void FilterScreen(@NotNull FilterViewModel filterViewModel0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(filterViewModel0, "filterViewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function20, "onMultipleConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(0x4AD340C3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4AD340C3, v, -1, "com.kakao.kandinsky.filter.FilterScreen (FilterScreen.kt:31)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(filterViewModel0.getUiState(), null, null, null, composer1, 8, 7);
        composer1.startReplaceGroup(0x5587641);
        boolean z = composer1.changed(state0);
        l l0 = composer1.rememberedValue();
        if(z || l0 == Composer.Companion.getEmpty()) {
            l0 = new l(state0, 11);
            composer1.updateRememberedValue(l0);
        }
        composer1.endReplaceGroup();
        BackHandlerKt.BackHandler(false, l0, composer1, 0, 1);
        ConsumeKDEventKt.ConsumeEvent(filterViewModel0.getEvent(), function10, function00, composer1, v & 0x70 | 8 | v >> 3 & 0x380);
        composer1.startReplaceGroup(0x55876E6);
        boolean z1 = composer1.changed(state0);
        w w0 = composer1.rememberedValue();
        if(z1 || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(state0, 5);
            composer1.updateRememberedValue(w0);
        }
        composer1.endReplaceGroup();
        RotatableScreenKt.RotatableScreen-FHprtrg(null, null, w0, null, 0L, ComposableLambdaKt.rememberComposableLambda(0xBB16ECE3, true, new f(state0, function10, function00, function20), composer1, 54), composer1, 0x30000, 27);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(filterViewModel0, function10, function20, function00, v, 2));
        }
    }

    public static final FilterUiState access$FilterScreen$lambda$0(State state0) {
        return (FilterUiState)state0.getValue();
    }
}

