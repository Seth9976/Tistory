package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1", "Landroidx/compose/runtime/DerivedStateObserver;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "", "start", "(Landroidx/compose/runtime/DerivedState;)V", "done", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotStateObserver.ObservedScopeMap.derivedStateObserver.1 implements DerivedStateObserver {
    public final d a;

    public SnapshotStateObserver.ObservedScopeMap.derivedStateObserver.1(d d0) {
        this.a = d0;
    }

    @Override  // androidx.compose.runtime.DerivedStateObserver
    public void done(@NotNull DerivedState derivedState0) {
        --this.a.j;
    }

    @Override  // androidx.compose.runtime.DerivedStateObserver
    public void start(@NotNull DerivedState derivedState0) {
        ++this.a.j;
    }
}

