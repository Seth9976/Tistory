package t;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function0 {
    public static final f0 w;

    static {
        f0.w = new f0(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver0 = new SnapshotStateObserver(g.C);
        snapshotStateObserver0.start();
        return snapshotStateObserver0;
    }
}

