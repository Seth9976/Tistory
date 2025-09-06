package p0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class bc extends Lambda implements Function2 {
    public final int w;
    public final ComposableLambda x;
    public final ComposableLambda y;

    public bc(ComposableLambda composableLambda0, ComposableLambda composableLambda1, int v) {
        this.w = v;
        this.x = composableLambda0;
        this.y = composableLambda1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3B3CBDC8, v, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:252)");
            }
            this.x.invoke(((Composer)object0), 0);
            Intrinsics.checkNotNull(this.y);
            this.y.invoke(((Composer)object0), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1675021441, v1, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:233)");
        }
        this.x.invoke(((Composer)object0), 0);
        this.y.invoke(((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

