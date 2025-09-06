package y0;

import androidx.compose.runtime.SnapshotThreadLocal;

public abstract class z0 {
    public static final SnapshotThreadLocal a;
    public static final SnapshotThreadLocal b;

    static {
        z0.a = new SnapshotThreadLocal();
        z0.b = new SnapshotThreadLocal();
    }
}

