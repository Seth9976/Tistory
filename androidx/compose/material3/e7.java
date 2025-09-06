package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e7 extends Lambda implements Function2 {
    public final String w;

    public e7(String s) {
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
            ComposerKt.traceEventStart(0x34952493, v, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2054)");
        }
        Modifier modifier0 = SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, a5.F);
        TextAlign textAlign0 = TextAlign.box-impl(3);
        TextKt.Text--4IGK_g(this.w, modifier0, 0L, 0L, null, null, null, 0L, null, textAlign0, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FDFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

