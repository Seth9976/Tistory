package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function3 {
    public final int w;
    public final Function6 x;

    public w(Function6 function60, int v) {
        this.w = v;
        this.x = function60;
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
                ComposerKt.traceEventStart(0x31FBD22A, v, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
            }
            this.x.invoke(((Pair)((Pair)object0).getFirst()).getFirst(), ((Pair)((Pair)object0).getFirst()).getSecond(), ((Pair)((Pair)object0).getSecond()).getFirst(), ((Pair)((Pair)object0).getSecond()).getSecond(), ((Composer)object1), 0);
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
            ComposerKt.traceEventStart(0x6FD65975, v1, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
        }
        this.x.invoke(((Pair)((Pair)object0).getFirst()).getFirst(), ((Pair)((Pair)object0).getFirst()).getSecond(), ((Pair)((Pair)object0).getSecond()).getFirst(), ((Pair)((Pair)object0).getSecond()).getSecond(), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

