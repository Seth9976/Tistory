package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class jm extends Lambda implements Function3 {
    public final int w;
    public final String x;

    public jm(String s, int v) {
        this.w = v;
        this.x = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            RowScope rowScope0 = (RowScope)object0;
            int v = ((Number)object2).intValue();
            if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC89E4C13, v, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:168)");
            }
            TextKt.Text--4IGK_g(this.x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object1), 0, 0, 0x1FFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        RowScope rowScope1 = (RowScope)object0;
        int v1 = ((Number)object2).intValue();
        if((v1 & 17) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1F0F8424, v1, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:219)");
        }
        androidx.compose.material3.TextKt.Text--4IGK_g(this.x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object1), 0, 0, 0x1FFFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

