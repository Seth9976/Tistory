package com.kakao.tistory.presentation.screen.home;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.main.MainAppKt;
import com.kakao.tistory.presentation.screen.home.ui.HomeSlotListKt;
import com.kakao.tistory.presentation.screen.item.ViewState.Error;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final TopAppBarScrollBehavior a;
    public final String b;
    public final Function0 c;
    public final Function0 d;
    public final State e;
    public final MutableState f;

    public j(TopAppBarScrollBehavior topAppBarScrollBehavior0, String s, Function0 function00, Function0 function01, State state0, MutableState mutableState0) {
        this.a = topAppBarScrollBehavior0;
        this.b = s;
        this.c = function00;
        this.d = function01;
        this.e = state0;
        this.f = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$PullToRefreshBox");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x982338A9, v, -1, "com.kakao.tistory.presentation.screen.home.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:79)");
        }
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), this.a.getNestedScrollConnection(), null, 2, null), 0L, null, 2, null);
        String s = this.b;
        Function0 function00 = this.c;
        Function0 function01 = this.d;
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = this.a;
        State state0 = this.e;
        MutableState mutableState0 = this.f;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function02);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer0, 0, 3);
        LazyStaggeredGridState lazyStaggeredGridState0 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composer0, 0, 3);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        HomeScreenKt.a(s, function00, function01, new i(compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), lazyListState0, lazyStaggeredGridState0), topAppBarScrollBehavior0, composer0, 0);
        ViewState viewState0 = HomeScreenKt.access$HomeScreen$lambda$0(state0).getState();
        if(viewState0 instanceof Error) {
            composer0.startReplaceGroup(-44523206);
            CommonExceptionViewKt.CommonExceptionView(((Error)viewState0).getErrorModel(), false, null, ((Boolean)composer0.consume(MainAppKt.getLocalOnlineState())).booleanValue(), HomeScreenKt.access$HomeScreen$lambda$0(state0).getRefresh(), composer0, 56, 4);
        }
        else if(Intrinsics.areEqual(viewState0, Loading.INSTANCE)) {
            composer0.startReplaceGroup(0xFD5E1380);
            LoadingDialogKt.LoadingDialog(composer0, 0);
        }
        else if(viewState0 instanceof Success) {
            composer0.startReplaceGroup(0xFD5FD484);
            Object object3 = ((Success)viewState0).getItem();
            composer0.startReplaceGroup(0x20F2A951);
            f f0 = composer0.rememberedValue();
            if(f0 == composer$Companion0.getEmpty()) {
                f0 = new f(mutableState0);
                composer0.updateRememberedValue(f0);
            }
            composer0.endReplaceGroup();
            HomeSlotListKt.HomeSlotList(((List)object3), lazyListState0, lazyStaggeredGridState0, f0, composer0, LazyStaggeredGridState.$stable << 6 | 3080);
        }
        else {
            composer0.startReplaceGroup(0xFD64409F);
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

