package androidx.compose.ui.platform;

import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "", "ensureStarted", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GlobalSnapshotManager {
    public static final int $stable;
    @NotNull
    public static final GlobalSnapshotManager INSTANCE;
    public static final AtomicBoolean a;
    public static final AtomicBoolean b;

    static {
        GlobalSnapshotManager.INSTANCE = new GlobalSnapshotManager();  // 初始化器: Ljava/lang/Object;-><init>()V
        GlobalSnapshotManager.a = new AtomicBoolean(false);
        GlobalSnapshotManager.b = new AtomicBoolean(false);
        GlobalSnapshotManager.$stable = 8;
    }

    public final void ensureStarted() {
        if(GlobalSnapshotManager.a.compareAndSet(false, true)) {
            Channel channel0 = ChannelKt.Channel$default(1, null, null, 6, null);
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.Companion.getMain()), null, null, new a1(channel0, null), 3, null);
            g1 g10 = new g1(channel0, 8);
            Snapshot.Companion.registerGlobalWriteObserver(g10);
        }
    }
}

