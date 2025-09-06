package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class dn extends Lambda implements Function3 {
    public final int w;
    public final ComposableLambda x;
    public final Function2 y;

    public dn(ComposableLambda composableLambda0, Function2 function20, int v) {
        this.w = v;
        this.x = composableLambda0;
        this.y = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            ColumnScope columnScope0 = (ColumnScope)object0;
            int v = ((Number)object2).intValue();
            if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF5619FB9, v, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:116)");
            }
            TabKt.access$TabBaselineLayout(this.x, this.y, ((Composer)object1), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ColumnScope columnScope1 = (ColumnScope)object0;
        int v1 = ((Number)object2).intValue();
        if((v1 & 17) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1540996038, v1, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
        }
        androidx.compose.material3.TabKt.access$TabBaselineLayout(this.x, this.y, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

