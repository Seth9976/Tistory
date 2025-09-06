package com.kakao.tistory.presentation.view.entry;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function3 {
    public final EntryViewActivity a;

    public k(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "paddingValues");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020035725, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.Content.<anonymous> (EntryViewActivity.kt:154)");
        }
        composer0.startReplaceGroup(210326971);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        PullRefreshState pullRefreshState0 = PullRefreshStateKt.rememberPullRefreshState-UuyPYSY(((Boolean)mutableState0.getValue()).booleanValue(), new j(this.a, mutableState0), 0.0f, 0.0f, composer0, 0, 12);
        EntryViewActivity entryViewActivity0 = this.a;
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        Modifier modifier1 = PullRefreshKt.pullRefresh$default(modifier$Companion0, pullRefreshState0, false, 2, null);
        composer0.startReplaceGroup(-2129075628);
        i i0 = composer0.rememberedValue();
        if(i0 == composer$Companion0.getEmpty()) {
            i0 = new i(mutableState0);
            composer0.updateRememberedValue(i0);
        }
        composer0.endReplaceGroup();
        entryViewActivity0.WebView(modifier1, i0, composer0, 560, 0);
        Modifier modifier2 = boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopCenter());
        PullRefreshIndicatorKt.PullRefreshIndicator-jB83MbM(((Boolean)mutableState0.getValue()).booleanValue(), pullRefreshState0, modifier2, 0L, 0L, false, composer0, PullRefreshState.$stable << 3, 56);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

