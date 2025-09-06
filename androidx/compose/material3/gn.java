package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gn extends Lambda implements Function2 {
    public final Function2 w;

    public gn(Function2 function20) {
        this.w = function20;
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
            ComposerKt.traceEventStart(0x2A4090BC, v, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
        }
        TextKt.ProvideTextStyle(TextStyle.copy-p1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), ((Composer)object0), 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF7FFF, null), this.w, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

