package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class q4 extends Lambda implements Function3 {
    public final int w;
    public final Object x;

    public q4(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Modifier modifier0 = (Modifier)object0;
            int v = ((Number)object2).intValue();
            ((Composer)object1).startReplaceGroup(0xA02567B9);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA02567B9, v, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            Function1 function10 = (Function1)this.x;
            boolean z = ((Composer)object1).changed(function10);
            b0 b00 = ((Composer)object1).rememberedValue();
            if(z || b00 == Composer.Companion.getEmpty()) {
                b00 = new b0(function10);
                ((Composer)object1).updateRememberedValue(b00);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ((Composer)object1).endReplaceGroup();
            return b00;
        }
        Modifier modifier1 = (Modifier)object0;
        int v1 = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x6D618AE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6D618AE, v1, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:105)");
        }
        PaddingValues paddingValues0 = (PaddingValues)this.x;
        boolean z1 = ((Composer)object1).changed(paddingValues0);
        o3 o30 = ((Composer)object1).rememberedValue();
        if(z1 || o30 == Composer.Companion.getEmpty()) {
            o30 = new o3(paddingValues0);
            ((Composer)object1).updateRememberedValue(o30);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return o30;
    }
}

