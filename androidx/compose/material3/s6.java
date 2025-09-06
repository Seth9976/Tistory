package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s6 extends Lambda implements Function2 {
    public final String w;

    public s6(String s) {
        this.w = s;
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
            ComposerKt.traceEventStart(1377272806, v, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2147)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        String s = this.w;
        boolean z = ((Composer)object0).changed(s);
        r6 r60 = ((Composer)object0).rememberedValue();
        if(z || r60 == Composer.Companion.getEmpty()) {
            r60 = new r6(this.w);
            ((Composer)object0).updateRememberedValue(r60);
        }
        TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(modifier$Companion0, false, r60, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

