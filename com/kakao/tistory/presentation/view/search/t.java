package com.kakao.tistory.presentation.view.search;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function3 {
    public final SearchActivity a;
    public final FocusManager b;
    public final SoftwareKeyboardController c;
    public static final int d;

    public t(SearchActivity searchActivity0, FocusManager focusManager0, SoftwareKeyboardController softwareKeyboardController0) {
        this.a = searchActivity0;
        this.b = focusManager0;
        this.c = softwareKeyboardController0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "it");
        if((v & 14) == 0) {
            v |= (composer0.changed(((PaddingValues)object0)) ? 4 : 2);
        }
        int v1 = -1;
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1D80B3EF, v, -1, "com.kakao.tistory.presentation.view.search.SearchActivity.Content.<anonymous> (SearchActivity.kt:126)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ((PaddingValues)object0));
        SearchActivity searchActivity0 = this.a;
        FocusManager focusManager0 = this.b;
        SoftwareKeyboardController softwareKeyboardController0 = this.c;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        State state0 = LiveDataAdapterKt.observeAsState(SearchActivity.access$getSearchViewModel(searchActivity0).getSearchViewType(), composer0, 8);
        SearchViewType searchActivity$SearchViewType0 = (SearchViewType)state0.getValue();
        if(searchActivity$SearchViewType0 != null) {
            v1 = SearchActivity.Content.2.WhenMappings.$EnumSwitchMapping$0[searchActivity$SearchViewType0.ordinal()];
        }
        switch(v1) {
            case 1: {
                composer0.startReplaceGroup(1183025054);
                SearchKeywordFragmentKt.SearchKeywordPage(null, composer0, 0, 1);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(-1980857223);
                SearchResultListFragmentKt.SearchResultPager(null, null, null, composer0, 0, 7);
                r r0 = new r(focusManager0, softwareKeyboardController0, null);
                EffectsKt.LaunchedEffect(Unit.INSTANCE, r0, composer0, 70);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(-1980583307);
                composer0.endReplaceGroup();
            }
        }
        if(((SearchViewType)state0.getValue()) == SearchViewType.PRE_RESULT) {
            searchActivity0.finish();
        }
        EffectsKt.LaunchedEffect(((SearchViewType)state0.getValue()), new s(state0, searchActivity0, null), composer0, 0x40);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

