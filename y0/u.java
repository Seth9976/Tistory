package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function3 {
    public final int w;
    public final Function4 x;

    public u(Function4 function40, int v) {
        this.w = v;
        this.x = function40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            if((v & 6) == 0) {
                v |= (((v & 8) == 0 ? ((Composer)object1).changed(((Pair)object0)) : ((Composer)object1).changedInstance(((Pair)object0))) ? 4 : 2);
            }
            if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x306766A6, v, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
            }
            this.x.invoke(((Pair)object0).getFirst(), ((Pair)object0).getSecond(), ((Composer)object1), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object2).intValue();
        if((v1 & 6) == 0) {
            v1 |= (((v1 & 8) == 0 ? ((Composer)object1).changed(((Pair)object0)) : ((Composer)object1).changedInstance(((Pair)object0))) ? 4 : 2);
        }
        if((v1 & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6E41EDF1, v1, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
        }
        this.x.invoke(((Pair)object0).getFirst(), ((Pair)object0).getSecond(), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

