package s;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function0 {
    public static final f1 A;
    public final int w;
    public static final f1 x;
    public static final f1 y;
    public static final f1 z;

    static {
        f1.x = new f1(0, 0);
        f1.y = new f1(0, 1);
        f1.z = new f1(0, 2);
        f1.A = new f1(0, 3);
    }

    public f1(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return null;
            }
            case 1: {
                return null;
            }
            case 2: {
                return true;
            }
            default: {
                SnapshotStateObserver snapshotStateObserver0 = new SnapshotStateObserver(s.O);
                snapshotStateObserver0.start();
                return snapshotStateObserver0;
            }
        }
    }
}

