package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0013\u001A\u00020\u0003H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/runtime/HotReloader$Companion", "", "context", "", "simulateHotReload$runtime_release", "(Ljava/lang/Object;)V", "simulateHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HotReloader.Companion {
    public HotReloader.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @TestOnly
    public final void clearErrors$runtime_release() {
        Recomposer.Companion.clearErrors$runtime_release();
    }

    @NotNull
    @TestOnly
    public final List getCurrentErrors$runtime_release() {
        return Recomposer.Companion.getCurrentErrors$runtime_release();
    }

    @TestOnly
    public final void invalidateGroupsWithKey$runtime_release(int v) {
        Recomposer.Companion.invalidateGroupsWithKey$runtime_release(v);
    }

    @TestOnly
    public final void simulateHotReload$runtime_release(@NotNull Object object0) {
        Object object1 = Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(object1);
    }
}

