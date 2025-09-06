package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class p4 extends Lambda implements Function3 {
    public final int w;
    public final WindowInsets x;

    public p4(WindowInsets windowInsets0, int v) {
        this.w = v;
        this.x = windowInsets0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Modifier modifier0 = (Modifier)object0;
            int v = ((Number)object2).intValue();
            ((Composer)object1).startReplaceGroup(0xAB9E59A6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAB9E59A6, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            WindowInsets windowInsets0 = this.x;
            boolean z = ((Composer)object1).changed(windowInsets0);
            InsetsPaddingModifier insetsPaddingModifier0 = ((Composer)object1).rememberedValue();
            if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsets0);
                ((Composer)object1).updateRememberedValue(insetsPaddingModifier0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ((Composer)object1).endReplaceGroup();
            return insetsPaddingModifier0;
        }
        Modifier modifier1 = (Modifier)object0;
        int v1 = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0x2F06228F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2F06228F, v1, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:81)");
        }
        WindowInsets windowInsets1 = this.x;
        boolean z1 = ((Composer)object1).changed(windowInsets1);
        y3 y30 = ((Composer)object1).rememberedValue();
        if(z1 || y30 == Composer.Companion.getEmpty()) {
            y30 = new y3(windowInsets1);
            ((Composer)object1).updateRememberedValue(y30);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return y30;
    }
}

