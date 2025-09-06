package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d3 extends Lambda implements Function3 {
    public final RefererKeyword a;

    public d3(RefererKeyword statisticsItem$RefererKeyword0) {
        this.a = statisticsItem$RefererKeyword0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((FlowRowScope)object0), "$this$FlowRow");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCDC7EFE6, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsRefererKeyword.<anonymous> (BlogMainStatisticsRefererKeyword.kt:53)");
        }
        for(Object object3: this.a.getList()) {
            Modifier modifier0 = SizeKt.fillMaxHeight(Modifier.Companion, 0.3f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
            CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(((Composer)object1).getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            ((Composer)object1).startReusableNode();
            if(((Composer)object1).getInserting()) {
                ((Composer)object1).createNode(function00);
            }
            else {
                ((Composer)object1).useNode();
            }
            Composer composer0 = Updater.constructor-impl(((Composer)object1));
            Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                d.a(v1, composer0, v1, function20);
            }
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            BlogMainStatisticsRefererKeywordKt.access$Keyword(((Data)object3).getKeyword(), ((Data)object3).getCount(), ((Composer)object1), 0);
            ((Composer)object1).endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

