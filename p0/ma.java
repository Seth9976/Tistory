package p0;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ma extends Lambda implements Function2 {
    public final Function2 w;

    public ma(Function2 function20) {
        this.w = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x98F15403, v, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
        }
        TextKt.ProvideTextStyle(TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF7FFF, null), this.w, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

