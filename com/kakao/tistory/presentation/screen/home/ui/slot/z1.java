package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.FlowExtKt;
import b;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Subscription;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButtonColor;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButtonKt;
import d;
import e;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function3 {
    public final Subscription a;

    public z1(Subscription homeSlotUiState$Subscription0) {
        this.a = homeSlotUiState$Subscription0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotContainer");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5F20EA39, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Subscription.<anonymous> (Subscription.kt:88)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(this.a.getCurrentIndex(), 0, null, null, null, composer0, 56, 14);
        com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription homeSlotUiStateContent$Subscription0 = (com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription)CollectionsKt___CollectionsKt.firstOrNull(((List)FlowExtKt.collectAsStateWithLifecycle(this.a.getCurrentPageContents(), CollectionsKt__CollectionsKt.emptyList(), null, null, null, composer0, 56, 14).getValue()));
        Subscription homeSlotUiState$Subscription0 = this.a;
        Companion modifier$Companion0 = Modifier.Companion;
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
        SubscriptionKt.access$BlogBackground((homeSlotUiStateContent$Subscription0 == null ? null : homeSlotUiStateContent$Subscription0.getBlogImage()), BoxScopeInstance.INSTANCE.matchParentSize(modifier$Companion0), composer0, 0, 0);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function21);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        composer0.startReplaceGroup(0x4E6A1F06);
        if(homeSlotUiStateContent$Subscription0 != null) {
            SubscriptionKt.access$Content(homeSlotUiStateContent$Subscription0, composer0, 0);
            b.a(22.0f, modifier$Companion0, composer0, 6);
        }
        composer0.endReplaceGroup();
        SlotMoreButtonKt.SlotMoreButton(PaddingKt.padding-qDBjuR0$default(columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, 24.0f, 7, null), ((Number)state0.getValue()).intValue() + 1, homeSlotUiState$Subscription0.getTotalPages(), new SlotMoreButtonColor(0L, 0L, 0L, null), new y1(homeSlotUiState$Subscription0), composer0, 0xC00, 0);
        if(e.a(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

