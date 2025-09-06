package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q6 extends Lambda implements Function2 {
    public final int w;

    public q6(int v) {
        this.w = v;
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
            ComposerKt.traceEventStart(0x83160E21, v, -1, "androidx.compose.material3.Month.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1863)");
        }
        TextKt.Text--4IGK_g(CalendarLocale_jvmKt.toLocalString$default(this.w + 1, 0, 0, false, 7, null), SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, a5.A), 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FDFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

