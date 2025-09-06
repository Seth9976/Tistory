package i1;

import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;
    public final Function1 y;

    public a(Function1 function10, Function1 function11, int v) {
        this.w = v;
        this.x = function10;
        this.y = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Object object1 = SnapshotKt.getLock();
                synchronized(object1) {
                    SnapshotKt.e = 4;
                }
                return new MutableSnapshot(3, ((SnapshotIdSet)object0), this.x, this.y);
            }
            case 1: {
                this.x.invoke(object0);
                this.y.invoke(object0);
                return Unit.INSTANCE;
            }
            default: {
                this.x.invoke(object0);
                this.y.invoke(object0);
                return Unit.INSTANCE;
            }
        }
    }
}

