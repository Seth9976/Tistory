package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function3 {
    public final Density a;
    public final float b;
    public final MutableState c;

    public y(Density density0, float f, MutableState mutableState0) {
        this.a = density0;
        this.b = f;
        this.c = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((StatisticsBarGraphValue)object0), "value");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((StatisticsBarGraphValue)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1424164004, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsBarGraph.kt:73)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        ((Composer)object1).startReplaceGroup(0x1C7BDFE7);
        boolean z = ((Composer)object1).changed(this.a);
        Density density0 = this.a;
        MutableState mutableState0 = this.c;
        x x0 = ((Composer)object1).rememberedValue();
        if(z || x0 == Composer.Companion.getEmpty()) {
            x0 = new x(density0, mutableState0);
            ((Composer)object1).updateRememberedValue(x0);
        }
        ((Composer)object1).endReplaceGroup();
        Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier$Companion0, x0);
        float f = StatisticsBarGraphKt.access$StatisticsBarGraph_T042LqI$lambda$2(this.c);
        StatisticsBarGraphKt.access$StatisticsBarGraph-FJfuzF0(modifier0, false, ((StatisticsBarGraphValue)object0), this.b, f, ((Composer)object1), v << 6 & 0x380 | 0x30, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

