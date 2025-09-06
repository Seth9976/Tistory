package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001A\u0004\u0018\u00010\u00032\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0018\u0010\u0012\u001A\u0006\u0012\u0002\b\u00030\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/ThreadContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/snapshots/Snapshot;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotContextElementImpl implements SnapshotContextElement, ThreadContextElement {
    public static final int $stable = 8;
    public final Snapshot a;

    public SnapshotContextElementImpl(@NotNull Snapshot snapshot0) {
        this.a = snapshot0;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public Object fold(Object object0, @NotNull Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public Key getKey() {
        return SnapshotContextElement.Key;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    public void restoreThreadContext(@NotNull CoroutineContext coroutineContext0, @Nullable Snapshot snapshot0) {
        this.a.unsafeLeave(snapshot0);
    }

    @Override  // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext coroutineContext0, Object object0) {
        this.restoreThreadContext(coroutineContext0, ((Snapshot)object0));
    }

    @Nullable
    public Snapshot updateThreadContext(@NotNull CoroutineContext coroutineContext0) {
        return this.a.unsafeEnter();
    }

    @Override  // kotlinx.coroutines.ThreadContextElement
    public Object updateThreadContext(CoroutineContext coroutineContext0) {
        return this.updateThreadContext(coroutineContext0);
    }
}

