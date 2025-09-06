package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u7 extends Lambda implements Function2 {
    public final String w;
    public final String x;

    public u7(String s, String s1) {
        this.w = s;
        this.x = s1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x36543135, v, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:103)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        String s = this.w;
        boolean z = ((Composer)object0).changed(s);
        String s1 = this.x;
        boolean z1 = ((Composer)object0).changed(s1);
        y4 y40 = ((Composer)object0).rememberedValue();
        if(z || z1 || y40 == Composer.Companion.getEmpty()) {
            y40 = new y4(this.w, s1, 2);
            ((Composer)object0).updateRememberedValue(y40);
        }
        TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(modifier$Companion0, false, y40, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

