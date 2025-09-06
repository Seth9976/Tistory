package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function3 {
    public final ColumnScopeInstance a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public i0(ColumnScopeInstance columnScopeInstance0, float f, float f1, float f2, float f3) {
        this.a = columnScopeInstance0;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        float f = ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(f) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB7106F64, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous> (StatisticsBarGraph.kt:146)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
        Modifier modifier0 = SizeKt.fillMaxWidth$default(AnimationModifierKt.animateContentSize$default(ClipKt.clip(Modifier.Companion, roundedCornerShape0), null, null, 3, null), 0.0f, 1, null);
        Modifier modifier1 = ColumnScope.weight$default(this.a, modifier0, f, false, 2, null);
        float f1 = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object1), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier1);
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
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        StatisticsBarGraphKt.a(f1, ComposableLambdaKt.rememberComposableLambda(1701196981, true, new f0(ColumnScopeInstance.INSTANCE, f4, f2, f3), ((Composer)object1), 54), ((Composer)object1), 0x30);
        StatisticsBarGraphKt.a(f2, ComposableLambdaKt.rememberComposableLambda(-566040482, true, new g0(ColumnScopeInstance.INSTANCE, f4, f3), ((Composer)object1), 54), ((Composer)object1), 0x30);
        StatisticsBarGraphKt.a(f3, ComposableLambdaKt.rememberComposableLambda(1986702973, true, new h0(ColumnScopeInstance.INSTANCE, f4), ((Composer)object1), 54), ((Composer)object1), 0x30);
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

