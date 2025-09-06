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

public final class c0 extends Lambda implements Function3 {
    public final Density a;
    public final boolean b;
    public final float c;
    public final MutableState d;

    public c0(Density density0, boolean z, float f, MutableState mutableState0) {
        this.a = density0;
        this.b = z;
        this.c = f;
        this.d = mutableState0;
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
            ComposerKt.traceEventStart(0x2F791CB, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsBarGraph.kt:93)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        ((Composer)object1).startReplaceGroup(477908031);
        boolean z = ((Composer)object1).changed(this.a);
        Density density0 = this.a;
        MutableState mutableState0 = this.d;
        b0 b00 = ((Composer)object1).rememberedValue();
        if(z || b00 == Composer.Companion.getEmpty()) {
            b00 = new b0(density0, mutableState0);
            ((Composer)object1).updateRememberedValue(b00);
        }
        ((Composer)object1).endReplaceGroup();
        Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier$Companion0, b00);
        float f = StatisticsBarGraphKt.access$StatisticsBarGraph_T042LqI$lambda$2(this.d);
        StatisticsBarGraphKt.access$StatisticsBarGraph-FJfuzF0(modifier0, this.b, ((StatisticsBarGraphValue)object0), this.c, f, ((Composer)object1), v << 6 & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

