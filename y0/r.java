package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContent;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function4 {
    public final int w;
    public final MovableContent x;

    public r(MovableContent movableContent0, int v) {
        this.w = v;
        this.x = movableContent0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        if(this.w != 0) {
            int v = ((Number)object3).intValue();
            int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? ((Composer)object2).changed(object0) : ((Composer)object2).changedInstance(object0)) ? 4 : 2) | v : v;
            if((v & 0x30) == 0) {
                v1 |= (((v & 0x40) == 0 ? ((Composer)object2).changed(object1) : ((Composer)object2).changedInstance(object1)) ? 0x20 : 16);
            }
            if((v1 & 0x93) == 0x92 && ((Composer)object2).getSkipping()) {
                ((Composer)object2).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2564AA06, v1, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
            }
            Pair pair0 = TuplesKt.to(object0, object1);
            ((Composer)object2).insertMovableContent(this.x, pair0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v2 = ((Number)object3).intValue();
        int v3 = (v2 & 6) == 0 ? (((v2 & 8) == 0 ? ((Composer)object2).changed(object0) : ((Composer)object2).changedInstance(object0)) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (((v2 & 0x40) == 0 ? ((Composer)object2).changed(object1) : ((Composer)object2).changedInstance(object1)) ? 0x20 : 16);
        }
        if((v3 & 0x93) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1200019734, v3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
        }
        Pair pair1 = TuplesKt.to(object0, object1);
        ((Composer)object2).insertMovableContent(this.x, pair1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

