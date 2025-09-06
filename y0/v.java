package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function3 {
    public final int w;
    public final Function5 x;

    public v(Function5 function50, int v) {
        this.w = v;
        this.x = function50;
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
                ComposerKt.traceEventStart(-1322148760, v, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:225)");
            }
            this.x.invoke(((Pair)((Pair)object0).getFirst()).getFirst(), ((Pair)((Pair)object0).getFirst()).getSecond(), ((Pair)object0).getSecond(), ((Composer)object1), 0);
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
            ComposerKt.traceEventStart(0xEF0C23B3, v1, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
        }
        this.x.invoke(((Pair)((Pair)object0).getFirst()).getFirst(), ((Pair)((Pair)object0).getFirst()).getSecond(), ((Pair)object0).getSecond(), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

