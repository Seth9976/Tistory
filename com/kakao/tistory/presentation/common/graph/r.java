package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function3 {
    public final Density a;
    public final MutableState b;
    public final boolean c;
    public final TweenBarGraphValue d;
    public final long e;

    public r(Density density0, MutableState mutableState0, boolean z, TweenBarGraphValue tweenBarGraphValue0, long v) {
        this.a = density0;
        this.b = mutableState0;
        this.c = z;
        this.d = tweenBarGraphValue0;
        this.e = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((TweenBarGraphValue)object0), "value");
        if((v & 14) == 0) {
            v |= (composer0.changed(((TweenBarGraphValue)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-600746031, v, -1, "com.kakao.tistory.presentation.common.graph.RevenueTwinBarGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RevenueTwinBarGraph.kt:61)");
        }
        Modifier modifier0 = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null);
        composer0.startReplaceGroup(0x3470A6E5);
        boolean z = composer0.changed(this.a);
        Density density0 = this.a;
        MutableState mutableState0 = this.b;
        q q0 = composer0.rememberedValue();
        if(z || q0 == Composer.Companion.getEmpty()) {
            q0 = new q(density0, mutableState0);
            composer0.updateRememberedValue(q0);
        }
        composer0.endReplaceGroup();
        Modifier modifier1 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier0, q0);
        boolean z1 = this.c;
        TweenBarGraphValue tweenBarGraphValue0 = this.d;
        long v1 = this.e;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
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
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        TistoryBarGraphKt.TwinBarGraph-jA1GFJw(z1, ((TweenBarGraphValue)object0), tweenBarGraphValue0, v1, 0L, composer0, v << 3 & 0x70, 16);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

