package androidx.core.os;

import android.os.Process;

public final class ProcessCompat {
    public static boolean isApplicationUid(int v) {
        return Process.isApplicationUid(v);
    }
}

