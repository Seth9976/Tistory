package y0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContent;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function6 {
    public final int w;
    public final MovableContent x;

    public t(MovableContent movableContent0, int v) {
        this.w = v;
        this.x = movableContent0;
        super(6);
    }

    @Override  // kotlin.jvm.functions.Function6
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        if(this.w != 0) {
            int v = ((Number)object5).intValue();
            int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? ((Composer)object4).changed(object0) : ((Composer)object4).changedInstance(object0)) ? 4 : 2) | v : v;
            if((v & 0x30) == 0) {
                v1 |= (((v & 0x40) == 0 ? ((Composer)object4).changed(object1) : ((Composer)object4).changedInstance(object1)) ? 0x20 : 16);
            }
            if((v & 0x180) == 0) {
                v1 |= (((v & 0x200) == 0 ? ((Composer)object4).changed(object2) : ((Composer)object4).changedInstance(object2)) ? 0x100 : 0x80);
            }
            if((v & 0xC00) == 0) {
                v1 |= (((v & 0x1000) == 0 ? ((Composer)object4).changed(object3) : ((Composer)object4).changedInstance(object3)) ? 0x800 : 0x400);
            }
            if((v1 & 9363) == 9362 && ((Composer)object4).getSkipping()) {
                ((Composer)object4).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468683306, v1, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
            }
            Pair pair0 = TuplesKt.to(TuplesKt.to(object0, object1), TuplesKt.to(object2, object3));
            ((Composer)object4).insertMovableContent(this.x, pair0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v2 = ((Number)object5).intValue();
        int v3 = (v2 & 6) == 0 ? (((v2 & 8) == 0 ? ((Composer)object4).changed(object0) : ((Composer)object4).changedInstance(object0)) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (((v2 & 0x40) == 0 ? ((Composer)object4).changed(object1) : ((Composer)object4).changedInstance(object1)) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (((v2 & 0x200) == 0 ? ((Composer)object4).changed(object2) : ((Composer)object4).changedInstance(object2)) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (((v2 & 0x1000) == 0 ? ((Composer)object4).changed(object3) : ((Composer)object4).changedInstance(object3)) ? 0x800 : 0x400);
        }
        if((v3 & 9363) == 9362 && ((Composer)object4).getSkipping()) {
            ((Composer)object4).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x982D0E4F, v3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
        }
        Pair pair1 = TuplesKt.to(TuplesKt.to(object0, object1), TuplesKt.to(object2, object3));
        ((Composer)object4).insertMovableContent(this.x, pair1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

