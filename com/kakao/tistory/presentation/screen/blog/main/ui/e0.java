package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.Participant;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.Preview;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge;
import com.kakao.tistory.presentation.theme.ModifierKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function3 {
    public final BlogMainChallenge a;

    public e0(BlogMainChallenge blogMainChallenge0) {
        this.a = blogMainChallenge0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7BABF3E0, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeCard.<anonymous> (BlogMainChallenge.kt:121)");
        }
        boolean z = Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 440.0f) >= 0;
        Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null).then((z ? SizeKt.width-3ABfNKs(Modifier.Companion, 320.0f) : SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null))), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), 0L, null, 10.0f, 4, null);
        BlogMainChallenge blogMainChallenge0 = this.a;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        if(blogMainChallenge0 instanceof Preview) {
            composer0.startReplaceGroup(0x5CF140A7);
            BlogMainChallengeKt.access$ChallengeCardPreview(((Preview)blogMainChallenge0), composer0, 0);
        }
        else if(blogMainChallenge0 instanceof Participant) {
            composer0.startReplaceGroup(0x5CF32583);
            BlogMainChallengeKt.access$ChallengeCardParticipant(((Participant)blogMainChallenge0), composer0, 0);
        }
        else {
            composer0.startReplaceGroup(0x5CF4754E);
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

